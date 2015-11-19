package topic1;

import java.util.Scanner;

public class Test {
	
	private static Scanner scanner;
	private static ShoppingCart cart;
	private static Shop shop;
	
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		
		cart = ShoppingCart.getInstance();
		shop = Shop.getInstance();
		
		menu();
		
	}
	
	public static void menu() {
		
		int opt;
		System.out.printf("1 - Upload items to the shop\n2 - Update prices\n3 - Remove Items\n4 - List Shop Items\n"
				+ "5 - Add item to cart\n6 - Remove item from cart\n7 - Clear cart\n8 - Pay\n0 - Exit ");
		opt = scanner.nextInt();
		
		while (opt != 0) {
			
			switch(opt) {
			
				case 1:
					shop.add();
					break;
				case 2:
					shop.update();
					break;
				case 3:
					shop.delete();
					break;
				case 4:
					shop.list();
					break;
				case 5:
					cart.add();
					break;
				case 6:
					cart.delete();
					break;
				case 7:
					cart.clearCart();
					break;
				case 8:
					cart.payMethod();
					break;
					
			}
			
			System.out.printf("1 - Upload items to the shop\n2 - Update prices\n3 - Remove Items\n4 - List Shop Items\n"
					+ "5 - Add item to cart\n6 - Remove item from cart\n7 - Clear cart\n8 - Pay\n0 - Exit ");
			opt = scanner.nextInt();
		}
	}
}