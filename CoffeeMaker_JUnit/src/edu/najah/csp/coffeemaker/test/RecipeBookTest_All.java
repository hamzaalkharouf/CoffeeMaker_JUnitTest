package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;
import org.junit.Before;
import edu.najah.csp.coffeemaker.Recipe;
import edu.najah.csp.coffeemaker.RecipeBook;

public class RecipeBookTest_All {

	private Recipe Rec;
	private Recipe Rec2;
	private Recipe Rec3;
	private Recipe Rec4;
	private Recipe Rec5;
	private Recipe Rec1_2; 
	RecipeBook recipeBook;

	@Before
	@Test
	public void setnewRecipe() throws Exception
	{
		recipeBook = new RecipeBook();

		Rec = new Recipe();
		Rec.setName("Coffee");
		Rec.setAmtChocolate("0");
		Rec.setAmtCoffee("3");
		Rec.setAmtMilk("1");
		Rec.setAmtSugar("1");
		Rec.setPrice("50");
		assertTrue(Rec != null);

		Rec2 = new Recipe();
		Rec2.setName("Mocha");
		Rec2.setAmtChocolate("20");
		Rec2.setAmtCoffee("3");
		Rec2.setAmtMilk("1");
		Rec2.setAmtSugar("1");
		Rec2.setPrice("75");
		assertTrue(Rec2 != null);

		Rec3 = new Recipe();
		Rec3.setName("Latte");
		Rec3.setAmtChocolate("0");
		Rec3.setAmtCoffee("3");
		Rec3.setAmtMilk("3");
		Rec3.setAmtSugar("1");
		Rec3.setPrice("100");
		assertTrue(Rec3 != null);

		Rec4 = new Recipe();
		Rec4.setName("Hot Chocolate");
		Rec4.setAmtChocolate("4");
		Rec4.setAmtCoffee("0");
		Rec4.setAmtMilk("1");
		Rec4.setAmtSugar("1");
		Rec4.setPrice("65");
		assertTrue(Rec4 != null);

		Rec5 = new Recipe();
		Rec5.setName("Double Chocolate Hot Chocolate");
		Rec5.setAmtChocolate("8");
		Rec5.setAmtCoffee("0");
		Rec5.setAmtMilk("1");
		Rec5.setAmtSugar("1");
		Rec5.setPrice("65");
		assertTrue(Rec5 != null);

		Rec1_2 = new Recipe();
		Rec1_2.setName("OtherCoffee");
		Rec1_2.setAmtChocolate("0");
		Rec1_2.setAmtCoffee("3");
		Rec1_2.setAmtMilk("1");
		Rec1_2.setAmtSugar("1");
		Rec1_2.setPrice("50");
		assertTrue(Rec1_2 != null);

				
	}

	@After
	@Test
	public void MakeObjectNull() throws Exception
	{
		recipeBook = null;
		assertTrue(recipeBook == null);
	}
	@Test 
	public void testOriginRecipe ()
	{
		assertTrue(recipeBook.getRecipes() instanceof Recipe []);
	}

	@Test
	public void testAddRecipeSucceeds()
	{

		assertTrue(recipeBook.addRecipe(Rec2));
		assertEquals("Mocha", recipeBook.getRecipes()[0].getName());
		assertEquals(20,recipeBook.getRecipes()[0].getAmtChocolate());
		assertEquals(3,recipeBook.getRecipes()[0].getAmtCoffee());
		assertEquals(1,recipeBook.getRecipes()[0].getAmtMilk());
		assertEquals(1,recipeBook.getRecipes()[0].getAmtSugar());
	}


	//@Test(expected = ArithmeticException.class)
	//@Test(expected = NumberFormatException.class)
	@Test
	public void testAddRecipeFailsSameInstance()
	{
		recipeBook.addRecipe(Rec);
		assertFalse(recipeBook.addRecipe(Rec));
	}

	@Test
	public void testAddRecipeFailsDifferentInstance() {
		recipeBook.addRecipe(Rec);
		assertTrue(recipeBook.addRecipe(Rec1_2));
	}
	

	@Test
	public void testAddRecipeFailsNameChange ()
	{
		recipeBook.addRecipe(Rec);
		recipeBook.addRecipe(Rec2);
		String A = Rec3.getName();
		recipeBook.editRecipe(0, Rec3);
		String B = recipeBook.getRecipes()[0].getName();
		assertNotEquals(A, B);
		
	}

	@Test
	public void testAddRecipeFailsAfterDelete()
	{
		recipeBook.addRecipe(Rec);
		recipeBook.addRecipe(Rec2);
		recipeBook.addRecipe(Rec3);
		recipeBook.deleteRecipe(0);
		recipeBook.addRecipe(Rec4);
		assertNotEquals(Rec4, recipeBook.getRecipes()[0]);
	}

	@Test
	public void testDeleteRecipeSetToNull()
	{
		recipeBook.addRecipe(Rec);
		recipeBook.deleteRecipe(0);
		String x = recipeBook.getRecipes()[0].getName();//null
		assertTrue(recipeBook.getRecipes()[0].getName().equals(x));
	}

	@Test
	public void testDeleteRecipe()
	{
		recipeBook.addRecipe(Rec);
		String deleted = recipeBook.deleteRecipe(0);
		assertEquals("Coffee",deleted);
	}

	@Test
	public void testEditRecipe()
	{
		recipeBook.addRecipe(Rec);
		assertNotEquals("Mocha",recipeBook.editRecipe(0, Rec2));
		assertEquals(20,recipeBook.getRecipes()[0].getAmtChocolate());
		assertEquals(3,recipeBook.getRecipes()[0].getAmtCoffee());
		assertEquals(1,recipeBook.getRecipes()[0].getAmtMilk());
		assertEquals(1,recipeBook.getRecipes()[0].getAmtSugar());
	}
	

	@Test
	public void testDeleteRecipenull()
	{
		recipeBook.addRecipe(Rec);
		assertEquals(null, recipeBook.deleteRecipe(1));
	}
	

	@Test 
	public void testEditRecipenull ()
	{
		recipeBook.addRecipe(Rec);
		assertEquals(null,recipeBook.editRecipe(1, Rec2) );
	}
	
	
}
