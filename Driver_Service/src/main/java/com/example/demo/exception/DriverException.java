package com.example.demo.exception;

import java.util.Date;

public class DriverException {

	private Date timestamp;
	
	private String message;
	
	private String details;

	

	public DriverException() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DriverException(Date timestamp, String message, String details) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.details = details;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}
	
	
	
}
