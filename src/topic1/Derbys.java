package topic1;

public class Derbys extends Item {
	
	private final String hasHeel;
	
	protected Derbys(String name, int code, double price, String brand, int stock, String hasHeel) {
		super(name, code, price, brand, stock);
		this.hasHeel = hasHeel;
	}
		
	public String hasHeels() {
		return hasHeel;
	}
	
}