import org.junit.* ;
import static org.junit.Assert.* ;
public class ValidatorTest {
	@Test
	public void test_returnCorrectValidateGrade() {
	      System.out.println("Test correct validation is done for a grade ...") ;
	     assertTrue(Validator.ValidateGrade("C"));
	   }
	@Test
	public void test_returnCorrectValidateCredits() {
	      System.out.println("Test correct validation is done for  credits ...") ;
	     assertFalse(Validator.ValidateCredits("5"));
	   }

}
