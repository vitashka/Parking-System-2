package com.parksystem.model;

public class Main
{

	public static void main(String[] args)
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

		ParkingService service = new ParkingService(parking);

		Bus bus1 = new Bus("bus1", "bus1");
		Bus bus2 = new Bus("bus2", "bus2");
		System.out.println("========\n" + service.park(bus1));
		System.out.println("========\n" + service.park(bus2));
		service.remove(bus1);
		System.out.println("========\n" + service.park(bus2));

		Car car1 = new Car("car1", "car1");
		Car car2 = new Car("car2", "car2");
		Car car3 = new Car("car3", "car3");
		Car car4 = new Car("car4", "car4");
		Car car5 = new Car("car5", "car5");
		Car car6 = new Car("car6", "car6");
		Car car7 = new Car("car7", "car7");
		Car car8 = new Car("car8", "car8");

		System.out.println("========\n" + service.park(car1));
		System.out.println("========\n" + service.park(car2));
		System.out.println("========\n" + service.park(car3));
		System.out.println("========\n" + service.park(car4));
		System.out.println("========\n" + service.park(car5));
		System.out.println("========\n" + service.park(car6));
		System.out.println("========\n" + service.park(car7));
		System.out.println("========\n" + service.park(car8));
		service.remove(car4);
		System.out.println("========\n" + service.park(car8));

		Motorcycle mot1 = new Motorcycle("mot1", "mot1");
		Motorcycle mot2 = new Motorcycle("mot2", "mot2");
		Motorcycle mot3 = new Motorcycle("mot3", "mot3");
		Motorcycle mot4 = new Motorcycle("mot4", "mot4");
		Motorcycle mot5 = new Motorcycle("mot5", "mot5");
		Motorcycle mot6 = new Motorcycle("mot6", "mot6");
		Motorcycle mot7 = new Motorcycle("mot7", "mot7");
		Motorcycle mot8 = new Motorcycle("mot8", "mot8");

		System.out.println("========\n" + service.park(mot1));
		System.out.println("========\n" + service.park(mot2));
		System.out.println("========\n" + service.park(mot3));
		System.out.println("========\n" + service.park(mot4));
		System.out.println("========\n" + service.park(mot5));
		System.out.println("========\n" + service.park(mot6));
		System.out.println("========\n" + service.park(mot7));
		System.out.println("========\n" + service.park(mot8));
		service.remove(car6);
		System.out.println("========\n" + service.park(mot7));
		service.remove(bus2);
		System.out.println("========\n" + service.park(mot8));
	}

}
