package topic1;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
	
	private ArrayList<Item> itemList;
	private ItemBuilder builder;
	private Scanner scanner = new Scanner(System.in);
	
	protected Shop() {
		itemList = new ArrayList<>();
	}
	
	
	public void addItem() {
		
		int choice;
		
		System.out.print("Enter \n 1 - Shoes\n 2 - Sneakers\n 3 - Derbys\n 0 - Exit");
		choice = scanner.nextInt();
		
		while(choice != 0) {
			
			switch(choice) {
				case 0:
					builder = new ShoesBuilder();
					break;
				case 1:
					builder = new SneakersBuilder();
					break;
				case 2:
					builder = new DerbysBuilder();
					break;
			}
			
			builder.build();
			itemList.add(builder.getItem());
			
			System.out.print("Enter \n 1 - Shoes\n 2 - Sneakers\n 3 - Derbys\n 0 - Exit");
			choice = scanner.nextInt();
		}
	}
	
	
	public void list() {
				
		for(Item item: itemList) {
			System.out.printf("Name\t%s\nCode Number\t%d\nBrand\t%s\nPrice\t$ %.2f\nStock\t%d\n", item.getName(), item.getCode(), 
					item.getBrand(), item.getPrice(), item.getStock());
			
			if (item instanceof Sneakers)
				System.out.printf("Shoelace Colour\t%s", ((Sneakers)item).getShoelaceColour());	
			else if (item instanceof Shoes)
				System.out.printf("Type\t%s", ((Shoes)item).getType());
			else
				System.out.printf("Heels\t%s", ((Derbys)item).hasHeels());	
			
			System.out.println();
			
			}
	}
	
	
	public void update() {
		
		Item item = search();
		
		if (item != null) {
			
			double newPrice;
			
			System.out.printf("Enter new price for %s", item.getName());
			newPrice = scanner.nextDouble();
			item.setPrice(newPrice);
			System.out.printf("Price updated! New price is $ %.2f\n", newPrice);
			
		}
		else
			System.out.print("Wrong code number or item not found.\n");
	}
	
	
	public void delete() {
		
		Item item = search();
		
		if (item != null) {
			
			itemList.remove(item);
			System.out.print("Item removed!\n");
		}
		else
			System.out.print("Wrong code number or item not found.\n");
	}
	
	public Item search() {
		
		int searchCode;
		
		System.out.print("Enter coder number to search: ");
		searchCode = scanner.nextInt();
		Item item;
		int iterator = 0;
		
		while (iterator <= itemList.size()) {
			if (itemList.get(iterator).getCode() == searchCode)
				return itemList.get(iterator);
			else
				iterator += 1;
		}
		
		return null;
	}

}