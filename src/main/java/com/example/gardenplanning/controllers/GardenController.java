package com.example.gardenplanning.controllers;

import com.example.gardenplanning.dao.PlantDAO;
import com.example.gardenplanning.model.Plant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

    @Controller
//@RequestMapping("/plants")
//@RequestMapping("/display")
    public class GardenController {

        @Autowired
        private PlantDAO plantDAO;

    //Request path: /plants
    @RequestMapping(value = "/plants", method = GET)
    //@GetMapping()
    public String listPlants(Model model) {
        List<Plant> plants = plantDAO.getAll();
        model.addAttribute(("plants"), plants);

        model.addAttribute("count", plants.size());

        return "plants.html";
    }

    @RequestMapping(value = "/about")
    public String loadIndexPage() {
        return "about.html";
    }

    @GetMapping("/new")
    public String loadNewPlantsPage() {
        return "plantsNew.html";
    }

    @RequestMapping(value = "/addPlant", method = POST)
    public String saveAddNewPlant(Model model, @RequestParam String plantName,
                                  @RequestParam String startSeedlingsIndoor,
                                  @RequestParam String sowSeedsDirectly,
                                  @RequestParam String transplantIndoorSeedlings,
                                  @RequestParam String growingPeriod,
                                  @RequestParam String harvestPeriod,
                                  @RequestParam String plantNotes,
                                  @RequestParam String keyword) {

        model.addAttribute("plantName", plantName);
        model.addAttribute("startSeedlingsIndoor", startSeedlingsIndoor);
        model.addAttribute("sowSeedsDirectly", sowSeedsDirectly);
        model.addAttribute("transplantIndoorSeedlings", transplantIndoorSeedlings);
        model.addAttribute("growingPeriod", growingPeriod);
        model.addAttribute("harvestPeriod", harvestPeriod);
        model.addAttribute("plantNotes", plantNotes);
        model.addAttribute("keyword", keyword);


        System.out.println("Saved it..." + plantName + " " + " " + startSeedlingsIndoor +
                " " + sowSeedsDirectly + " " + transplantIndoorSeedlings + " "
                + growingPeriod + " " + harvestPeriod + " " + plantNotes + " " + keyword);

        plantDAO.addPlant(new Plant(-1, plantName, startSeedlingsIndoor, sowSeedsDirectly,
                transplantIndoorSeedlings, growingPeriod, harvestPeriod, plantNotes, keyword));

        return confirmSavedPlant(model);
    }

    @RequestMapping(value = "/addPlant", method = GET)
    public String confirmSavedPlant(Model model) {
        List<Plant> plants = plantDAO.getAll();
        model.addAttribute("plants", plants);
        model.addAttribute("count", plants.size());

        return "result.html";
    }

    @RequestMapping(value = "/edit/{id}", method = GET)
    public String viewPlant(Model model, @PathVariable int id) {
        Plant plant = plantDAO.findById(id);
        model.addAttribute("plant", plant);

        return "plantsEdit.html";
    }


    @PostMapping("/edit/{id}")
    public String editPlant(@ModelAttribute Plant plant, @PathVariable int id) {
        plantDAO.updatePlant(id, plant);
        return "redirect:/plants";
    }


    @RequestMapping(value = "search", method = RequestMethod.GET)
    public String search(Model model, @RequestParam(value = "keyword", required = false) String keyword) {
        model.addAttribute("keyword", keyword);
        List<Plant> plants = plantDAO.findByStringLowerCase(keyword);
        model.addAttribute("plants", plants);
        return "search";

    }
}










