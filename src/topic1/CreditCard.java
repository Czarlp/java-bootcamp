package topic1;
import java.util.Scanner;

public class CreditCard extends PaymentType {
	
	private String name;
	private int creditCardNumber;
	
	public CreditCard() {
		
		setId();
		initialize();
	}
	
	@Override
	public void calculate() {
		
		double total = 0;
		ShoppingCart cart = ShoppingCart.getInstance();
		
		for(Item item : cart.getCart())
			total += item.getPrice();
		
		total = total - total*0.10;
		System.out.printf("The total using credit card is $ %.2f", total);
	}
	
	
	public void initialize() {		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		
		System.out.print("Enter full name of the owner: ");
		name = scanner.nextLine();
		System.out.print("Enter credit card number: ");
		creditCardNumber = scanner.nextInt();
		
		scanner.close();
	}
}

