package com.example.gardenplanning.controllers;

import com.example.gardenplanning.model.Greeting;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller

public class GreetingController {

    @GetMapping("/greeting")
    public String greetingForm(Model model) {
        model.addAttribute("greeting", new Greeting());
        return "greeting";
    }

   // @PostMapping("/greeting")
    //public String greetingSubmit(@ModelAttribute Greeting goth) {
       // return "greetingresult";
    //}
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

