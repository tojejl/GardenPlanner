package com.example.gardenplanning.controllers;

import com.example.gardenplanning.dao.PlantDAO;
import com.example.gardenplanning.model.Plant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Controller
@RequestMapping("plants")
public class GardenController {

   @Autowired
    private PlantDAO plantDAO;

    //Request path: /plants
    @GetMapping()
    public String listPlants(Model model){
        List<Plant> plants = plantDAO.getAll();
        model.addAttribute(("plants"), plants);

        model.addAttribute("count", plants.size());
        return "plants.html";
    }

    @GetMapping("/new")
    public String newPlantGet() {return "redirect:"; }

    @PostMapping("/new")
    public String saveAddNewPlant(@RequestParam String plantName,
                                  @RequestParam String startSeedlingsIndoor,
                                  @RequestParam String sowSeedsDirectly,
                                  @RequestParam String transplantIndoorSeedlings,
                                  @RequestParam String growingPeriod,
                                  @RequestParam String harvestPeriod) {

        System.out.println("Saved it..." + plantName + " " + " " + startSeedlingsIndoor +
                " " + sowSeedsDirectly + " " + transplantIndoorSeedlings + " "
                + growingPeriod + " " + harvestPeriod);;

        plantDAO.addPlant(new Plant(-1, plantName, startSeedlingsIndoor, sowSeedsDirectly,
                transplantIndoorSeedlings, growingPeriod, harvestPeriod));

        return "redirect:";
    }

    @GetMapping("/{id}/edit")
    public String viewPlant(Model model, @PathVariable int id) {
        Plant plant = plantDAO.findById(id);
        model.addAttribute("plant", plant);

        return "plant.html";
   }

   @PostMapping("/{id}/edit")
   public String editPlant(@ModelAttribute Plant plant, @PathVariable int id) {
     plantDAO.updatePlant(id, plant);
     return "redirect:/plants";
   }

}










