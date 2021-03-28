package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;

public class RecipeTest_Name {

	@Test
	public void testGetName() {
		Recipe Rec=new Recipe();
		System.out.println(Rec.getName());
	}

	@Test
	public void testSetName() {
		String expected ="hamza";
		String actual ="";
		String newValue = "hamza";
		
		Recipe Rec=new Recipe();
		Rec.setName(newValue);
		
		actual=Rec.getName();
		assertTrue(expected==actual);
		
	}
	@Test
	public void testSetnoName() {
		String expected ="";
		String actual ="";
		String newValue = "";
		
		Recipe Rec=new Recipe();
		Rec.setName(newValue);
		
		actual=Rec.getName();
		assertTrue(expected==actual);
		
	}

}
