package com.example.JWTExample.service;


import com.example.JWTExample.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class UserService {
    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "Pankaj Telange", "telangepankaj199@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "Pavan Telange", "telangepavan199@gmail.com"));
    }

    public List<User> getUser()
    {
        return this.store;
    }
}
