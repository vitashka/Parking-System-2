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
		
		level0.addSpot(new ParkingSpot(VehicleSize.Compact, level0, 1, 0));
		level0.addSpot(new ParkingSpot(VehicleSize.Compact, level0, 1, 1));
		level0.addSpot(new ParkingSpot(VehicleSize.Compact, level0, 1, 2));
		level0.addSpot(new ParkingSpot(VehicleSize.Compact, level0, 1, 3));
		level0.addSpot(new ParkingSpot(VehicleSize.Compact, level0, 1, 4));
		
		level1.addSpot(new ParkingSpot(VehicleSize.Large, level1, 0, 0));
		level1.addSpot(new ParkingSpot(VehicleSize.Large, level1, 0, 1));
		
		level1.addSpot(new ParkingSpot(VehicleSize.Large, level1, 1, 0));
		level1.addSpot(new ParkingSpot(VehicleSize.Large, level1, 1, 1));
		level1.addSpot(new ParkingSpot(VehicleSize.Large, level1, 1, 2));
		level1.addSpot(new ParkingSpot(VehicleSize.Large, level1, 1, 3));
		level1.addSpot(new ParkingSpot(VehicleSize.Large, level1, 1, 4));
		
		parking.addLevel(level0);
		parking.addLevel(level1);
		
		service = new ParkingService(parking);
	}
	
	@Test
	public void test()
	{
		Bus bus1 = new Bus("bus1", "ZXCVB");
		Bus bus2 = new Bus("bus2", "ZXCVB");
		assertTrue("parking bus1", service.park(bus1));
		assertFalse("parking bus2", service.park(bus2));
		service.remove(bus1);
		assertTrue("parking bus2", service.park(bus2));
		
		Car car1 = new Car("car1", "ZXCVB");
		Car car2 = new Car("car2", "ZXCVB");
		Car car3 = new Car("car3", "ZXCVB");
		Car car4 = new Car("car4", "ZXCVB");
		Car car5 = new Car("car5", "ZXCVB");
		Car car6 = new Car("car6", "ZXCVB");
		Car car7 = new Car("car7", "ZXCVB");
		Car car8 = new Car("car8", "ZXCVB");
		
		assertTrue("parking car1", service.park(car1));
		assertTrue("parking car2", service.park(car2));
		assertTrue("parking car3", service.park(car3));
		assertTrue("parking car4", service.park(car4));
		assertTrue("parking car5", service.park(car5));
		assertTrue("parking car6", service.park(car6));
		assertTrue("parking car7", service.park(car7));
		assertFalse("parking car8", service.park(car8));
		service.remove(car4);
		assertTrue("parking car7", service.park(car7));
		
		Motorcycle mot1 = new Motorcycle("mot1", "ZXCVB");
		Motorcycle mot2 = new Motorcycle("mot2", "ZXCVB");
		Motorcycle mot3 = new Motorcycle("mot3", "ZXCVB");
		Motorcycle mot4 = new Motorcycle("mot4", "ZXCVB");
		Motorcycle mot5 = new Motorcycle("mot5", "ZXCVB");
		Motorcycle mot6 = new Motorcycle("mot6", "ZXCVB");
		Motorcycle mot7 = new Motorcycle("mot7", "ZXCVB");
		Motorcycle mot8 = new Motorcycle("mot8", "ZXCVB");
		assertTrue("parking mot1", service.park(mot1));
		assertTrue("parking mot2", service.park(mot2));
		assertTrue("parking mot3", service.park(mot3));
		assertTrue("parking mot4", service.park(mot4));
		assertTrue("parking mot5", service.park(mot5));
		assertTrue("parking mot6", service.park(mot6));
		assertFalse("parking mot7", service.park(mot7));
		assertFalse("parking mot8", service.park(mot8));
		service.remove(car6);
		assertTrue("parking mot7", service.park(mot7));
		service.remove(bus2);
		assertTrue("parking mot8", service.park(mot8));		
	}
}
