package com.parksystem.model;

public class Car extends Vehicle {

	public Car(String vehicleLicense, String ownerLicense) {		

    	spotsNeeded = 1;
    	
		size = VehicleSize.Compact;
	}

	
	public boolean canFitInSpot(ParkingSpot spot) {		
		return false;
	}
	
	public void print() {
		System.out.print("Car");
	}	
}
