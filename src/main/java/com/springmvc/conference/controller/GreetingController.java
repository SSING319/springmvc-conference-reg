package com.springmvc.conference.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("thyme")
    public String greeting(Map<String, Object> model){
        model.put("message", "Hello thyme from sahil");
        return "thyme";          //this is going to look for the jsp page name greeting
    }

}
