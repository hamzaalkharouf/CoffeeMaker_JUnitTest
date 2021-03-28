package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.exceptions.RecipeException;

public class RecipeTest_AmtSugar {


	@Test
	public void testGetAmtSugar() {
		Recipe Rec=new Recipe();
		System.out.println(Rec.getAmtSugar());
		}



	@Test
	public void testSetAmtSugarPositive() throws NumberFormatException, RecipeException {
		int expected =2;
		int actual =0;
		String newValue = "2";
		
		Recipe Rec=new Recipe();
		Rec.setAmtSugar(newValue);
		
		actual=Rec.getAmtSugar();
		System.out.println(Rec.getAmtSugar());
		assertTrue(expected==actual);
        assertNotNull(Rec);

	}
	@Test
	public void testSetAmtSugarZero() throws NumberFormatException, RecipeException {
		int expected =0;
		int actual =0;
		String newValue = "0";
		
		Recipe Rec=new Recipe();
		Rec.setAmtSugar(newValue);
		
		actual=Rec.getAmtSugar();
		System.out.println(Rec.getAmtSugar());
		assertTrue(expected==actual);
        assertNotNull(Rec);

	}	
	@Test(expected =NumberFormatException.class )
	public void testSetAmtSugarFloat() throws NumberFormatException, RecipeException {
		int expected =2;
		int actual =0;
		String newValue = "1.5";
		
		Recipe Rec=new Recipe();
		Rec.setAmtSugar(newValue);
		
		actual=Rec.getAmtSugar();
		System.out.println(Rec.getAmtSugar());
		assertTrue(expected==actual);
        assertNotNull(Rec);

	}
	
	
	@Test(expected =NumberFormatException.class )
	public void testSetAmtSugarX() throws NumberFormatException, RecipeException {
		int expected =0;
		int actual =0;
		String newValue = "x";
		
		Recipe Rec=new Recipe();
		Rec.setAmtSugar(newValue);
		
		actual=Rec.getAmtSugar();
		System.out.println(Rec.getAmtSugar());
		assertFalse(expected==actual);
        assertNotNull(Rec);

	}	
	
	@Test(expected =RecipeException.class )
	public void testSetAmtSugarNegative() throws NumberFormatException, RecipeException {
		int expected =1;
		int actual =0;
		String newValue = "-1";
		
		Recipe Rec=new Recipe();
		Rec.setAmtSugar(newValue);

		actual=Rec.getAmtSugar();
		System.out.println(actual);
		        assertNotNull(Rec);
		        		assertTrue(expected==actual);



	}
}
