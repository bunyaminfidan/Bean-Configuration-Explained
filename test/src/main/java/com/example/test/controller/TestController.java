package com.example.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.test.service.VehicleService;

@Service
public class TestController {

	@Autowired
	@Qualifier("carVehicleManagerConfiguration")
	VehicleService vehicleService;

	public void testVehicle() {
		vehicleService.startEngine();
		vehicleService.move();
		vehicleService.stopEngine();
	}

}
