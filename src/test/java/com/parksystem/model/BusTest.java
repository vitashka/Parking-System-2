package com.parksystem.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class BusTest {

	@Test
	public void testObjectBus() {
		Bus bus = new Bus();
		assertTrue(bus instanceof Bus);
		assertTrue(bus instanceof Vehicle);

	}

}
