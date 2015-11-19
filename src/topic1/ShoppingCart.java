package topic1;

import java.util.Scanner;
import java.util.ArrayList;

public class ShoppingCart implements ItemManager {
	
	private static ShoppingCart cart = null;
	private Shop shop = Shop.getInstance();
	private static ArrayList<Item> cartList;
	private Scanner scanner = new Scanner(System.in);
	private PaymentType paymentType;
	
	private ShoppingCart() {}
	
	public static ShoppingCart getInstance() {
		
		if(cart == null) {
			
			cart = new ShoppingCart(); 
			cartList = new ArrayList<>();
		}
		
		return cart;
	}
	
	public ArrayList<Item> getCart() {
		
		return cartList;
	}
	
	@Override
	public void add() {
		
		Item item;
		
		item = shop.search();
		if (item != null)
			cartList.add(item);
		else
			System.out.print("\nWrong code number or item not found.\n");
			
	}
	
	public void clearCart() {
		
		cartList.clear();
	}
	
	@Override
	public void list() {
		
		if(!cartList.isEmpty())
			for(Item item: cartList)
				System.out.printf("\nName: %s\tPrice: $ %.2f\n", item.getName(), item.getPrice());
		else
			System.out.print("Empty cart.\n");
	}
	
	@Override
	public void delete() {
		
		if(!cartList.isEmpty()) {
		int removeItem;
		Item item;
		
		list();
		System.out.print("Code of the item to remove: ");
		removeItem = scanner.nextInt();
		
		list();
		
		}
		else
			System.out.print("Empty cart.\n");
		
	}
	
	public void payMethod() {
		
		int choice;
		System.out.print("\nEnter 0 for Cash payment, 1 for Credit Card or 2 for PayPal: ");
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
	
	public void total() {
		
		if(!cartList.isEmpty())
			paymentType.calculate();
		else
			System.out.print("Empty cart.\n");
	}
	
}