package com.mvc.demo.controller;

import com.mvc.demo.service.UserService;
import com.mvc.demo.vo.User;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Controller
public class UserController {

    protected Logger logger = Logger.getLogger(this.getClass());

    @Autowired
    private UserService userService;

    @RequestMapping(value ="/user/login")
    public ModelAndView logIn(Model model, HttpServletRequest request) throws Exception{

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("user/logIn");

        String getRemoteAddr = request.getRemoteAddr();
        String getRequestURI = request.getRequestURI();
        String getRequestedSessionId = request.getRequestedSessionId();
        String getRemoteHost = request.getRemoteHost();
        String getRemoteUser = request.getRemoteUser();
        int getRemotePort = request.getRemotePort();

        String test = "auto deploy test!";

        modelAndView.addObject("Addr",getRemoteAddr);
        modelAndView.addObject("URI",getRequestURI);
        modelAndView.addObject("SessionId",getRequestedSessionId);
        modelAndView.addObject("Host",getRemoteHost);
        modelAndView.addObject("User",getRemoteUser);
        modelAndView.addObject("Port",getRemotePort);
        modelAndView.addObject("test",test);


        logger.info("로그인 화면 접근하였습니다!!");
        System.out.println("로그인 화면 접근하였습니다!!");

        logger.info(String.format("Addr [%s]" +
                "\r\nURI [%s]" +
                "\r\nSessionID [%s]" +
                "\r\nHost [%s]" +
                "\r\nUSer [%s]" +
                "\r\nPort [%d]" +
                "\r\ntest [%s]",
                getRemoteAddr,getRequestURI, getRequestedSessionId, getRemoteHost, getRemoteUser,getRemotePort,test));

        return modelAndView;
    }

    @RequestMapping(value = "/user/signup", method = RequestMethod.GET)
    public String signUp() {
        logger.info("SIGN UP CALLED - GET!");

        return "user/signUp";
    }

    @RequestMapping(value = "/user/signup", method = RequestMethod.POST)
    public ModelAndView signUp(HttpServletRequest request) throws Exception{
        logger.info("SIGN UP CALLED - POST!");

        ModelAndView modelAndView = new ModelAndView();

        String email = request.getParameter("email");
        String mobile = request.getParameter("mobile");
        String name = request.getParameter("name");
        String passwd = request.getParameter("passwd");

        User user = new User(email,passwd,name,mobile);


        logger.info(String.format("PARAM CHECK\r\n" +
                "email : [%s]\r\n" +
                "passwd [%s]\r\n" +
                "name [%s]\r\n" +
                "mobile ][%s]",email,passwd,name,mobile));

        int result = userService.insert(user);

        if(result == 1){
            logger.info(String.format("SIGN UP SUCCESS - USER [%s]",name));
            modelAndView.addObject("result",1);
            modelAndView.setViewName("user/welcome");

            modelAndView.addObject("name",name);
            modelAndView.addObject("passwd",passwd);
            modelAndView.addObject("email",email);
            modelAndView.addObject("mobile",mobile);

        }else if(result == -1){
            logger.info(String.format("SIGN UP FAIL - USER [%s]",name));
            modelAndView.addObject("result",-1);
            modelAndView.setViewName("user/login");
        }else{
            logger.info(String.format("SIGN UP UNKNOWN ISSUE - USER [%s]",name));
            modelAndView.addObject("result",0);
            modelAndView.setViewName("user/login");
        }

        return modelAndView;
    }
}
