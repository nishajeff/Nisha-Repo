import org.junit.* ;
import java.util.ArrayList;
import static org.junit.Assert.* ;
public class TranscriptTest {   
	
	@Test
	   public void test_returnCorrectTranscript() {
	      System.out.println("Test correct transcript is returned...") ;
	      CourseEnrollment C=new  CourseEnrollment("java",4,"A");
	      Transcript T=new Transcript();
	      T.addCourse(C);	      
	      assertTrue(T.getTranscript().contains(C)) ;
	   }
	@Test
	public void test_setCorrectTranscript() {
	      System.out.println("Test correct transcript is set...") ;
	      CourseEnrollment C=new  CourseEnrollment("english",4,"B");
	      Transcript T=new Transcript();
	      T.addCourse(C);	
	      ArrayList<CourseEnrollment>Returned=T.getTranscript();
	      assertTrue(Returned.get(0).getCredits()==4) ;
	   }
	
	@Test
	public void test_returnCorrectOverallGPA() {
	      System.out.println("Test correct OverallGPA is returned...") ;
	      Transcript T=new Transcript();
	      CourseEnrollment C=new  CourseEnrollment("english",4,"B");
	      C.setGpa(3.0);	    
	      T.addCourse(C);	
	      CourseEnrollment D=new  CourseEnrollment("english",4,"A");
	      D.setGpa(4.0);	    
	      T.addCourse(D);	      
	      assertTrue(T.getOverallGPA()==3.5) ;
	   }
	
	@Test
	public void test_addCorrectCourse() {
	      System.out.println("Test correct Course is added...") ;
	      CourseEnrollment C=new  CourseEnrollment("english",4,"B");
	      Transcript T=new Transcript();
	      T.addCourse(C);
	      ArrayList<CourseEnrollment>Returned=T.getTranscript();
	      assertTrue(Returned.get(0).getCourseCode()=="english") ;
	   }
	@Test
	public void test_returnCorrectFormattedOverallGPA() {
	      System.out.println("Test correct Formatted OverallGPA is returned...") ;
	      Transcript T=new Transcript();
	      CourseEnrollment C=new  CourseEnrollment("english",4,"B");
	      C.setGpa(3.0);	    
	      T.addCourse(C);	
	      CourseEnrollment D=new  CourseEnrollment("english",4,"A");
	      D.setGpa(4.0);	    
	      T.addCourse(D);	      
	      assertTrue(Transcript.getFormattedOverallGPA(T.getOverallGPA()).equals("3.50")) ;
	   }
	
	   
}
