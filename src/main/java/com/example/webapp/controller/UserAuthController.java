package com.example.webapp.controller;

import com.example.webapp.model.User_Authentication;
import com.example.webapp.service.UserAuth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user_authentication")
@CrossOrigin(origins = "*")
public class UserAuthController {
    @Autowired
    private UserAuth userAuth;

    @PostMapping("/add")
    public String add(@RequestBody User_Authentication user_authentication){
        userAuth.savedUser(user_authentication);
        return String.format("Hi, %s", user_authentication.getEmail());
    }

    @GetMapping("/getAll")
    public List<User_Authentication> list(){
        return userAuth.getAllUser();
    }
}
