package topic0.exercise1;

public class Test {
	
	public static void main(String[] args) {
		
		HouseBuilder houseBuilder = new HouseBuilder();
		CabinBuilder cabinBuilder = new CabinBuilder();
		Director director = new Director(houseBuilder);
		
		director.construct();
		System.out.print(houseBuilder.getHouse());
		
		System.out.println();
		
		director.setBuilder(cabinBuilder);
		director.construct();
		System.out.print(cabinBuilder.getHouse());
	}
}