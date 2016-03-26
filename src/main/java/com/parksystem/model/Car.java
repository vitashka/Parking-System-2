package com.parksystem.model;

public class Car extends Vehicle {

	public Car() {		

    	spotsNeeded = 12;
    	
		size = VehicleSize.Compact;
	}

	
	public boolean canFitInSpot(ParkingSpot spot) {		
		return false;
	}
	
	public void print() {
		System.out.print("Car");
	}	
}
