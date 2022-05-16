package com.example.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.test.controller.TestController;
import com.example.test.manager.CarVehicleManager;
import com.example.test.service.VehicleService;

@SpringBootApplication
public class QualifierApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext context = SpringApplication.run(QualifierApplication.class, args);
//		VehicleService vehicleService = context.getBean(VehicleService.class);
//		vehicleService.startEngine();
//		vehicleService.move();
//		vehicleService.stopEngine();
		
		
		TestController testController = context.getBean(TestController.class);
		testController.testVehicle();
		
		
		
		


	}

}
