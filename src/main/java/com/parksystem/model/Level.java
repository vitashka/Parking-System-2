package com.parksystem.model;

import java.util.ArrayList; 
import java.util.List;

public class Level {
	private int number;
	private List<ParkingSpot> spots = new ArrayList<ParkingSpot>();
	
	@Override
	public String toString() {
		return "Level [number=" + number + ", spots=" + spots + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + number;
		result = prime * result + ((spots == null) ? 0 : spots.hashCode());
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
		Level other = (Level) obj;
		if (number != other.number)
			return false;
		if (spots == null) {
			if (other.spots != null)
				return false;
		} else if (!spots.equals(other.spots))
			return false;
		return true;
	}

	public Level(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public void addSpot(ParkingSpot spot) {
		spots.add(spot);
	}

	public void removeSpot(ParkingSpot spot) {
		spots.remove(spot);
	}

	public List<ParkingSpot> getSpots() {

		return  spots;

	}
}
