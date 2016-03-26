package com.parksystem.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class Testlevel {
	Level level;
	ParkingSpot sp1; 
	ParkingSpot sp2; 
	ParkingSpot sp3;

	@Before
	public void setup(){
		 level = new Level(0);
		 sp1 = new ParkingSpot(level, 0, 0, VehicleSize.Compact);
		 sp2 = new ParkingSpot(level, 0, 1, VehicleSize.Compact);
		 sp3 = new ParkingSpot(level, 0, 2, VehicleSize.Compact);
		level.addSpot(sp1);
		level.addSpot(sp2);
		level.addSpot(sp3);
	}
	
	@Test
	public void testgetNumber() {
assertTrue(level.getNumber()==0);
	}

	@Test
	public void testaddSpot() {
	Level lev1 = new Level(0);
	assertTrue(lev1.getSpots().size()==0);
	lev1.addSpot(sp1);
	assertTrue(lev1.getSpots().size()==1);
	lev1.addSpot(sp2);
	assertTrue(lev1.getSpots().size()==2);
	
	
	
	}

	@Test
	public void testremoveSpot() {

	}
	@Test
	public void testgetSpots(){
		
	}
}
