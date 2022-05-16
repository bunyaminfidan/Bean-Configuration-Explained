package com.example.test.configuration;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.test.manager.CarVehicleManager;
import com.example.test.manager.PlaneVehicleManager;
import com.example.test.service.VehicleService;

@Configuration
public class AppConfiguration {

	@Bean
	@ConditionalOnProperty(value = "vehicle.service.mode", havingValue = "car", matchIfMissing = false)
	public VehicleService carVehicleManagerConfiguration() {
		return new CarVehicleManager();

	}

	@Bean
	@ConditionalOnProperty(value = "vehicle.service.mode", havingValue = "plane", matchIfMissing = true)
	public VehicleService planeVehicleManagerConfiguration() {
		return new PlaneVehicleManager();
	}
}
