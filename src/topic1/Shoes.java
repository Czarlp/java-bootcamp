package topic1;

public class Shoes extends Item {
	
	private final String type;
	
	protected Shoes(String name, int code, double price, String brand, int stock, String type) {
		super(name, code, price, brand, stock);
		this.type = type;		
	}
	
	public String getType() {
		return type;
	}
		
}