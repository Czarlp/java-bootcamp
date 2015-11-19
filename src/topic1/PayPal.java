package topic1;

import java.util.Scanner;

public class PayPal extends PaymentType {
	
	private Scanner scanner;
	private String eMail;
	private String password;
	
	public PayPal() {
		initialize();
	}
	
	@Override
	public void calculate() {
		
	}
	
	public void initialize() {
		scanner = new Scanner(System.in);
		System.out.println();
		System.out.print("Enter e-mail: ");
		eMail = scanner.next();
		System.out.print("Enter password: ");
		password = scanner.next();
	}

}

