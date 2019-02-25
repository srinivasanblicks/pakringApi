package com.anblicks.parking.service;

import java.util.List;

import com.anblicks.parking.models.ParkingPlace;
import com.anblicks.parking.models.ParkingRequest;

public interface ParkingService {
	List<ParkingPlace> getAvailableParkings();
	
	ParkingPlace assignPlacetoVehicle(ParkingRequest request);
	
}
