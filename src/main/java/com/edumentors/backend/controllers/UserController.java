package com.edumentors.backend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
   


    @RequestMapping("/profile")
    public String userDashboard(){
        return "users/user-dashboard";
    }

    
}
