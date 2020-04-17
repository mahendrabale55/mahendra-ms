package com.cts.demo.application.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.demo.application.entity.ApplicationEntity;
import com.cts.demo.application.model.SubmitApplication;

@Service
public class SubmitApplicationService {
	
	
	@Autowired
	public com.cts.demo.application.repository.SubmitApplicationRepository  SubmitApplicationRepository;

	@Transactional
	public  void  saveApplication(SubmitApplication submitApplication) {
		
		ApplicationEntity entity = new ApplicationEntity();
		entity.setApp_filing_entity(submitApplication.getApp_filing_entity());
		entity.setCreated_at(submitApplication.getCreated_at());
		entity.setId(submitApplication.getId());
		entity.setSubmitted_at(submitApplication.getSubmitted_at());
		entity.setSubscriber_id(submitApplication.getSubscriber_id());
		entity.setTmg_id(submitApplication.getTmg_id());
		entity.setTransaction_number(submitApplication.getTransaction_number()); 
		entity.setJsonPayload(submitApplication.getJsonPayload());
		
		SubmitApplicationRepository.save(entity);
		
		
	}
}
