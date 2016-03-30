package com.parksystem.model;

public class Bus extends Vehicle {

	public Bus(String vehicleLicense, String ownerLicense) {
		this.vehicleLicense = vehicleLicense;
		this.ownerLicense = ownerLicense;
		spotsNeeded = 5;
		size = VehicleSize.Bus;
	}

	public boolean canFitInSpot(ParkingSpot spot) {

		boolean a = false;
		if (spot.getSize().equals(VehicleSize.Bus)) {
			a = true;
		}
		return a;
	}	
}
