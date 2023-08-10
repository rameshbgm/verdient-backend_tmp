package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Rate_Master;
import com.example.entity.Registration;
import com.example.repository.Rate_Master_Repository;
import com.example.repository.Registration_Repository;
@Service
public class Rate_Master_Service {

	
      @Autowired
	  private Rate_Master_Repository rate_master_repository;

		public Rate_Master saveratemaster(Rate_Master rate_master) {
			return rate_master_repository.save(rate_master);
		}
		
		public List<Rate_Master> saveratemasters(List<Rate_Master> rate_master) {
			return rate_master_repository.saveAll(rate_master);
		}
		public List<Rate_Master> getallratemaster() {
			return rate_master_repository.findAll();
		}
		public Rate_Master getRateMasterById(int id) {
	 	return rate_master_repository.findById(id).orElse(null);
		}
//		public Registration getArticleByName(String name) {
//		 	return registration_repository.;
//			}
		public String deleteRateMaster(int id) {
			rate_master_repository.deleteById(id);;
			 return "user removed id"+id;
		}
		public Rate_Master updateratemaster (Rate_Master ratemaster) {
		
			Rate_Master existingratemaster = rate_master_repository.findById(ratemaster.getId()).orElse(null); 
			existingratemaster.setRemark(ratemaster.getRemark()); 
			existingratemaster.setAudit(ratemaster.getAudit());; 
			
			return rate_master_repository.save(existingratemaster);
		}
	
}
