package com.example.webapp.service;

import com.example.webapp.model.User_Authentication;
import com.example.webapp.repo.UserRepo;
import com.example.webapp.service.UserAuth;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAuthImplementation implements UserAuth {

    @Autowired
    private UserRepo userRepo;


    @Override
    public User_Authentication savedUser(User_Authentication userAuth) {
        return userRepo.save(userAuth);
    }

    @Override
    public List<User_Authentication> getAllUser() {
        return userRepo.findAll();
    }


}

