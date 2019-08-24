package com.example.gardenplanning.controllers;


import com.example.gardenplanning.model.UserProfile;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
//@RequestMapping("")
    public class UserController {

    @GetMapping("/user")
    public String userForm(Model model) {

        model.addAttribute("UserProfile", new UserProfile());
        return "user";
    }

    @PostMapping("/user")
    public String userSubmit(@ModelAttribute UserProfile userProfile) {
        return "result";
    }

}

