package com.parksystem.model;

import java.util.ArrayList;

public abstract class Vehicle {
	protected String licensePlate;
	protected int spotsNeeded;
	protected VehicleSize size;

	public int getSpotsNeeded() {
		return spotsNeeded;
	}

	public VehicleSize getSize() {
		return size;
	}

	public void parkInSpot(ParkingSpot spot) {}

	public void clearSpots() {}

	public abstract boolean canFitInSpot(ParkingSpot spot);

	public abstract void print();
}
