package com.example.test.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.test.service.VehicleService;

public class PlaneVehicleManager implements VehicleService {

	private Logger log = LoggerFactory.getLogger(PlaneVehicleManager.class);
	
	
	@Override
	public void startEngine() {
		log.info("Uçak motoru çalıştı");
		
	}

	@Override
	public void move() {
		log.info("Uçuş zamanı");
		
	}

	@Override
	public void stopEngine() {
		log.info("Uçak motoru kapatıldı");
		
	}

}
