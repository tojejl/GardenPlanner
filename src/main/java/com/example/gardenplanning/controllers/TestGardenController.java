package com.example.gardenplanning.controllers;

import com.example.gardenplanning.model.Plant;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;


@Controller
@RequestMapping("/test")
public class TestGardenController {


    private static ArrayList<Plant> plants = new ArrayList<>();

    public TestGardenController() {
        plants = new ArrayList<Plant>();
        //hardcoding adding plants to make sure the adding to the list works
        plants.add(new Plant("Basil"));
        plants.add(new Plant("Cucumber"));
    }


    //Request path: /test
    @RequestMapping(value = "")
    public String loadplants(Model model) {
        System.out.println("Plants Growing");

        model.addAttribute("plants", plants);
        model.addAttribute("count", "42");
        return "/test";
    }

    @RequestMapping("/new")
    public String addplants(Model model, @RequestParam String plantType){
        System.out.println("Adding plant: " + plantType);

        plants.add(new Plant(plantType));
        return "redirect:";
    }
}



    /*
    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String displayAddPlantForm(Model model){
        model.addAttribute("title", "Add Plant");
        return "test/adds";
    }

    @RequestMapping(value = "remove", method = RequestMethod.GET)
    public String displayRemovePlantForm(Model model) {
        model.addAttribute("plants", plants.keySet());
        model.addAttribute("title", "Remove Plants");
        return "test/removes";
    }

    public String processRemovePlantForm(@RequestParam ArrayList<String> plant) {

        for(String aPlant : plant) {
            plants.remove(aPlant);
        }

        return "redirect:";
    }

     */

