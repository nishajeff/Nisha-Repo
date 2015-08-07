
import org.junit.* ;

import static org.junit.Assert.* ;

public class CalculatorTest {

   @Test
   public void test_addition(){
	   System.out.println("Test if addition is returning a double");
	  Calculator c=new Calculator();	   
	   assertTrue(c.addition(5, 4)==9.0);
   }
   @Test
   public void test_subtraction(){
	   System.out.println("Test if subtraction is returning a double");
	  Calculator c=new Calculator();	   
	   assertTrue(c.subtraction(5, 4)==1.0);
   }
   @Test
   public void test_multiplication(){
	   System.out.println("Test if multiplication is returning a double");
	  Calculator c=new Calculator();	   
	   assertTrue(c.multiplication(33, 3)==99.0);
   }
   @Test
   public void test_division(){
	   System.out.println("Test if division is returning a double");
	  Calculator c=new Calculator();	   
	   assertTrue(c.division(120, 10)==12.0);
   }
   
   @Test
   public void test_modulus(){
	   System.out.println("Test if modulus is returning a double");
	  Calculator c=new Calculator();	   
	   assertTrue(c.modulus(100, 3)==1.0);
   }
}