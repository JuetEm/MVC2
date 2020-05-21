package com.mvc.demo.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    protected Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping(value ="/user/login")
    public ModelAndView signUp(Model model, HttpServletRequest request) throws Exception{

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
}
