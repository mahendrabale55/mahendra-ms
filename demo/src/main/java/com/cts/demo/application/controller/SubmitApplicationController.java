
  
package com.cts.demo.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.demo.application.model.SubmitApplication;
import com.cts.demo.application.response.Response;
import com.cts.demo.application.service.SubmitApplicationService;

@RestController
@RequestMapping("/application/individual")
public class SubmitApplicationController {
	
@Autowired
public	SubmitApplicationService  submitApplicationService;
	@PostMapping
	public ResponseEntity<Response>  saveApplication(@RequestBody SubmitApplication  submitApplication){
		
		System.out.println("submitApplication"+submitApplication.getApp_filing_entity());
		submitApplicationService.saveApplication(submitApplication);
		return ResponseEntity.ok(new Response("true"));
		
		
	}

}
