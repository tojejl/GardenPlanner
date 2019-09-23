package com.example.gardenplanning.controllers;


import com.example.gardenplanning.dao.UserDAO;
import com.example.gardenplanning.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("user")
    public class UserController {

    @Autowired
    private UserDAO UserDAO;


    @RequestMapping(value = "", method= RequestMethod.GET)
    public String userLogin(Model model) {
        List<User> userList = UserDAO.getAll();
        model.addAttribute("title", "User Login");
        model.addAttribute("users", userList);

        return "userLogIn.html";
    }

    @RequestMapping(value = "", method=RequestMethod.POST)
    public String loginPost(Model model, @RequestParam String username, @RequestParam String password) {
        List<User> userList = UserDAO.getAll();
        model.addAttribute("users", userList);
        model.addAttribute("title", "User Login");
        String credential = UserDAO.userLogin(username, password);
        if(credential.equals("login")) {
            model.addAttribute("Error", "Error, could not log in");
        }
        return credential;
    }

    @RequestMapping(value="landing")
    public String landing(Model model) {
        model.addAttribute("title", "Welcome");
        return "index.html";
    }

     @RequestMapping(value= "signup", method=RequestMethod.GET)
     public String signupForm(Model model){
         model.addAttribute("title", "Sign Up");
         return "signup";
    }

    @RequestMapping(value="signup", method=RequestMethod.POST)
    public String processSignupForm(@RequestParam String username, @RequestParam String firstName,
                                    @RequestParam String lastName, @RequestParam String email,
                                    @RequestParam String password){
       User user = new User(username, firstName, lastName, email, password);
       UserDAO.addUser(user);
       return "redirect:";

    }


}

