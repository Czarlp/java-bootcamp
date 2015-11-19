package topic0.exercise1;

public class CabinBuilder implements Builder {
	
	protected House cabin;
	protected Foundations foundations;
	protected Columns columns;
	protected Roof roof;
	
	public CabinBuilder() {
		
		cabin = new House("American Cabin");
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
		cabin.setFoundations(foundations);
		
	}
	
	@Override
	public void buildColumns() {
		
		columns.setMaterial("Madera");
		columns.setPrice(250.00);
		columns.setQuantity(16);
		cabin.setColumns(columns);
		
	}
	
	@Override
	public void buildRoof() {
		
		roof.setMaterial("Teja");
		roof.setPrice(30.00);
		roof.setQuantity(500);
		cabin.setRoof(roof);
	}
	
	@Override
	public House getHouse() {
		return cabin;
	}
}