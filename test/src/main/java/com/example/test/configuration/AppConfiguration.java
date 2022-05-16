package com.example.test.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.test.manager.CarVehicleManager;
import com.example.test.manager.PlaneVehicleManager;
import com.example.test.service.VehicleService;

@Configuration
public class AppConfiguration {

	
	@Bean
	@Qualifier("carVehicleManagerConfiguration")
	public VehicleService carVehicleManagerConfiguration() {
		return new  CarVehicleManager();
	}
	
	@Bean
	@Qualifier("planeVehicleManagerConfiguration")
	public VehicleService planeVehicleManagerConfiguration() {
		return new  PlaneVehicleManager();
	}
}
