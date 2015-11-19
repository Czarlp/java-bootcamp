package topic0.exercise1;

public class House {

	private Columns columns;
	private Roof roof;
	private Foundations foundations;
	private String name;
	
	public House(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setColumns(Columns columns) {
		this.columns = columns;
	}
	
	public Columns getColumns() {
		return columns;
	}
	
	public void setRoof(Roof roof) {
		this.roof = roof;
	}
	
	public Roof getRoof() {
		return roof;
	}
		
	public void setFoundations(Foundations foundations) {
		this.foundations = foundations;
	}
	
	public Foundations getFoundations() {
		return foundations;
	}
	
	@Override
	public String toString() {
		return "Name: " + name + "\nTotal foundations: $ " + foundations.total() + "\nTotal columns: $ "
				+ columns.total() + "\nTotal roof: $ " + roof.total() + "\n";
	}
}