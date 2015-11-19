package topic1;

import java.util.Scanner;

public class ShoesBuilder extends ItemBuilder {
	
	private Item shoes;
	
	@Override
	public void build() {
		
		Scanner scanner = new Scanner(System.in);
		String name, brand, type;
		int code, stock;
		double price;
		
		System.out.print("Enter name of the Shoes: ");
		name = scanner.next();
		System.out.print("Enter code number: ");
		code = scanner.nextInt();
		System.out.println("Enter price: $ ");
		price = scanner.nextDouble();
		System.out.print("Enter brand name: ");
		brand = scanner.nextLine();
		System.out.print("Enter type: ");
		type = scanner.next();
		System.out.print("Enter stock available: ");
		stock = scanner.nextInt();
		
		shoes = new Shoes(name, code, price, brand, stock, type);
		scanner.close();
	}
	
	@Override
	public Item getItem() {
		return shoes;
	}

}