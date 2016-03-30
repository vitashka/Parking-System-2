package com.parksystem.model;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class Testlevel {
	Level level;
	ParkingSpot sp1;
	ParkingSpot sp2;
	ParkingSpot sp3;

	@Before
	public void setup() {
		level = new Level(0);

		sp1 = new ParkingSpot( VehicleSize.Сar, level, 0, 1);
		sp2 = new ParkingSpot(VehicleSize.Сar,level, 0, 2);
		sp3 = new ParkingSpot( VehicleSize.Сar,level, 0, 3);

		sp1 = new ParkingSpot( VehicleSize.Сar, level, 0, 1);
		sp2 = new ParkingSpot(VehicleSize.Сar,level, 0, 2);
		sp3 = new ParkingSpot( VehicleSize.Сar,level, 0, 3);

		level.addSpot(sp1);
		level.addSpot(sp2);
		level.addSpot(sp3);
	}

	@Test
	public void testgetNumber() {
		assertTrue(level.getNumber() == 0);
	}

	@Test
	public void testaddSpot() {
		Level lev1 = new Level(0);
		assertTrue(lev1.getSpots().size() == 0);
		lev1.addSpot(sp1);
		assertTrue(lev1.getSpots().size() == 1);
		lev1.addSpot(sp2);
		assertTrue(lev1.getSpots().size() == 2);

	}

	@Test
	public void testremoveSpot() {
		Level lev2 = new Level(1);
		lev2.addSpot(sp1);
		lev2.addSpot(sp2);
		lev2.addSpot(sp3);
		assertEquals(lev2.getSpots().size(), 3);
		lev2.removeSpot(sp1);
		assertEquals(lev2.getSpots().size(), 2);
		lev2.removeSpot(sp2);
		assertEquals(lev2.getSpots().size(), 1);
		lev2.removeSpot(sp3);
		assertEquals(lev2.getSpots().size(), 0);
		
	}

	@Test
	public void testgetSpots() {
		
		assertTrue(level.getSpots() instanceof List<?>);

	}
}
