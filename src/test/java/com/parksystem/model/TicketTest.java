package com.parksystem.model;

import static org.junit.Assert.*;
import org.junit.*;

import java.util.*;

public class TicketTest
{
	private Level level;
	private Ticket ticket1, ticket2;
	private ParkingSpot spot1, spot2;
	private Vehicle motorcycle, car;
	
	@Before
	public void setUp1()
	{
		motorcycle = new Motorcycle("ASDFGH", "HGFDSA");
		car = new Car("QWERTY", "YTREWQ");
		
		level = new Level(0);	
		spot1 = new ParkingSpot(VehicleSize.Motorcycle, level, 0, 0);
		spot2 = new ParkingSpot(VehicleSize.Compact, level, 0, 1);	
		
		List<ParkingSpot> spots1 = new ArrayList<ParkingSpot>();
		spots1.add(spot1);
		List<ParkingSpot> spots2 = new ArrayList<ParkingSpot>();
		spots2.add(spot2);
		
		ticket1 = new Ticket(motorcycle, spots1);
		ticket2 = new Ticket(car, spots2);
	}
	
	@Test
	public void testObjectTicket()
	{
		assertTrue(ticket1 instanceof Ticket);
		assertTrue(ticket2 instanceof Ticket);
	}
	
	@Test
	public void testContains()
	{
		assertTrue(ticket1.contains(spot1));
		assertTrue(ticket1.contains(motorcycle));
		assertTrue(ticket2.contains(spot2));
		assertTrue(ticket2.contains(car));
		
		assertFalse(ticket2.contains(spot1));
		assertFalse(ticket2.contains(motorcycle));
		assertFalse(ticket1.contains(spot2));
		assertFalse(ticket1.contains(car));
	}
}