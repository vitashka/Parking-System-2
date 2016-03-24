package com.parksystem.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CarTest {
	public Car car;

	@Test	
	public void testObjectCar() {		
		Car car = new Car(); 
		
		assertTrue(car instanceof Car);
		assertTrue(car instanceof Vehicle);
 
	}

}
