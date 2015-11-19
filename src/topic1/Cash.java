package topic1;

public class Cash extends PaymentType {
	
	public Cash() {
		
		setId();
	}
	
	@Override
	public void calculate() {
		
		double total = 0;
		double mostExpensive;
		ShoppingCart cart = ShoppingCart.getInstance();
		
		mostExpensive = cart.getCart().get(0).getPrice();
		
		for(Item item : cart.getCart()) {
			
			total += item.getPrice();
			
			if(item.getPrice() > mostExpensive)
				mostExpensive = item.getPrice();
		}
		
		total -= mostExpensive*0.9;
		System.out.printf("The total using cash is $ %.2f", total);
	}

}