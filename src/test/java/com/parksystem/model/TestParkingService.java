package com.parksystem.model;

import static org.junit.Assert.*;
import org.junit.*;

public class TestParkingService
{
	private static ParkingService service;
	
	@BeforeClass
	public static void beforeClass()
	{
		Parking parking = new Parking();
		
		Level level0 = new Level(0);
		Level level1 = new Level(1);
		
		level0.addSpot(new ParkingSpot(VehicleSize.Motorcycle, level0, 0, 0));
		level0.addSpot(new ParkingSpot(VehicleSize.Motorcycle, level0, 0, 1));
		level0.addSpot(new ParkingSpot(VehicleSize.Motorcycle, level0, 0, 2));
		level0.addSpot(new ParkingSpot(VehicleSize.Motorcycle, level0, 0, 3));
		level0.addSpot(new ParkingSpot(VehicleSize.Motorcycle, level0, 0, 4));
		
		level0.addSpot(new ParkingSpot(VehicleSize.Car, level0, 1, 0));
		level0.addSpot(new ParkingSpot(VehicleSize.Car, level0, 1, 1));
		level0.addSpot(new ParkingSpot(VehicleSize.Car, level0, 1, 2));
		level0.addSpot(new ParkingSpot(VehicleSize.Car, level0, 1, 3));
		level0.addSpot(new ParkingSpot(VehicleSize.Car, level0, 1, 4));
		
		level1.addSpot(new ParkingSpot(VehicleSize.Bus, level1, 0, 0));
		level1.addSpot(new ParkingSpot(VehicleSize.Bus, level1, 0, 1));
		
		level1.addSpot(new ParkingSpot(VehicleSize.Bus, level1, 1, 0));
		level1.addSpot(new ParkingSpot(VehicleSize.Bus, level1, 1, 1));
		level1.addSpot(new ParkingSpot(VehicleSize.Bus, level1, 1, 2));
		level1.addSpot(new ParkingSpot(VehicleSize.Bus, level1, 1, 3));
		level1.addSpot(new ParkingSpot(VehicleSize.Bus, level1, 1, 4));
		
		parking.addLevel(level0);
		parking.addLevel(level1);
		
		service = new ParkingService(parking);
	}
	
	@Test
	public void test()
	{
		Bus bus1 = new Bus("bus1", "bus1");
		Bus bus2 = new Bus("bus2", "bus2");
		
		Ticket ticket1 = service.park(bus1);
		assertTrue("parking bus1", ticket1.contains(bus1));	
		assertTrue("parking bus2", service.park(bus2) == null);
		
		service.remove(ticket1);
		assertTrue("parking bus2", service.park(bus2).contains(bus2));
		
		
		Car car1 = new Car("car1", "car1");
		Car car2 = new Car("car2", "car2");
		Car car3 = new Car("car3", "car3");
		Car car4 = new Car("car4", "car4");
		Car car5 = new Car("car5", "car5");
		Car car6 = new Car("car6", "car6");
		Car car7 = new Car("car7", "car7");
		Car car8 = new Car("car8", "car8");
		
		assertTrue("parking car1", service.park(car1).contains(car1));
		assertTrue("parking car2", service.park(car2).contains(car2));
		assertTrue("parking car3", service.park(car3).contains(car3));
		assertTrue("parking car4", service.park(car4).contains(car4));
		assertTrue("parking car5", service.park(car5).contains(car5));
		assertTrue("parking car6", service.park(car6).contains(car6));
		assertTrue("parking car7", service.park(car7).contains(car7));
		assertTrue("parking car8", service.park(car8) == null);
		service.remove(car4);
		assertTrue("parking car8", service.park(car8).contains(car8));
		
		Motorcycle mot1 = new Motorcycle("mot1", "mot1");
		Motorcycle mot2 = new Motorcycle("mot2", "mot2");
		Motorcycle mot3 = new Motorcycle("mot3", "mot3");
		Motorcycle mot4 = new Motorcycle("mot4", "mot4");
		Motorcycle mot5 = new Motorcycle("mot5", "mot5");
		Motorcycle mot6 = new Motorcycle("mot6", "mot6");
		Motorcycle mot7 = new Motorcycle("mot7", "mot7");
		Motorcycle mot8 = new Motorcycle("mot8", "mot8");
		
		assertTrue("parking mot1", service.park(mot1).contains(mot1));
		assertTrue("parking mot2", service.park(mot2).contains(mot2));
		assertTrue("parking mot3", service.park(mot3).contains(mot3));
		assertTrue("parking mot4", service.park(mot4).contains(mot4));
		Ticket ticket2 = service.park(mot5);
		assertTrue("parking mot5", ticket2.contains(mot5));
		assertTrue("parking mot6", service.park(mot6) == null);
		service.remove(ticket2);
		assertTrue("parking mot6", service.park(mot6).contains(mot6));
		assertTrue("parking mot7", service.park(mot7) == null);
		service.remove(car3);
		assertTrue("parking mot7", service.park(mot7).contains(mot7));
		assertTrue("parking mot8", service.park(mot8) == null);
		service.remove(bus2);
		assertTrue("parking mot8", service.park(mot8).contains(mot8));
	}
}
