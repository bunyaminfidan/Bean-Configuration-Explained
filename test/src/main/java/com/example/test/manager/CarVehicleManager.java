package com.example.test.manager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.test.service.VehicleService;

public class CarVehicleManager implements VehicleService {

	private Logger log = LoggerFactory.getLogger(CarVehicleManager.class);

	@Override
	public void startEngine() {
		log.info("Araba motoru çalıştı");

	}

	@Override
	public void move() {
		log.info("Sürüş zamanı");
	}

	@Override
	public void stopEngine() {
		log.info("Araba motoru kapatıldı");

	}

}
