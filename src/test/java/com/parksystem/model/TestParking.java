package com.parksystem.model;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.Before;

public class TestParking {
	
	Parking park1;
	Level lev1, lev2, lev3;
	
	@Before 
	public void setup(){
		lev1 = new Level(0);
		lev2 = new Level(1);
		lev3 = new Level(2);
		park1 = new Parking();
	}
	
	
	
	@Test
	public void addLevelTest(){
		assertTrue(park1.getLevels().size()==0);
		park1.addLevel(lev1);
		assertEquals(park1.getLevels().size(), 1);
		park1.addLevel(lev2);
		assertEquals(park1.getLevels().size(), 2);
		park1.addLevel(lev3);
		assertFalse(park1.getLevels().size()==4);
	}
	@Test
	public void getLevels(){
		assertTrue(park1.getLevels() instanceof List<?>);
	}
}
