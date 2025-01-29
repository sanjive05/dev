package com.infosys.test;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import com.sanjive.service.Service;
public class Test {
	private static final Logger logger = Logger.getLogger(Test.class.getName());
	private Service service = new Service();

	void addTest() {
		int actualSum=service.add(4, 5);
		int expectedSum = 9;
		
		if(expectedSum==actualSum) {
			logger.info("addtion test is passed...");
		}
		else {
			logger.info("Additon test failed...");
		}
	}
	
	

}
