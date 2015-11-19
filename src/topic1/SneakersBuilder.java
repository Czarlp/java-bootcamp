package topic1;

import java.util.Scanner;

public class SneakersBuilder extends ItemBuilder {
	
	private Item sneakers;
	
	@Override
	public void build() {
		
		Scanner scanner = new Scanner(System.in);
		String name, brand, shoelaceColour;
		int code, stock;
		double price;
		boolean hasHeel;
		
		System.out.print("Enter name of the Shoes: ");
		name = scanner.next();
		System.out.print("Enter code number: ");
		code = scanner.nextInt();
		System.out.println("Enter price: $ ");
		price = scanner.nextDouble();
		System.out.print("Enter brand name: ");
		brand = scanner.nextLine();
		System.out.print("Enter stock available: ");
		stock = scanner.nextInt();
		System.out.print("Enter shoelaces colour: ");
		shoelaceColour = scanner.nextLine();
				
		sneakers = new Sneakers(name, code, price, brand, shoelaceColour, stock);
		scanner.close();
	}
	
	@Override
	public Item getItem() {
		return sneakers;
	}

}


