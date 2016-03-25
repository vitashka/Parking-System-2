package com.parksystem.model;

public class Motorcycle extends Vehicle {

	public Motorcycle() {		

    	spotsNeeded = 1;
    	
		size = VehicleSize.Motorcycle;
	}

	
	public boolean canFitInSpot(ParkingSpot spot) {		
		return false;
	}
	
	public void print() {
		System.out.print("Car");
	}	
}