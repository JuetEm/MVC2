package com.mvc.demo.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ErrorController {

    protected Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping("/error_dev")
    public ModelAndView error(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("error/error_dev");

        System.out.println("");

        return modelAndView;
    }
}
