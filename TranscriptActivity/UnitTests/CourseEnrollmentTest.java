import org.junit.* ;
import static org.junit.Assert.* ;
public class CourseEnrollmentTest {
	@Test
	   public void test_returnCorrectGPA() {
	      System.out.println("Test correct gpa for a grade is returned...") ;
	      CourseEnrollment C=new  CourseEnrollment("java",3,"A");
	      double gpa=C.getGPAForGrade(C.getGrade());
	      assertTrue(gpa>=3.0 && gpa<=4.0) ;
	   }
	
	
	@Test
	   public void test_returnCorrectCredits() {
	      System.out.println("Test correct credits is returned...") ;
	      CourseEnrollment C=new  CourseEnrollment("java",4,"A");
	      
	      assertTrue(C.getCredits()==4) ;
	   }
	@Test
	   public void test_returnCorrectCode() {
	      System.out.println("Test correct Code is returned...") ;
	      CourseEnrollment C=new  CourseEnrollment("java",4,"A");
	      
	      assertTrue(C.getCourseCode().equals("java")) ;
	   }
	@Test
	   public void test_returnCorrectgrade() {
	      System.out.println("Test correct Grade is returned...") ;
	      CourseEnrollment C=new  CourseEnrollment("english 202",4,"B");	      
	      assertTrue(C.getGrade().equals("B")) ;
	   }
	@Test
	   public void test_setCorrectCode() {
	      System.out.println("Test correct Code is set...") ;
	      CourseEnrollment C=new  CourseEnrollment("java",4,"A");
	      C.setCourseCode("c++");
	      assertTrue(C.getCourseCode().equals("c++")) ;
	   }
	@Test
	   public void test_setCorrectGrade() {
	      System.out.println("Test correct Grade is set...") ;
	      CourseEnrollment C=new  CourseEnrollment("java",4,"B");
	      C.setGrade("C");
	      assertTrue(C.getGrade().equals("C")) ;
	   }
	@Test
	   public void test_setCorrectCredits() {
	      System.out.println("Test correct credits is set...") ;
	      CourseEnrollment C=new  CourseEnrollment("java",4,"C");
	      C.setCredits(3);
	      assertTrue(C.getCredits()==3) ;
	   }
	@Test
	   public void test_returnCorrectFormattedGPA() {
	      System.out.println("Test correct Formatted GPA is returned...") ;
	      CourseEnrollment C=new  CourseEnrollment("java",4,"C");
	      C.setGpa(3.2);	      
	      assertTrue(CourseEnrollment.getFormattedGPA(C.getGpa()).equals("3.20")) ;
	   }
	
	   
}
