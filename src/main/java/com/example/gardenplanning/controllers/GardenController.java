package com.example.gardenplanning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("garden")
public class GardenController {

    @RequestMapping()

    public String loadGardenController() {
        return "index.html";
    }


}
