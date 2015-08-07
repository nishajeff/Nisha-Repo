import java.util.ArrayList;
public class Transcript {
	private ArrayList<CourseEnrollment>transcript;
	
	public Transcript(){
		transcript=new ArrayList<CourseEnrollment>();
	}

	public ArrayList<CourseEnrollment> getTranscript() {
		return transcript;
	}

	public void setTranscript(ArrayList<CourseEnrollment> transcript) {
		this.transcript = transcript;
	}
	public void addCourse(CourseEnrollment course){
		transcript.add(course);
	}
	
	public double getOverallGPA(){
		double total=0.0;
		for(CourseEnrollment temp:transcript){			
			total+=temp.getGpa();
		}		
		total/=transcript.size();
		return total;
	}
	public static String getFormattedOverallGPA(double gpa){
		return String.format("%.2f", gpa);
	}
	public String toString(){
		String output="";
		for(CourseEnrollment temp:transcript)
			output+=temp.toString();
		output+="\nOverall GPA = "+getFormattedOverallGPA(this.getOverallGPA());
		return output;
	}
}
