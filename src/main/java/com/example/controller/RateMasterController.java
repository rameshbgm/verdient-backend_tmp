package com.example.controller;

import java.util.List;

import com.example.models.request.RateMasterRequest;
import com.example.models.response.RateMasterResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.entity.RateMaster;
import com.example.entity.Registration;
import com.example.service.RateMasterService;
import com.example.service.RegistrationService;

@RestController
@RequestMapping("/api/v1")
public class RateMasterController {

	
	@Autowired
	private RateMasterService ratemasterservice;

    @PostMapping("/addRateMaster")
    public RateMasterResponse adduser(@RequestBody RateMasterRequest rateMasterRequest) {
    	return ratemasterservice.saveratemaster(rateMasterRequest);
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
