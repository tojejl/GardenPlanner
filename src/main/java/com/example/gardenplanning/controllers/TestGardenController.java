package com.example.gardenplanning.controllers;

import com.example.gardenplanning.model.Plant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;


@Controller
@RequestMapping("/experiment")
public class TestGardenController {


    private static ArrayList<Plant> plants = new ArrayList<>();

    public TestGardenController() {
        plants = new ArrayList<Plant>();
        //hardcoding adding plants to make sure the adding to the list works
        plants.add(new Plant("Basil"));
        plants.add(new Plant("Cucumber"));
    }

    //Request path:
    @RequestMapping(" ")
    public String loadIndex(Model model) {
        return "index";
    }


    //Request path: /experiment
    @RequestMapping(value = "")
    public String loadplants(Model model) {
        System.out.println("Plants Growing");

        model.addAttribute("plants", plants);
        model.addAttribute("count", "42");
        return "/experiment";
    }

    @RequestMapping("/new")
    public String addplants(Model model, @RequestParam String plantType){
        System.out.println("Adding plant: " + plantType);

        plants.add(new Plant(plantType));
        return "redirect:";
    }
}




