
public class Education {
     String [] LastSchoolsAttended;

     public Education(){
    	 LastSchoolsAttended=new String[5];
    	
     }
	public String[] getLastSchoolsAttended() {
		return LastSchoolsAttended;
	}

	public void setLastSchoolsAttended(String[] lastSchoolsAttended) {
		LastSchoolsAttended = lastSchoolsAttended;
	}
     public String toString(){
    	String output ="Schools    Attended   :\n";
    	for(int i=0;i<LastSchoolsAttended.length;i++)
    		output+=LastSchoolsAttended[i]+"\n";
    	return output;
     }
     
}
