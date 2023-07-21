package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.UserDtls;
import com.example.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;
	
	@Override
	public UserDtls createUser(UserDtls userdetails) {
		return userRepo.save(userdetails);
	}

	@Override
	public boolean checkEmail(String email) {
		// TODO Auto-generated method stub
		
		return false;
	};
}
