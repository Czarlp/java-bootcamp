package topic1;

public class Item {
	
	private final String name;
	private final int code;
	private double price;
	private final String brand;
	protected static int stock;
	
	protected Item(String name, int code, double price, String brand, int stock) {
		this.name = name;
		this.code = code;
		this.price = price;
		this.brand = brand;
		this.stock = stock;
	}
		
	public String getName() {
		return name;
	}
		
	public int getCode() {
		return code;
	}
	
	public void setPrice(double value) {
		price = value;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public int getStock() {
		return stock;
	}
	
	@Override
	public String toString() {
		return ("Name: " + name + " Price: $ " + price);
	}

}
