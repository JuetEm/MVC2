package com.mvc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.apache.log4j.Logger;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HwaSunController {

    protected Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping("/user/hwasun")
    public String hwasun(HttpServletRequest request){

        String whasun = request.getParameter("whasun");
        logger.info(String.format("화선 울린다!!! [%s]", whasun));

        return "user/hwaSun";
    }
}
