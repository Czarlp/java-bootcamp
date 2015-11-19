package topic1;

import java.util.Scanner;

public class ShoesBuilder extends ItemBuilder {
	
	private Item shoes;
	private Scanner keyboard;
	
	@Override
	public Item build() {
		
		keyboard = new Scanner(System.in);
		String name, brand, type;
		int code, stock;
		double price;
		
		System.out.print("\nEnter name of the Shoes: ");
		name = keyboard.next();
		System.out.print("Enter code number: ");
		code = keyboard.nextInt();
		System.out.print("Enter price $ ");
		price = keyboard.nextDouble();
		System.out.print("Enter brand name: ");
		brand = keyboard.next();
		System.out.print("Enter type: ");
		type = keyboard.next();
		System.out.print("Enter stock available: ");
		stock = keyboard.nextInt();
		
		System.out.println();
		shoes = new Shoes(name, code, price, brand, stock, type);
		
		return shoes;
	}
	
	@Override
	public Item getItem() {
		return shoes;
	}

}