package com.parksystem.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class BusTest {

	Bus bus = new Bus(null, null);

	@Test
	public void testObjectBus() {

		assertTrue(bus instanceof Bus);
		assertTrue(bus instanceof Vehicle);
	}

	@Test
	public void testCanFitInSpot() {
		ParkingSpot sp1 = new ParkingSpot(VehicleSize.Motorcycle, null, 0, 0);
		assertFalse("spot size = motorcycle", bus.canFitInSpot(sp1));
		ParkingSpot sp2 = new ParkingSpot(VehicleSize.Сar, null, 0, 0);
		assertFalse("spot size = car", bus.canFitInSpot(sp2));
		ParkingSpot sp3 = new ParkingSpot(VehicleSize.Bus, null, 0, 0);
		assertTrue("spot size = bus", bus.canFitInSpot(sp3));

	}
}
