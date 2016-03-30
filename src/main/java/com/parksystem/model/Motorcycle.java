package com.parksystem.model;
public class Motorcycle extends Vehicle {

	public Motorcycle(String vehicleLicense, String ownerLicense) {
		this.vehicleLicense = vehicleLicense;
		this.ownerLicense = ownerLicense;
		spotsNeeded = 1;
		size = VehicleSize.Motorcycle;

	}

	public boolean canFitInSpot(ParkingSpot spot) {
		return true;
	}

}
