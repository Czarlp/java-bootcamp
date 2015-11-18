package topic0.exercise1;

public class Test {
	
	public static void main(String[] args) {
		
		HouseBuilder builder = new HouseBuilder();
		CabinBuilder cabin = new CabinBuilder();
		Director director = new Director(builder);
		
		director.construct();
		builder.getResult();
		
		System.out.println();
		
		director.setBuilder(cabin);
		director.construct();
		cabin.getResult();
	}
}