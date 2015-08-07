
import java.util.Random;
public class CourseEnrollment {
	private String courseCode;
	private int credits;
	private String grade;
	private double gpa;
	
	public CourseEnrollment( String courseCode,int credits,String grade){
		this.courseCode=courseCode;
		this.credits=credits;
		this.grade=grade;
		gpa=this.getGPAForGrade(grade);
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public int getCredits() {
		return credits;
	}

	public void setCredits(int credits) {
		this.credits = credits;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public double getGPAForGrade(String grade){
		double gpa=0.0;
		Random r=new Random();
		if(grade.equals("A")){			
			gpa=3.0 + r.nextDouble();
		}
		else if(grade.equals("B")){			
			gpa=2.0 + r.nextDouble();
		}
		else if(grade.equals("C")){			
			gpa=1.0 +r.nextDouble();
		}
		else
			gpa=r.nextDouble();
		return gpa;
	}
	public static String getFormattedGPA(double gpa){
		return String.format("%.2f", gpa);
		

	}
	public String toString(){
		return courseCode+"\t"+credits+"\t"+grade+"\t"+getFormattedGPA(gpa)+"\n";
	}

}
