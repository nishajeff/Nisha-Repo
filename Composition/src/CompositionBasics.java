
public class CompositionBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []schools={"Rutgers","Stevens","Marlboro High","Marlboro Memorial Middle","Robertsville Elementary"};
		Person bobby = new Person("manager",1000L,1234,schools);
        System.out.println(bobby.getSalary());
        System.out.println(bobby);
        
	}

}
