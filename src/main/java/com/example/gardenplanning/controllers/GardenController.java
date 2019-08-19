package com.example.gardenplanning.controllers;

import com.example.gardenplanning.model.Plant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("plants")
public class GardenController {



    private static ArrayList<Plant> plants = new ArrayList<>();

    public GardenController() {
        plants = new ArrayList<Plant>();
        plants.add(new Plant("Basil"));
        plants.add(new Plant("Cucumber"));
    }

    // Request path: /plants
    @RequestMapping(value = "")
    public String loadplants(Model model) {
        System.out.println("Loading Plants");

        model.addAttribute("plants", plants);
        model.addAttribute("count", 42);
        return "plants";
    }

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddPlantForm(Model model) {
        model.addAttribute("title", "Add Plant");
        return "plant/add";

    }
    //@RequestMapping(value = "add", method = RequestMethod.POST)
    //public String processAddPlantForm(RequestParam Plant plantType) {

    //}
}


// redirect adds plants to the list using the form on the welcome to Garden Planning page.
    /*@RequestMapping("new")
    public String addplants(Model model, @RequestParam String plantType) {
        System.out.println("Adding plant: " + plantType);

        plants.add(new Plant(plantType));
        return "redirect:";

    }
    */
    //working to get this up and running, probably should watch the videos one more time
//@RequestMapping(value = "add", method = RequestMethod.GET)
    //public String processAddPlantForm(Model model) {
      //  model.addAttribute("plants", "Add Plant");
       // return "plant/add";
    //}

