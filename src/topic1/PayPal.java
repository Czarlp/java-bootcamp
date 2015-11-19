package topic1;

import java.util.Scanner;

public class PayPal extends PaymentType {
	
	private String eMail;
	private String password;
	
	public PayPal() {
		
		setId();
		initialize();
	}
	
	@Override
	public void calculate() {
		
		double total = 0;
		double cheapestPrice;
		ShoppingCart cart = ShoppingCart.getInstance();
		
		cheapestPrice = cart.getCart().get(0).getPrice();
		
		for(Item item : cart.getCart()) {
			
			total += item.getPrice();
			
			if(item.getPrice() < cheapestPrice)
				cheapestPrice = item.getPrice();
			
			total -= cheapestPrice;
			System.out.printf("The total using PayPal is $ %.2f", total);
		}
	}
	
	public void initialize() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		
		System.out.print("Enter e-mail: ");
		eMail = scanner.next();
		System.out.print("Enter password: ");
		password = scanner.next();
		
		scanner.close();
		
	}

}

