package topic0.exercise2;

public class Test {

	public static void main(String[] args) { 
		
		Factory creator;
		creator = new HospitalFactory();
		
		//Public hospital
		Hospital hospital1 = creator.create(0);
		hospital1.budget();
		
		System.out.println();
		
		//Private hospital
		Hospital hospital2 = creator.create(1);
		hospital2.budget();
		
	}
}