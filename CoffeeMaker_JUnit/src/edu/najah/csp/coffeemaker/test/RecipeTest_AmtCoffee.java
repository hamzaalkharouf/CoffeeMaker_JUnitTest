package edu.najah.csp.coffeemaker.test;
import static org.junit.Assert.*;

import org.junit.Test;


import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class RecipeTest_AmtCoffee {

	@Test
	public void testGetAmtCoffee() {
		Recipe Rec=new Recipe();
		System.out.println(Rec.getAmtCoffee());
	}

	@Test
	public void testSetAmtCoffeePositive() throws NumberFormatException, RecipeException {
		int expected =2;
		int actual =0;
		String newValue = "2";
		
		Recipe Rec=new Recipe();
		Rec.setAmtCoffee(newValue);
		
		actual=Rec.getAmtCoffee();
		System.out.println(Rec.getAmtCoffee());
		assertTrue(expected==actual);
        assertNotNull(Rec);

	}
	@Test
	public void testSetAmtCoffeeZero() throws NumberFormatException, RecipeException {
		int expected =0;
		int actual =0;
		String newValue = "0";
		
		Recipe Rec=new Recipe();
		Rec.setAmtCoffee(newValue);
		
		actual=Rec.getAmtCoffee();
		System.out.println(Rec.getAmtCoffee());
		assertTrue(expected==actual);
        assertNotNull(Rec);

	}	
	@Test(expected =NumberFormatException.class )
	public void testSetAmtCoffeeFloat() throws NumberFormatException, RecipeException {
		int expected =2;
		int actual =0;
		String newValue = "1.5";
		
		Recipe Rec=new Recipe();
		Rec.setAmtCoffee(newValue);
		
		actual=Rec.getAmtCoffee();
		System.out.println(Rec.getAmtCoffee());
		assertTrue(expected==actual);
        assertNotNull(Rec);

	}
	
	
	@Test(expected =NumberFormatException.class )
	public void testSetAmtCoffeeX() throws NumberFormatException, RecipeException {
		int expected =0;
		int actual =0;
		String newValue = "x";
		
		Recipe Rec=new Recipe();
		Rec.setAmtCoffee(newValue);
		
		actual=Rec.getAmtCoffee();
		System.out.println(Rec.getAmtCoffee());
		assertTrue(expected==actual);
        assertNotNull(Rec);

	}	
	
	@Test(expected =RecipeException.class )
	public void testSetAmtCoffeeNegative() throws NumberFormatException, RecipeException {
		int expected =1;
		int actual =0;
		String newValue = "-1";
		
		Recipe Rec=new Recipe();
		Rec.setAmtCoffee(newValue);

		actual=Rec.getAmtCoffee();
		System.out.println(actual);
		assertTrue(expected==actual);
		assertNotNull(Rec);


	}

}
