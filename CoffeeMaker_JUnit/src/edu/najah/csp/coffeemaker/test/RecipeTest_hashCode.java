package edu.najah.csp.coffeemaker.test;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.najah.csp.coffeemaker.Recipe;

public class RecipeTest_hashCode {

    @Test
    public void hashCodeTeststring(){
    	Recipe Rec=new Recipe();
        Rec.setName("hamza");
        long value1 = Rec.hashCode();
        long value2 = 31 + Rec.getName().hashCode();
        assertEquals(value1,value2);
    }
    public void hashCodeTestempty(){
    	Recipe Rec=new Recipe();
        Rec.setName("");
        long value1 = Rec.hashCode();
        long value2 = 31 + Rec.getName().hashCode();
        assertEquals(value1,value2);
    }
    public void hashCodeTestnull(){
    	Recipe Rec=new Recipe();
          Rec.setName(null);
        long value1 = Rec.hashCode();
        long value2 = 31;
        assertEquals(value1,value2);
    }
    
    
    
    
}
