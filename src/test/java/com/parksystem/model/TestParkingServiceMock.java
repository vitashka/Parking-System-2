package com.parksystem.model;

import static org.junit.Assert.*;
import org.junit.*;
import static org.mockito.Mockito.*;

import java.util.*;

public class TestParkingServiceMock
{
	private static ParkingService service;
	private static Vehicle car, motorcycle;
	private static Ticket ticket1, ticket2;
	
	@BeforeClass
	public static void beforeClass()
	{
		service = mock(ParkingService.class);
		
		car = new Car("", "");
		motorcycle = new Motorcycle("", "");
		
		ticket1 = new Ticket(car, null);
		ticket2 = new Ticket(motorcycle, null);
		
		when(service.park(car)).thenReturn(ticket1);
		when(service.park(motorcycle)).thenReturn(ticket2);
		when(service.getTickets()).thenReturn(Arrays.asList(ticket1, ticket2));
	}
	
	@Test
	public void testObjectTicket()
	{
		ParkingService ps = new ParkingService(new Parking());
		
		assertTrue(ps instanceof ParkingService);
	}
	
	@Test
	public void parkTest()
	{
		assertTrue(service.park(car).equals(ticket1));
		assertTrue(service.park(motorcycle).equals(ticket2));
	}
	
	@Test
	public void getTickets()
	{
		assertTrue(service.getTickets().size() == 2);
	}
}
