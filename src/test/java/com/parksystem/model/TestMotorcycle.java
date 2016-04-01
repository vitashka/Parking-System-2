package com.parksystem.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestMotorcycle {

	Motorcycle motorcycle = new Motorcycle(null, null);

	@Test
	public void testObjectCar() {

		assertTrue(motorcycle instanceof Motorcycle);
		assertTrue(motorcycle instanceof Vehicle);
	}

	@Test
	public void testCanFitInSpot() {
        ParkingSpot sp1 = new ParkingSpot(VehicleSize.Motorcycle, null, 0, 0);
        assertTrue("spot size = motorcycle", motorcycle.canFitInSpot(sp1));
        ParkingSpot sp2 = new ParkingSpot(VehicleSize.Car, null, 0, 0);
        assertTrue("spot size = car", motorcycle.canFitInSpot(sp2));
        ParkingSpot sp3 = new ParkingSpot(VehicleSize.Bus, null, 0, 0);
        assertTrue("spot size = bus", motorcycle.canFitInSpot(sp3));

    }
}