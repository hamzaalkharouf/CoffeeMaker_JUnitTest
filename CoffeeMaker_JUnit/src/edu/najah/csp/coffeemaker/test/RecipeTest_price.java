package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class RecipeTest_price {

	@Test
	public void testGetPrice() {
		Recipe Rec=new Recipe();
		System.out.println(Rec.getPrice());
		}



	@Test
	public void testSetPricePositive() throws NumberFormatException, RecipeException {
		double expected =2;
		double actual =0;
		String newValue = "2";
		
		Recipe Rec=new Recipe();
		Rec.setPrice(newValue);
		
		actual=Rec.getPrice();
		System.out.println(Rec.getPrice());
		assertTrue(expected==actual);
        assertNotNull(Rec);

	}
	@Test
	public void testSetPriceZero() throws NumberFormatException, RecipeException {
		double expected =0;
		double actual =0;
		String newValue = "0";
		
		Recipe Rec=new Recipe();
		Rec.setPrice(newValue);
		
		actual=Rec.getPrice();
		System.out.println(Rec.getPrice());
		assertTrue(expected==actual);
        assertNotNull(Rec);

	}	
	@Test(expected =NumberFormatException.class )
	public void testSetPriceFloat() throws NumberFormatException, RecipeException {
		double expected =2;
		double actual =0;
		String newValue = "1.5";
		
		Recipe Rec=new Recipe();
		Rec.setPrice(newValue);
		
		actual=Rec.getPrice();
		System.out.println(Rec.getPrice());
		assertTrue(expected==actual);
        assertNotNull(Rec);

	}
	
	
	@Test(expected =NumberFormatException.class )
	public void testSetPriceX() throws NumberFormatException, RecipeException {
		double expected =0;
		double actual =0;
		String newValue = "x";
		
		Recipe Rec=new Recipe();
		Rec.setPrice(newValue);
		
		actual=Rec.getPrice();
		System.out.println(Rec.getPrice());
		assertFalse(expected==actual);
        assertNotNull(Rec);

	}	
	
	@Test(expected =RecipeException.class )
	public void testSetPriceNegative() throws NumberFormatException, RecipeException {
		double expected =1;
		double actual =0;
		String newValue = "-1";
		
		Recipe Rec=new Recipe();
		Rec.setPrice(newValue);

		actual=Rec.getPrice();
		System.out.println(actual);
		assertTrue(expected==actual);
        assertNotNull(Rec);


	}

}
