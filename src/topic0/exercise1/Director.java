package topic0.exercise1;

public class Director {

	Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void setBuilder(Builder builder) {
		this.builder = builder;
	}
	
	
	public void construct() {
		
		builder.buildFoundations();
		builder.buildColumns();
		builder.buildRoof();
	}
}