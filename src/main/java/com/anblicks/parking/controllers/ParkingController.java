package com.anblicks.parking.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anblicks.parking.models.ParkingPlace;
import com.anblicks.parking.models.ParkingRequest;
import com.anblicks.parking.service.ParkingService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/parkingApp")
@Api(value = "This Parking Service Controller.")
public class ParkingController {
	
	@Autowired
	private ParkingService parkingService;
	
	private final Logger logger = LoggerFactory.getLogger(ParkingController.class);

	@RequestMapping(value = "/getAvailableParking", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ApiOperation(value = "This Servie Returns the Available Parking places")
	public ResponseEntity<List<ParkingPlace>> getAvailableParkings() {
		return new ResponseEntity(parkingService.getAvailableParkings(), HttpStatus.OK);
	}

	@RequestMapping(value = "/AssignVechileToPlace", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	@ApiOperation(value = "This Service used to Create a praking place")
	public ResponseEntity<ParkingRequest> assignVechileToPlace(@ApiParam(required=true)@RequestBody ParkingRequest request) {
		logger.info("Reuqest Object" + request.toString());
		return new ResponseEntity(request, HttpStatus.CREATED);
	}

}
