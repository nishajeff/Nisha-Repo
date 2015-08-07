import org.junit.* ;

import static org.junit.Assert.* ;

public class InvoiceTest {

   @Test
   public void test_returnDouble(){
	   System.out.println("Test if price is returned in double");
	   Invoice i=new Invoice();
	   i.setPrice(5);
	   assertTrue(i.getPrice()==5.0);
   }
}