package com.parksystem.model;

import java.util.*;

public class ParkingService
{
	private Parking parking;
	private List<Ticket> tickets;

	public ParkingService(Parking parking)
	{
		this.parking = parking;
	}

	public boolean park(Vehicle vehicle)
	{
		List<ParkingSpot> spots = getSpotsForVehicle(vehicle);

		if (spots == null)
			return false;

		enrollTicket(new Ticket(vehicle, spots));
		return true;
	}

	private List<ParkingSpot> getSpotsForVehicle(Vehicle vehicle)
	{
		List<ParkingSpot> spotsForVehicle = new ArrayList<ParkingSpot>(5);

		for (Level level : parking.getLevels())
			for (ParkingSpot spot : level.getSpots())
			{
				if (spot.canFitToVehicle(vehicle) && vehicle.canFitInSpot(spot) && spotIsEmpty(spot)
						&& spotsInSameRowAndLevel(spotsForVehicle, spot))
					spotsForVehicle.add(spot);
				else
					spotsForVehicle.clear();

				if (spotsForVehicle.size() == vehicle.getSpotsNeeded())
					return spotsForVehicle;
			}

		return null;
	}

	private boolean spotIsEmpty(ParkingSpot spot)
	{
		for (Ticket t : tickets)
			if (t.contains(spot))
				return true;
		return false;
	}

	private boolean spotsInSameRowAndLevel(List<ParkingSpot> spotList, ParkingSpot newSpot)
	{
		if (spotList.isEmpty())
			return true;
		else
		{
			ParkingSpot spot = spotList.get(0);
			if (spot.getRow() == newSpot.getRow() && spot.getLevel() == newSpot.getLevel())
				return true;
			else
				return false;
		}
	}

	public void remove(Vehicle vehicle)
	{
		for (Ticket t : tickets)
			if (t.contains(vehicle))
			{
				discardTicket(t);
				return;
			}
	}

	private void enrollTicket(Ticket ticket)
	{
		this.tickets.add(ticket);
	}

	private void discardTicket(Ticket ticket)
	{
		this.tickets.remove(ticket);
	}

	public List<Ticket> getTickets()
	{
		return tickets;
	}
}