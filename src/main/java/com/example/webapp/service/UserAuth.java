package com.example.webapp.service;

import com.example.webapp.model.User_Authentication;

import java.util.List;

public interface UserAuth {

    public User_Authentication savedUser(User_Authentication user_authentication);

    public List<User_Authentication> getAllUser();
}
