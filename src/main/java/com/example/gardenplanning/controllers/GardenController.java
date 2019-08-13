package com.example.gardenplanning.controllers;

import com.example.gardenplanning.model.Plant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("plants")
public class GardenController {

    private static List<Plant> plants;

    public GardenController() {
        plants = new ArrayList<Plant>();
        plants.add(new Plant("Basil"));
        plants.add(new Plant("Cucumber"));
    }

    @RequestMapping("")
    public String loadplants(Model model) {
        System.out.println("Loading Plants");

        model.addAttribute("plants", plants);
        model.addAttribute("count", 42);
        return "plants";
    }

    @RequestMapping("new")
    public String addplants(Model model, @RequestParam String plantType) {
        System.out.println("Adding plant: " + plantType);

        plants.add(new Plant(plantType));
        return "redirect:";

    }
}
