package com.example.gardenplanning.controllers;

import com.example.gardenplanning.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
@RequestMapping("user")
public class UserController {

    public static ArrayList<User> users;

    public UserController() {
        users = new ArrayList<User> ();
        users.add(new User("Byph", "Byph", "Corobb", "1111", "byph@jeditemple.org"));
        users.add(new User("Gungi", "Gungee", "Wookiee", "2222","gungi@jeditemple.org" ));
    }

    public String saveRegisterationData(Model model, @RequestParam String userName,
                                        @RequestParam String password,
                                        @RequestParam String firstName,
                                        @RequestParam String lastName,
                                        @RequestParam String email){
        model.addAttribute("userName", userName);
        model.addAttribute("password", password);
        model.addAttribute("firstName", firstName);
        model.addAttribute("lastName", lastName);
        model.addAttribute("email", email);

        System.out.println("Saving.... " + userName + " " + password+ " " + firstName+ " " + lastName+ " " + email+ " ");

        users.add(new User(userName, password, firstName, lastName, email));
        return"userInfo";
    }

}
