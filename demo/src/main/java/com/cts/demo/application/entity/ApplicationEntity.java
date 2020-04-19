package com.cts.demo.application.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.TypeDef;

import com.fasterxml.jackson.databind.JsonNode;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;

@Entity
@Table(name = "application")
@TypeDef(
	    typeClass = JsonBinaryType.class,
	    defaultForType = JsonNode.class
	)
public class ApplicationEntity {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name="status")
    private String status;
     
    @Column(name="tmg_id")
    private String tmg_id;
    
    
    @Column(name="created_at")
    private java.sql.Date created_at;
 
    
    
    @Column(name="submitted_at")
    private java.sql.Date Submitted_at;
	
    
   
     
    @Column(name="app_filing_entity")
    private String app_filing_entity;
    
    @Column(name="transaction_number")
    private int transaction_number;
     
    @Column(name="subscriber_id")
    private int subscriber_id;
   
    
    @Column(columnDefinition = "jsonb") 
    private JsonNode json_Payload;
	 

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

	public Date getCreated_at() {
		return created_at;
	}

	
	public String getApp_filing_entity() {
		return app_filing_entity;
	}

	public void setApp_filing_entity(String app_filing_entity) {
		this.app_filing_entity = app_filing_entity;
	}

	

	public java.sql.Date getSubmitted_at() {
		return Submitted_at;
	}

	public void setSubmitted_at(java.sql.Date submitted_at) {
		Submitted_at = submitted_at;
	}

	public void setCreated_at(java.sql.Date created_at) {
		this.created_at = created_at;
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

	
	  public JsonNode getJson_Payload() { return json_Payload; }
	  
	  public void setJson_Payload(JsonNode json_Payload) { this.json_Payload =
	  json_Payload; }
	 

	
	

}
