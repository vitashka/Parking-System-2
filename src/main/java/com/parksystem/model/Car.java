package com.parksystem.model;

public class Car extends Vehicle {

	public Car(String vehicleLicense, String ownerLicense) {
		this.vehicleLicense = vehicleLicense;
		this.ownerLicense = ownerLicense;
		spotsNeeded = 1;
		size = VehicleSize.Car;
	}

	public boolean canFitInSpot(ParkingSpot spot) {
		boolean a = false;
		if (spot.getSize().equals(VehicleSize.Bus)) {
			a = true;
		}
		if (spot.getSize().equals(VehicleSize.Car)) {
			a = true;
		}
		return a;
	}

}
