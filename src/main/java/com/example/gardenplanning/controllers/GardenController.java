package com.example.gardenplanning.controllers;


import com.example.gardenplanning.model.Plant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@Controller
@RequestMapping("/plants")
public class GardenController {

    private static ArrayList<Plant>plants = new ArrayList<>();

    public GardenController() {
        plants = new ArrayList<Plant>();
        plants.add(new Plant("Basil"));
        plants.add(new Plant("Cucumber"));
    }

    //Request path: /plants
@RequestMapping(value = "")
    public String loadPlants(Model model) {
        System.out.println("Loading Plants");

        model.addAttribute("plants", plants);
        model.addAttribute("count", 42);
        return "/plants";
    }

    @RequestMapping("/new")
    public String addPlants(Model model, @RequestParam String plantType) {
        System.out.println("Adding plant: " + plantType);

        plants.add(new Plant(plantType));
        return "redirect:";
    }
}





    /*
    private static ArrayList<Goth> goths = new ArrayList<>();


    public GothController() {
        goths = new ArrayList<Goth>();
        goths.add(new Goth("Helena"));
        goths.add(new Goth("Azraeal"));
    }

    //Request path: /goth
    @RequestMapping(value = "")
    public String loadgoths(Model model){
        System.out.println("Spooky stuff");

        model.addAttribute("goths", goths);
        model.addAttribute("count", 42);
        return "/goth";
    }

    @RequestMapping("/new")
    public String addgoths(Model model, @RequestParam String gothType) {
        System.out.println("Adding goths: " + gothType);

        goths.add(new Goth(gothType));
        return "redirect:";
    }

     */

