package topic1;

public class Sneakers extends Item {

	private final String shoelaceColour;
	
	protected Sneakers(String name, int code, double price, String brand, String shoelaceColour, int stock) {
		super(name, code, price, brand, stock);
		this.shoelaceColour = shoelaceColour;
	}
	

	public String getShoelaceColour() {
		return shoelaceColour;
	}
		
}