package com.parksystem.model;

import static org.junit.Assert.*;
import org.junit.Test;

public class ParkingServiceTest
{

	@Test
	public void testObjectTicket()
	{
		Parking p = new Parking();
		ParkingService ps = new ParkingService(p);
		
		assertTrue(ps instanceof ParkingService);
	}
}