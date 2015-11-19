package topic1;

import java.util.Scanner;

public class DerbysBuilder extends ItemBuilder {
	
	private Item derbys;
	
	@Override
	public void build() {
		
		Scanner scanner = new Scanner(System.in);
		String name, brand, hasHeels;
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
		System.out.print("Heel? (YES/NO)");
		hasHeels = scanner.next();
		System.out.print("Enter stock available: ");
		stock = scanner.nextInt();
		
		derbys = new Derbys(name, code, price, brand, stock, hasHeels);
		scanner.close();
	}
	
	@Override
	public Item getItem() {
		return derbys;
	}

}

