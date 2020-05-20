package com.mvc.demo.controller;

import org.springframework.stereotype.Controller;
import org.apache.log4j.Logger;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    protected Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping("/home.do")
    public String index(Model model) throws Exception{

        logger.info(this.getClass().getName()+"- index Called!!");
        logger.debug(this.getClass().getName()+"- index Called!!");
        System.out.println("SYSOUT - INDEX CALLED!!");

        return "home";
    }

    @RequestMapping("/main.do")
    public String main(Model model) throws Exception{

        logger.info(this.getClass().getName()+"- main Called!!");
        System.out.println("SYSOUT - MAIN CALLED!!");

        return "main";
    }

}
