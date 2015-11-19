package topic1;
import java.util.Scanner;

public class CreditCard extends PaymentType {
	
	private Scanner scanner;
	private String name;
	private int creditCardNumber;
	
	public CreditCard() {
		initialize();
	}
	
	@Override
	public void calculate() {
		
	}
	
	
	public void initialize() {
		scanner = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter full name of the owner: ");
		name = scanner.nextLine();
		System.out.print("Enter credit card number: ");
		creditCardNumber = scanner.nextInt();
	}

}

