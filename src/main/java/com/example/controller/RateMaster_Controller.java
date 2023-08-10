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

import com.example.entity.Rate_Master;
import com.example.entity.Registration;
import com.example.service.Rate_Master_Service;
import com.example.service.Registration_Service;

@RestController
public class RateMaster_Controller {

	
	@Autowired
	private Rate_Master_Service ratemasterservice;

    @PostMapping("/addratemaster")
    public Rate_Master adduser(@RequestBody Rate_Master ratemaster) {
    	return ratemasterservice.saveratemaster(ratemaster);
    }
    @PostMapping("/addratemasters")
    public List<Rate_Master> addArticles(@RequestBody List<Rate_Master> ratemaster) {
    	return ratemasterservice.saveratemasters(ratemaster);
    }
    @GetMapping("/getallratemaster")
    public List<Rate_Master> findAllUser() {
    	return ratemasterservice.getallratemaster();
    }
    @GetMapping("/getratemasterbyid/{id}")
    public Rate_Master findRateMasterById(@PathVariable int id) {
    	System.out.println(id);
    	return ratemasterservice.getRateMasterById(id);
    }
//    @GetMapping("/getbyname/{name}")
//    public Article findArticleByName(@PathVariable String name) {
//    	return articleservice.getArticleByName(name);
//    }
    

    @PutMapping("/updateratemaster")
    public Rate_Master updateuser(@RequestBody Rate_Master ratemaster) {
    	return ratemasterservice.updateratemaster(ratemaster);
    }
    @DeleteMapping("/deleteratemaster/{id}")
    public String deleteuser(@PathVariable int id ) {
    	return ratemasterservice.deleteRateMaster(id);
    }
}
