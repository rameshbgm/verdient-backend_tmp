package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Registration;
import com.example.repository.RegistrationRepository;

@Service
public class RegistrationService {
	@Autowired
  private RegistrationRepository registration_repository;

	public Registration saveuser(Registration user) {
		return registration_repository.save(user);
	}
	
	public List<Registration> saveusers(List<Registration> article) {
		return registration_repository.saveAll(article);
	}
	public List<Registration> getallusers() {
		return registration_repository.findAll();
	}
	public Registration getUserById(int id) {
 	return registration_repository.findById(id).orElse(null);
	}
//	public Registration getArticleByName(String name) {
//	 	return registration_repository.;
//		}
	public String deleteuser(int id) {
		registration_repository.deleteById(id);;
		 return "user removed id"+id;
	}
	public Registration updateuser (Registration user) {
	
		Registration existinguser = registration_repository.findById(user.getId()).orElse(null); 
		//existinguser.setEmail_id(user.getEmail_id()); 
	//	existinguser.setAddress(user.getAddress()); 
		
		return registration_repository.save(existinguser);
	}


}
