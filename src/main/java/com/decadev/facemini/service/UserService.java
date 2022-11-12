package com.decadev.facemini.service;

import com.decadev.facemini.dto.ResponseDTO;
import com.decadev.facemini.entity.User;


public interface UserService {
    ResponseDTO addUser(User user);

    ResponseDTO logInUser(User user);

}
