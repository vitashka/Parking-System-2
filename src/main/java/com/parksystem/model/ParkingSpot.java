package com.parksystem.model;

import com.parksystem.model.Vehicle;
import com.parksystem.model.VehicleSize;

public class ParkingSpot {

	// private Vehicle vehicle;
	private VehicleSize spotSize;
	private int row;
	private int spotNumber;
	private Level level;

	public ParkingSpot(VehicleSize spotSize, Level level, int row, int number) {
		this.level = level;
		this.row = row;
		spotNumber = number;
		this.spotSize = spotSize ;
	}

	public VehicleSize getSize() {
		return spotSize;
	}

	public int getLevel() {
		return level.getNumber();
	}

	public int getRow() {
		return row;
	}

	public int getNumber() {
		return spotNumber;
	}
	
	public boolean canFitToVehicle(Vehicle vehicle){
		if (vehicle.size.equals(spotSize)||(vehicle.size.equals(VehicleSize.Motorcycle))|| spotSize.equals(VehicleSize.Large)){
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((level == null) ? 0 : level.hashCode());
		result = prime * result + row;
		result = prime * result + spotNumber;
		result = prime * result + ((spotSize == null) ? 0 : spotSize.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ParkingSpot other = (ParkingSpot) obj;
		if (level == null) {
			if (other.level != null)
				return false;
		} else if (!level.equals(other.level))
			return false;
		if (row != other.row)
			return false;
		if (spotNumber != other.spotNumber)
			return false;
		if (spotSize != other.spotSize)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ParkingSpot [spotSize=" + spotSize + ", row=" + row + ", spotNumber=" + spotNumber + ", level=" + level
				+ "]";
	}
	
	
}
