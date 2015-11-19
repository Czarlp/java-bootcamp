package topic0.exercise1;

public class Foundations {

	private String material;
	private double price;
	private int kg;
	private int dryingTime;
	
	public void setMaterial(String material) {
		this.material = material;
	}
	
	public String getMaterial() {
		return material;
	}
	
	public void setPrice(double precio) {
		this.price = precio;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setKg(int kg) {
		this.kg = kg;
	}
	
	public int getKg() {
		return kg;
	}
	
	public void setDryingTime(int time) {
		dryingTime = time;
	}
	
	public int getDryingTime() {
		return dryingTime;
	}
	
	public double total() {
		return kg*price;
	}
}
