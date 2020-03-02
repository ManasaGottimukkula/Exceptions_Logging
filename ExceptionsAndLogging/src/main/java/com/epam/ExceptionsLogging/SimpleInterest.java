package com.epam.ExceptionsLogging;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SimpleInterest {
	private static final Logger LOGGER = LogManager.getLogger(SimpleInterest.class);
	public static void calculateInterest() {
		Scanner sc = new Scanner(System.in);
		LOGGER.error("Enter the principle amount: ");
		try {
		double prAmount = sc.nextDouble();
		LOGGER.error("Enter the time period: ");
		double timePeriod = sc.nextDouble();
		LOGGER.error("Enter the rate of Interest: ");
		double interestRate = sc.nextDouble();
		double simpInt = (prAmount * timePeriod * interestRate) / 100;
		double cmpInt = (prAmount * Math.pow(1 + (interestRate / 100), timePeriod)) - prAmount;
		LOGGER.error("The simple interest = "+ simpInt + "Rs" );
		LOGGER.error("The compound interest = " + cmpInt+"Rs");
	
		} catch (Exception e) {
		LOGGER.error("Please enter a valid input!");
	
		}
		
	
	
		}

}
