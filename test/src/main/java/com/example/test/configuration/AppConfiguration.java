package com.example.test.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.test.manager.CarVehicleManager;
import com.example.test.manager.PlaneVehicleManager;
import com.example.test.service.VehicleService;

@Configuration
public class AppConfiguration {

	
	@Bean
	public VehicleService carVehicleServiceConfiguration() {
		return new  CarVehicleManager();
	}
	
	@Bean

	public VehicleService planeVehicleServiceConfiguration() {
		return new  PlaneVehicleManager();
	}
}
