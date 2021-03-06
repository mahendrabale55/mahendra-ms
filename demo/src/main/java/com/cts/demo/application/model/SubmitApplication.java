package com.cts.demo.application.model;

import java.util.Date;

import javax.persistence.Column;

import com.fasterxml.jackson.databind.JsonNode;



public class SubmitApplication {
	
    private int id;
	
    private String status;

    private String tmg_id;
     
	
	  private String created_at;
	  
	  
	  private String submitted_at;
	 
 
    private String app_filing_entity;
    
 
    private int transaction_number;
     

    private int subscriber_id;
    
    private JsonNode jsonPayload;
   
  
   


	public JsonNode getJsonPayload() {
	return jsonPayload;
}


public void setJsonPayload(JsonNode jsonPayload) {
	this.jsonPayload = jsonPayload;
}


	public String getApp_filing_entity() {
		return app_filing_entity;
	}


	public void setApp_filing_entity(String app_filing_entity) {
		this.app_filing_entity = app_filing_entity;
	}


	public int getTransaction_number() {
		return transaction_number;
	}


	public void setTransaction_number(int transaction_number) {
		this.transaction_number = transaction_number;
	}


	public int getSubscriber_id() {
		return subscriber_id;
	}


	public void setSubscriber_id(int subscriber_id) {
		this.subscriber_id = subscriber_id;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getTmg_id() {
		return tmg_id;
	}


	public void setTmg_id(String tmg_id) {
		this.tmg_id = tmg_id;
	}


	public String getCreated_at() {
		return created_at;
	}


	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}


	public String getSubmitted_at() {
		return submitted_at;
	}


	public void setSubmitted_at(String submitted_at) {
		this.submitted_at = submitted_at;
	}


	


	

	

	/*
	 * public Date getCreated_at() { return created_at; }
	 * 
	 * 
	 * public void setCreated_at(Date created_at) { this.created_at = created_at; }
	 * 
	 * 
	 * public Date getSubmitted_at() { return Submitted_at; }
	 */

	/*
	 * public void setSubmitted_at(Date submitted_at) { Submitted_at = submitted_at;
	 * }
	 */
    
    

}
