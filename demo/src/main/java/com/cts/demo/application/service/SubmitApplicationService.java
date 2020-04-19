package com.cts.demo.application.service;



import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		 java.util.Date date=null;
		 java.util.Date date1=null;
		try {
			date = sdf.parse(submitApplication.getCreated_at());
			date1 = sdf.parse(submitApplication.getSubmitted_at());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		
		ApplicationEntity entity = new ApplicationEntity();
		entity.setApp_filing_entity(submitApplication.getApp_filing_entity());
		entity.setCreated_at(new Date(date.getTime()));
		entity.setId(submitApplication.getId());
		entity.setSubmitted_at(new Date(date1.getTime()));
		entity.setStatus(submitApplication.getStatus());
		entity.setSubscriber_id(submitApplication.getSubscriber_id());
		entity.setTmg_id(submitApplication.getTmg_id());
		entity.setTransaction_number(submitApplication.getTransaction_number()); 
		entity.setJson_Payload(submitApplication.getJsonPayload());
		System.out.println("entity"+entity.getId());
		SubmitApplicationRepository.save(entity);
		
		
	}
}
