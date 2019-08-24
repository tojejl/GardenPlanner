package com.example.gardenplanning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WelcomeController {

    @RequestMapping(value = "about")
    @ResponseBody
    public String index(){
        return "Hello Welcome Page";
    }
}
