package com.parksystem.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCar {

	Car car = new Car(null, null);

	@Test
	public void testObjectCar() {

		assertTrue(car instanceof Car);
		assertTrue(car instanceof Vehicle);
	}

	@Test
	public void testCanFitInSpot() {

		ParkingSpot sp1 = new ParkingSpot(VehicleSize.Motorcycle, null, 0, 0);
		assertFalse("spot size = motorcycle", car.canFitInSpot(sp1));
		ParkingSpot sp2 = new ParkingSpot(VehicleSize.Car, null, 0, 0);
		assertTrue("spot size = car", car.canFitInSpot(sp2));
		ParkingSpot sp3 = new ParkingSpot(VehicleSize.Bus, null, 0, 0);
		assertTrue("spot size = bus", car.canFitInSpot(sp3));

	}
}