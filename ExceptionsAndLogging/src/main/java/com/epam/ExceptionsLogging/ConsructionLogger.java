package com.epam.ExceptionsLogging;

import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ConsructionLogger {
	private static final Logger LOGGER = LogManager.getLogger(SimpleInterest.class);
	public static void CostEstimation() {
		Scanner sc = new Scanner(System.in);
		LOGGER.error("Choose one from the available materials..\n1. Construction with Standard materials\n2. Construction with above standard materials\n3. Construction with High standard materials\n4. Construction with High standard materials and fully automated home");
		try {
			int choose = sc.nextInt();
			double houseArea;
			switch(choose) {
				case 1:
					LOGGER.error("Enter the area of house in sqfts: ");
					houseArea = sc.nextDouble();
					LOGGER.error("Total Cost Estimated is " + (1200 * houseArea)+ "Rs");
					break;
				case 2:
					LOGGER.error("Enter the area of house in sqfts: ");
					houseArea = sc.nextDouble();
					LOGGER.error("Total Cost Estimated is " + (1500 * houseArea)+"Rs");
					break;
				case 3:
					LOGGER.error("Enter the area of house in sqfts: ");
					houseArea = sc.nextDouble();
					LOGGER.error("Total Cost Estimated is " +(1800 * houseArea)+"Rs");
					break;
				case 4:
					LOGGER.error("Enter the area of house in sqfts: ");
					houseArea = sc.nextDouble();
					LOGGER.error("Total Cost Estimated is " +(2500 * houseArea)+"Rs");
					break;
				default:
					LOGGER.error("Select from the above options");
			}
		} catch (Exception e) {
			LOGGER.error("Invalid Input!!");
	
		}
	}
	

}
