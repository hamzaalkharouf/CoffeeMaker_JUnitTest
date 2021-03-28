package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class RecipeTest_AmtChocolate {

	@Test
	public void testGetAmtChocolate() {
		Recipe Rec=new Recipe();
		System.out.println(Rec.getAmtChocolate());
	}

	@Test
	public void testSetAmtChocolatePositive() throws NumberFormatException, RecipeException {
		int expected =4;
		int actual =0;
		Recipe Rec=new Recipe();
		String newValue = "4";
		Rec.setAmtChocolate(newValue);
		actual=Rec.getAmtChocolate();
		System.out.println(Rec.getAmtChocolate());
		assertTrue(expected==actual);
        assertNotNull(Rec);

	}
	@Test
	public void testSetAmtChocolateZero() throws NumberFormatException, RecipeException {
		int expected =0;
		int actual =0;
		Recipe Rec=new Recipe();
		String newValue = "0";
		Rec.setAmtChocolate(newValue);
		System.out.println(Rec.getAmtChocolate());
		assertTrue(expected==actual);
        assertNotNull(Rec);

	}
	@Test(expected =RecipeException.class )
	public void testSetAmtChocolateNegative() throws NumberFormatException, RecipeException {
		int expected =1;
		int actual =0;
		String newValue = "-1";
		
		Recipe Rec=new Recipe();
		Rec.setAmtChocolate(newValue);

		actual=Rec.getAmtChocolate();
		System.out.println(actual);
		assertTrue(expected==actual);

        assertNotNull(Rec);

	}
	

	
	@Test(expected =NumberFormatException.class )
	public void testSetAmtChocolateFloat() throws NumberFormatException, RecipeException {
		int expected =2;
		int actual =0;
		String newValue = "1.5";
		
		Recipe Rec=new Recipe();
		Rec.setAmtChocolate(newValue);
		
		actual=Rec.getAmtChocolate();
		System.out.println(Rec.getAmtChocolate());
		assertTrue(expected==actual);
        assertNotNull(Rec);

	}
	
	
	@Test(expected =NumberFormatException.class )
	public void testSetAmtChocolateX() throws NumberFormatException, RecipeException {
		int expected =0;
		int actual =0;
		String newValue = "x";
		
		Recipe Rec=new Recipe();
		Rec.setAmtChocolate(newValue);
		
		actual=Rec.getAmtChocolate();
		System.out.println(Rec.getAmtChocolate());
		assertTrue(expected==actual);
        assertNotNull(Rec);

	}


	
}
