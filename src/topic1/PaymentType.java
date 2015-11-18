package topic1;

public abstract class PaymentType {
	
	private static int ID = 1;
	private int idNumber;
	
	public void setId() {
		idNumber = ID;
		ID += 1;
	}
	
	public int getId() {
		return idNumber;
	}

	public abstract void calculate();
}


