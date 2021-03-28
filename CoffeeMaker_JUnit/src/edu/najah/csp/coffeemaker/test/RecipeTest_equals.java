package edu.najah.csp.coffeemaker.test;




import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;

public class RecipeTest_equals {

	@Test
	public void testEqualsObject() {
		Recipe Rec=new Recipe();
		Recipe Rec2=new Recipe();
		Object Obj=new Object();
		System.out.println(Rec.getClass());
		if (Rec.getClass() == Rec2.getClass()) System.out.println("Equals");
		if (Rec.getClass() == Obj.getClass()) System.out.println("Equals");
		else System.out.println("not Equals");
		Rec.setName("hamza");
		if (Rec.getClass() == Rec2.getClass()) System.out.println("default name of one objects");
		
		Rec2.setName("rami");
		if (Rec.getClass() == Rec2.getClass()) System.out.println("default name of two objects");
		
	}

}
