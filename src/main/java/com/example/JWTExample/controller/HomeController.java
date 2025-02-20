package com.example.JWTExample.controller;


import com.example.JWTExample.service.UserService;
import com.example.JWTExample.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;
    @GetMapping("/user")
    public List<User> getUser()
    {
        System.out.println("getting users");
        return this.userService.getUser();
    }


    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal)
    {
        return  principal.getName();
    }
}
