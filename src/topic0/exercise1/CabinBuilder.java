package topic0.exercise1;

public class CabinBuilder implements Builder {
	
	protected House cabin;
	
	@Override
	public void buildPart() {
		
		cabin = new House();
		cabin.setPrice(3000000.00);
		cabin.setOwner("Mary Ann");
		cabin.setSquareMts(50);
		cabin.setLocation("Los Alpes");
	}
	
	public void getResult() {
		System.out.printf("The cabin's owner is %s, its price it's $ %.2f, it has %d square meters.\n" + 
				"It's located in %s.\n", cabin.getOwner(), cabin.getPrice(), cabin.getSquareMts(), cabin.getLocation());
	}
}