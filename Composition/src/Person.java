
public class Person {

	//composition has-a relationship
    private Job job;
    private Education ed;
    
    public Person(String role,long salary,int id,String [] schools){
        this.job=new Job(role,salary,id);
        this.ed=new Education();        
        ed.setLastSchoolsAttended(schools);
    }
    public long getSalary() {
        return job.getSalary();
    }
    public String toString(){
    	return job.toString()+ed.toString();
    }
}
