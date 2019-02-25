package com.anblicks.parking.models;

import java.util.Date;

import io.swagger.annotations.ApiModel;

@ApiModel(value="Request Object for Assigning Vehicle")
public class ParkingRequest {
	private String veihcleNo;
	private String assignPlacecode;
	private Date inTime;
	private String createdBy;

	public String getVeihcleNo() {
		return veihcleNo;
	}

	public void setVeihcleNo(String veihcleNo) {
		this.veihcleNo = veihcleNo;
	}

	public String getAssignPlacecode() {
		return assignPlacecode;
	}

	public void setAssignPlacecode(String assignPlacecode) {
		this.assignPlacecode = assignPlacecode;
	}

	public Date getInTime() {
		return inTime;
	}

	public void setInTime(Date inTime) {
		this.inTime = inTime;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	@Override
	public String toString() {
		return "ParkingRequest [veihcleNo=" + veihcleNo + ", assignPlacecode=" + assignPlacecode + ", inTime=" + inTime
				+ ", createdBy=" + createdBy + "]";
	}
}
