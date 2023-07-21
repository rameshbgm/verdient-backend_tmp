package com.example.service;

import com.example.model.UserDtls;

public interface UserService {

	public UserDtls createUser(UserDtls userdetails); 
    public boolean checkEmail(String email);
}
