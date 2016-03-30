package com.parksystem.model;

public abstract class Vehicle {
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
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ownerLicense == null) ? 0 : ownerLicense.hashCode());
		result = prime * result + spotsNeeded;
		result = prime * result + ((vehicleLicense == null) ? 0 : vehicleLicense.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehicle other = (Vehicle) obj;
		if (ownerLicense == null)
		{
			if (other.ownerLicense != null)
				return false;
		} else if (!ownerLicense.equals(other.ownerLicense))
			return false;
		if (spotsNeeded != other.spotsNeeded)
			return false;
		if (vehicleLicense == null)
		{
			if (other.vehicleLicense != null)
				return false;
		} else if (!vehicleLicense.equals(other.vehicleLicense))
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "Vehicle [" + size + ", " + vehicleLicense + ", " + ownerLicense + "]";
	}
}
