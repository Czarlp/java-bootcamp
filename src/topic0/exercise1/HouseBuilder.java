package topic0.exercise1;

public class HouseBuilder implements Builder {
	
	protected House house;
	protected Foundations foundations;
	protected Columns columns;
	protected Roof roof;
	
	public HouseBuilder() {
		
		house = new House("English House");
		foundations = new Foundations();
		columns = new Columns();
		roof = new Roof();
	}
	
	@Override
	public void buildFoundations() {
		
		foundations.setMaterial("Porlan");
		foundations.setKg(500);
		foundations.setPrice(250.00);
		foundations.setDryingTime(48);
		house.setFoundations(foundations);
		
	}
	
	@Override
	public void buildColumns() {
		
		columns.setMaterial("Hierro");
		columns.setPrice(375.00);
		columns.setQuantity(12);
		house.setColumns(columns);
		
	}
	
	@Override
	public void buildRoof() {
		
		roof.setMaterial("Chapa");
		roof.setPrice(175.00);
		roof.setQuantity(10);
		house.setRoof(roof);
	}
	
	@Override
	public House getHouse() {
		return house;
	}
	
}