package com.parksystem.model;

public class Bus  extends Vehicle{
	public Bus() {		

    	spotsNeeded = 5;
    	
		size = VehicleSize.Compact;
	}

	
	public boolean canFitInSpot(ParkingSpot spot) {		
		return false;
	}
	
	public void print() {
		System.out.print("Bus");
	}	
}
