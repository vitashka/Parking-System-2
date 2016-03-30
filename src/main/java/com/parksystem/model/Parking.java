package com.parksystem.model;

import java.util.ArrayList;
import java.util.List;

public class Parking {
	@Override
	public String toString() {
		return "Parking";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((level == null) ? 0 : level.hashCode());
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
		Parking other = (Parking) obj;
		if (level == null) {
			if (other.level != null)
				return false;
		} else if (!level.equals(other.level))
			return false;
		return true;
	}

	private List<Level> level = new ArrayList<Level>();

	public void addLevel(Level lev) {
		level.add(lev);
	}

	public List<Level> getLevels() {
		return level;
	}
}
