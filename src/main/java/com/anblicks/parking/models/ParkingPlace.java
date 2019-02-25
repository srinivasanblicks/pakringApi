package com.anblicks.parking.models;

import java.util.Date;

public class ParkingPlace {
	private String placeCode;
	private String assignedVehicle;
	private Date parkedAt;
	private Boolean isAvailable;
	private String assignedBy;
	public String getPlaceCode() {
		return placeCode;
	}
	public void setPlaceCode(String placeCode) {
		this.placeCode = placeCode;
	}
	public String getAssignedVehicle() {
		return assignedVehicle;
	}
	public void setAssignedVehicle(String assignedVehicle) {
		this.assignedVehicle = assignedVehicle;
	}
	public Date getParkedAt() {
		return parkedAt;
	}
	public void setParkedAt(Date parkedAt) {
		this.parkedAt = parkedAt;
	}
	public Boolean getIsAvailable() {
		return isAvailable;
	}
	public void setIsAvailable(Boolean isAvailable) {
		this.isAvailable = isAvailable;
	}
	public String getAssignedBy() {
		return assignedBy;
	}
	public void setAssignedBy(String assignedBy) {
		this.assignedBy = assignedBy;
	}
	
}
