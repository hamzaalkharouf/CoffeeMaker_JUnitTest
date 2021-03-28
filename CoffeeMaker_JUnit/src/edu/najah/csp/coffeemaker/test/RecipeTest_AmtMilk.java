package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class RecipeTest_AmtMilk {

	@Test
	public void testGetAmtMilk() {
		Recipe Rec=new Recipe();
		System.out.println(Rec.getAmtMilk());
		}



	@Test
	public void testSetAmtMilkPositive() throws NumberFormatException, RecipeException {
		int expected =2;
		int actual =0;
		String newValue = "2";
		
		Recipe Rec=new Recipe();
		Rec.setAmtMilk(newValue);
		
		actual=Rec.getAmtMilk();
		System.out.println(Rec.getAmtMilk());
		assertTrue(expected==actual);
        assertNotNull(Rec);

	}
	@Test
	public void testSetAmtMilkZero() throws NumberFormatException, RecipeException {
		int expected =0;
		int actual =0;
		String newValue = "0";
		
		Recipe Rec=new Recipe();
		Rec.setAmtMilk(newValue);
		
		actual=Rec.getAmtMilk();
		System.out.println(Rec.getAmtMilk());
		assertTrue(expected==actual);
        assertNotNull(Rec);

	}	
	@Test(expected =NumberFormatException.class )
	public void testSetAmtMilkFloat() throws NumberFormatException, RecipeException {
		int expected =2;
		int actual =0;
		String newValue = "1.5";
		
		Recipe Rec=new Recipe();
		Rec.setAmtMilk(newValue);
		
		actual=Rec.getAmtMilk();
		System.out.println(Rec.getAmtMilk());
		assertTrue(expected==actual);
        assertNotNull(Rec);

	}
	
	
	@Test(expected =NumberFormatException.class )
	public void testSetAmtMilkX() throws NumberFormatException, RecipeException {
		int expected =0;
		int actual =0;
		String newValue = "x";
		
		Recipe Rec=new Recipe();
		Rec.setAmtMilk(newValue);
		
		actual=Rec.getAmtMilk();
		System.out.println(Rec.getAmtMilk());
		assertTrue(expected==actual);
        assertNotNull(Rec);

	}	
	
	@Test(expected =RecipeException.class )
	public void testSetAmtMilkNegative() throws NumberFormatException, RecipeException {
		double expected =1;
		double actual =0;
		String newValue = "-1";
		
		Recipe Rec=new Recipe();
		Rec.setAmtMilk(newValue);

		actual=Rec.getAmtMilk();
		System.out.println(actual);
		assertTrue(expected==actual);

		        assertNotNull(Rec);


	}
	
}
