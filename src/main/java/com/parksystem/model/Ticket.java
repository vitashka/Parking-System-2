package com.parksystem.model;

import java.util.*;

public class Ticket
{
	private Date startTime;
	private Vehicle vehicle;
	private List<ParkingSpot> spots;

	public Ticket(Vehicle vehicle, List<ParkingSpot> spots)
	{
		this.startTime = new Date();
		this.vehicle = vehicle;
		this.spots = spots;
	}

	public boolean contains(Vehicle vehicle)
	{
		return this.vehicle.equals(vehicle);
	}

	public boolean contains(ParkingSpot spot)
	{
		for (ParkingSpot sp : spots)
			if (sp.equals(spot))
				return true;
		return false;
	}

	public Date getStartTime()
	{
		return this.startTime;
	}

	@Override
	public String toString()
	{
		return "Ticket\nstartTime=" + startTime + "\nvehicle=" + vehicle + "\nspots=" + spots;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((spots == null) ? 0 : spots.hashCode());
		result = prime * result + ((startTime == null) ? 0 : startTime.hashCode());
		result = prime * result + ((vehicle == null) ? 0 : vehicle.hashCode());
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
		Ticket other = (Ticket) obj;
		if (spots == null)
		{
			if (other.spots != null)
				return false;
		} else if (!spots.equals(other.spots))
			return false;
		if (vehicle == null)
		{
			if (other.vehicle != null)
				return false;
		} else if (!vehicle.equals(other.vehicle))
			return false;
		return true;
	}
}