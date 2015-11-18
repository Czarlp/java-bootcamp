package topic0.exercise1;

public class HouseBuilder implements Builder {
	
	protected House house;

	@Override
	public void buildPart() {
		
		house = new House();
		house.setPrice(1500000.50);
		house.setSquareMts(20);
		house.setOwner("Ricardo");
		house.setLocation("Texas");
	}
	
	public void getResult() {
			System.out.printf("The house's owner is %s, its price it's $ %.2f, it has %d square meters.\n" + 
					"It's located in %s.\n", house.getOwner(), house.getPrice(), house.getSquareMts(), house.getLocation());
	}
	
}