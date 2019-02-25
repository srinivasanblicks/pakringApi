package com.anblicks.parking.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Service;

import com.anblicks.parking.models.ParkingPlace;
import com.anblicks.parking.models.ParkingRequest;

@Service
public class ParkingServiceImpl implements ParkingService {

	@Override
	public List<ParkingPlace> getAvailableParkings() {
		List<ParkingPlace> parkings=new ArrayList();
		for(int i=0;i<10;i++) {
			ParkingPlace place=new ParkingPlace();
			place.setPlaceCode("A"+i);
			place.setIsAvailable(new Random().nextBoolean());
			
			parkings.add(place);
		}
		return parkings;
	}

	@Override
	public ParkingPlace assignPlacetoVehicle(ParkingRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

}
