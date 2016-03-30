package com.parksystem.model;

abstract public class Vehicle {
	protected VehicleSize size;
	protected int spotsNeeded;
	protected String vehicleLicense;
	protected String ownerLicense;

	public void setSize(VehicleSize newVar) {
		size = newVar;
	}

	public VehicleSize getSize() {
		return size;
	}

	public void setSpotsNeeded(int newVar) {
		spotsNeeded = newVar;
	}

	public int getSpotsNeeded() {
		return spotsNeeded;
	}

	public void setVehicleLicense(String newVar) {
		vehicleLicense = newVar;
	}

	public String getVehicleLicense() {
		return vehicleLicense;
	}

	public void setOwnerLicense(String newVar) {
		ownerLicense = newVar;
	}

	public String getOwnerLicense() {
		return ownerLicense;
	}

	abstract public  boolean canFitInSpot(ParkingSpot spot);

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((size == null) ? 0 : size.hashCode());
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
		Vehicle other = (Vehicle) obj;
		if (size != other.size)
			return false;
		return true;
	}


}

