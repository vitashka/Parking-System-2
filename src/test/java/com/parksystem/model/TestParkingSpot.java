package com.parksystem.model;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class TestParkingSpot {
	Level lev1, lev2, lev3;
	ParkingSpot parkspot1, parkspot2, parkspot3;

	@Before
	public void setup() {
		lev1 = new Level(0);
		lev2 = new Level(1);
		lev3 = new Level(2);
		parkspot1 = new ParkingSpot(VehicleSize.Motorcycle,lev1, 0, 1);
		parkspot2 = new ParkingSpot(VehicleSize.Car,lev2, 0, 2);
		parkspot2 = new ParkingSpot(VehicleSize.Car,lev2, 0, 2);
		parkspot3 = new ParkingSpot( VehicleSize.Bus,lev3, 0, 3);
	}

	@Test
	public void getSizeTest() {
		assertEquals(parkspot1.getSize(), VehicleSize.Motorcycle);
		assertEquals(parkspot2.getSize(), VehicleSize.Car);
		assertEquals(parkspot2.getSize(), VehicleSize.Car);
		assertEquals(parkspot3.getSize(), VehicleSize.Bus);

	}

	@Test
	public void getLevelTest() {
		assertTrue(lev1.getNumber() == 0);
		assertTrue(lev2.getNumber() == 1);
		assertTrue(lev3.getNumber() == 2);
	}

	@Test
	public void getRowTest() {
		assertEquals(parkspot1.getRow(), 0);
		assertEquals(parkspot2.getRow(), 0);
		assertEquals(parkspot3.getRow(), 0);
	}

	@Test
	public void getNumberTest() {
		assertTrue(!(parkspot1.getNumber() == 3));
		assertTrue(!(parkspot2.getNumber() == 3));
		assertTrue((parkspot3.getNumber() == 3));
	}

	@Test
	public void canFitToVehicleTest() {
		assertEquals(parkspot1.getSize(), VehicleSize.Motorcycle );
		assertEquals(parkspot2.getSize(), VehicleSize.Car);
		assertEquals(parkspot2.getSize(), VehicleSize.Car);
		assertEquals(parkspot3.getSize(), VehicleSize.Bus);
	}
}
