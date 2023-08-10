package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Registration;
import com.example.service.Registration_Service;
@CrossOrigin(origins="http://localhost:3000/")
@RestController
public class Registration_Controller {

	@Autowired
	private Registration_Service userservice;

    @PostMapping("/adduser")
    public Registration adduser(@RequestBody Registration user) {
    	return userservice.saveuser(user);
    }
    @PostMapping("/addusers")
    public List<Registration> addArticles(@RequestBody List<Registration> users) {
    	return userservice.saveusers(users);
    }
    @GetMapping("/getallusers")
    public List<Registration> findAllUser() {
    	return userservice.getallusers();
    }
    @GetMapping("/getuserbyid/{id}")
    public Registration findUserById(@PathVariable int id) {
    	return userservice.getUserById(id);
    }
//    @GetMapping("/getbyname/{name}")
//    public Article findArticleByName(@PathVariable String name) {
//    	return articleservice.getArticleByName(name);
//    }
    

    @PutMapping("/updateuser")
    public Registration updateuser(@RequestBody Registration user) {
    	return userservice.updateuser(user);
    }
    @DeleteMapping("/deleteuser/{id}")
    public String deleteuser(@PathVariable int id ) {
    	return userservice.deleteuser(id);
    }
}
