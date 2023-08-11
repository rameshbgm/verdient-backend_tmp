package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.RateMaster;
import com.example.entity.Registration;
import com.example.service.RateMasterService;
import com.example.service.RegistrationService;

@RestController
public class RateMasterController {

	
	@Autowired
	private RateMasterService ratemasterservice;

    @PostMapping("/addratemaster")
    public RateMaster adduser(@RequestBody RateMaster ratemaster) {
    	return ratemasterservice.saveratemaster(ratemaster);
    }
    @PostMapping("/addratemasters")
    public List<RateMaster> addArticles(@RequestBody List<RateMaster> ratemaster) {
    	return ratemasterservice.saveratemasters(ratemaster);
    }
    @GetMapping("/getallratemaster")
    public List<RateMaster> findAllUser() {
    	return ratemasterservice.getallratemaster();
    }
    @GetMapping("/getratemasterbyid/{id}")
    public RateMaster findRateMasterById(@PathVariable int id) {
    	System.out.println(id);
    	return ratemasterservice.getRateMasterById(id);
    }
//    @GetMapping("/getbyname/{name}")
//    public Article findArticleByName(@PathVariable String name) {
//    	return articleservice.getArticleByName(name);
//    }
    

    @PutMapping("/updateratemaster")
    public RateMaster updateuser(@RequestBody RateMaster ratemaster) {
    	return ratemasterservice.updateratemaster(ratemaster);
    }
    @DeleteMapping("/deleteratemaster/{id}")
    public String deleteuser(@PathVariable int id ) {
    	return ratemasterservice.deleteRateMaster(id);
    }
}
