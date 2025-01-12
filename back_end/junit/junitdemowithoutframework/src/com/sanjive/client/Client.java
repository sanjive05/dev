package com.sanjive.client;

import java.util.logging.Logger;

import com.sanjive.service.Service;

public class Client {

	private static final Logger logger = Logger.getLogger(Client.class.getName());
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Service service = new Service();
		int result =service.add(2, 4);
		logger.info("Logger file created...");
		logger.info("Expected result :"+6);
		logger.info("Actual result :"+result);
		

	}

}
