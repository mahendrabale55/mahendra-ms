package com.cts.demo.application.response;

import java.io.Serializable;


public class Response  implements Serializable{

	
	private String status;
	
	private String success;
	private String errorDetails;
	
	private String code;
	
	private static final long serialVersionUID = -6477717159118343660L;

	public Response(String success) {
		this.success = success;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSuccess() {
		return success;
	}

	public void setSuccess(String success) {
		this.success = success;
	}

	public String getErrorDetails() {
		return errorDetails;
	}

	public void setErrorDetails(String errorDetails) {
		this.errorDetails = errorDetails;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	
}