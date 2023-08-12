package com.example.service;

import java.util.List;

import com.example.models.request.RateMasterRequest;
import com.example.models.response.RateMasterResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.RateMaster;
import com.example.entity.Registration;
import com.example.repository.RateMasterRepository;
import com.example.repository.RegistrationRepository;
@Service
public class RateMasterService {

	
      @Autowired
	  private RateMasterRepository rate_master_repository;

		public RateMasterResponse saveratemaster(RateMasterRequest rateMasterRequest) {
			// convert RateMasterRequest to RateMaster Entity and save
			RateMaster rate_master =new RateMaster();

			RateMaster rateMaster =  rate_master_repository.save(rate_master);

			// convert  RateMaster Entity  to RateMasterResponse  and return
			RateMasterResponse response = new RateMasterResponse();
			return response;
		}
		
		public List<RateMaster> saveratemasters(List<RateMaster> rate_master) {
			return rate_master_repository.saveAll(rate_master);
		}
		public List<RateMaster> getallratemaster() {
			return rate_master_repository.findAll();
		}
		public RateMaster getRateMasterById(int id) {
	 	return rate_master_repository.findById(id).orElse(null);
		}
//		public Registration getArticleByName(String name) {
//		 	return registration_repository.;
//			}
		public String deleteRateMaster(int id) {
			rate_master_repository.deleteById(id);;
			 return "user removed id"+id;
		}
		public RateMaster updateratemaster (RateMaster ratemaster) {
		
			RateMaster existingratemaster = rate_master_repository.findById(ratemaster.getId()).orElse(null); 
			existingratemaster.setRemark(ratemaster.getRemark()); 
			existingratemaster.setAudit(ratemaster.getAudit());; 
			
			return rate_master_repository.save(existingratemaster);
		}
	
}
