package topic0.exercise2;

public class Test {

	public static void main(String[] args) { 
		
		Factory creator;
		creator = new HospitalFactory();
		
		Hospital hospital1 = creator.create();
		hospital1.budget();
		
		System.out.println();
		
		Hospital hospital2 = creator.create();
		hospital2.budget();
		
	}
}