package com.example.gardenplanning.controllers;

import com.example.gardenplanning.dao.PlantDAO;
import com.example.gardenplanning.model.Plant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class GardenController {

   @Autowired
    private PlantDAO plantDAO;

    //Request path: /plants
    @RequestMapping(value="/plants", method=GET)
    public String listPlants(Model model){
        List<Plant> plants = plantDAO.getAll();
        model.addAttribute(("plants"), plants);
        model.addAttribute("count", plants.size());

        return "plants.html";
    }

    @RequestMapping(value="/new")
    public String loadNewPlantsPage() {return "plantsNew.html"; }

    @RequestMapping(value="/addPlant", method=POST)
    public String saveAddNewPlant(Model model, @RequestParam String plantName,
                                  @RequestParam String startSeedlingsIndoor,
                                 @RequestParam String sowSeedsDirectly,
                                  @RequestParam String transplantIndoorSeedlings,
                                  @RequestParam String growingPeriod,
                                  @RequestParam String harvestPeriod) {

        model.addAttribute("plantName", plantName);
        model.addAttribute("startSeedlingsIndoor", startSeedlingsIndoor);
        model.addAttribute("sowSeedsDirectly", sowSeedsDirectly);
        model.addAttribute("transplantIndoorSeedlings", transplantIndoorSeedlings);
        model.addAttribute("growingPeriod", growingPeriod);
        model.addAttribute("harvestPeriod", harvestPeriod);

        System.out.println("Saved it..." + plantName + " " + " " + startSeedlingsIndoor +
                " " + sowSeedsDirectly + " " + transplantIndoorSeedlings + " "
                + growingPeriod + " " + harvestPeriod);;

        plantDAO.addPlant(new Plant(-1, plantName, startSeedlingsIndoor, sowSeedsDirectly,
                transplantIndoorSeedlings, growingPeriod, harvestPeriod));

        return confirmSavedJob(model);
    }

    @RequestMapping(value="/addPlant", method=GET)
    public String confirmSavedJob(Model model) {
        List<Plant> plants = plantDAO.getAll();
        model.addAttribute("plants", plants);
        model.addAttribute("count", plants.size());

        return "result.html";
    }

    @RequestMapping(value="/edit/{id}", method=GET)
    public String viewPlant(Model model, @PathVariable int id) {
        Plant plant = plantDAO.findById(id);
        model.addAttribute("plant", plant);

        return "plantsEdit.html";
   }

   @RequestMapping(value="/edit/{id}", method=POST)
   public String editPlant(@ModelAttribute Plant plant, @PathVariable int id) {
     plantDAO.updatePlant(id, plant);
     return "redirect:/";
   }

}










