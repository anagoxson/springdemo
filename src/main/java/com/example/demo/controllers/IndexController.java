package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

    @RequestMapping({ "/", "/index" })
    public ModelAndView get(ModelAndView mav) {
        mav.addObject("target", "Thymeleaf");
        mav.setViewName("index");
        return mav;
    }
}
