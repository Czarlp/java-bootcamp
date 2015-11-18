package topic0.exercise1;

public class House {

	private double price;
	private int squareMts;
	private String owner;
	private String location;
	
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setSquareMts(int squareMts) {
		this.squareMts = squareMts;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public Double getPrice() {
		return price;
	}
	
	public int getSquareMts() {
		return squareMts;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	
	public String getLocation() {
		return location;
	}
}