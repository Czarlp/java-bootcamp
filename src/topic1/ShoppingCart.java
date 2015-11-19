package topic1;

import java.util.Scanner;
import java.util.ArrayList;

public class ShoppingCart {
	
	private static ShoppingCart cart = null;
	private ArrayList<Item> cartList;
	public Scanner scanner = new Scanner(System.in);
	public PaymentType paymentType;
	
	private ShoppingCart() {}
	
	public static ShoppingCart getInstance() {
		if(cart == null) 
			cart = new ShoppingCart();
			
		
		
		return cart;
	}
	
	public void addToCart() {
		
		cartList = new ArrayList<>();
		int end = 0;
		
		while(end != 1) {
			int id;
			System.out.print("Enter the id of the desired product: ");
			id = scanner.nextInt();
			
		}
	}
	
	public void clearCart() {
		cartList.clear();
	}
	
	public void payMethod() {
		
		int choice;
		System.out.print("Enter 0 for Cash payment, 1 for Credit Card or 2 for PayPal: ");
		choice = scanner.nextInt();
		
		switch(choice) {
		
		case 0:
			paymentType = new Cash();
			break;
		case 1:
			paymentType = new CreditCard();
			break;
		case 2:
			paymentType = new PayPal();
			break;
			
		}
		
		System.out.println();
	}
	
}