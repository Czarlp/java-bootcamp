package topic1;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop implements ItemManager {
	
	private static Shop shop = null;
	private static ArrayList<Item> itemList;
	private ItemBuilder builder;
	public Scanner scanner = new Scanner(System.in);
	
	private Shop(){};
	
	public static Shop getInstance() {
		
		if (shop == null) {
			
			shop = new Shop();
			itemList = new ArrayList<>();
			}
		
		return shop;
	}
	
	@Override
	public void add() {
		
		int choice;
		
		System.out.print("\n\n 1 - Shoes\n 2 - Sneakers\n 3 - Derbys\n 0 - Exit ");
		choice = scanner.nextInt();
		
		while(choice != 0) {
			
			switch(choice) {
				case 1:
					builder = new ShoesBuilder();
					break;
				case 2:
					builder = new SneakersBuilder();
					break;
				case 3:
					builder = new DerbysBuilder();
					break;
			}
			
			itemList.add(builder.build());
			
			System.out.print("\n\n 1 - Shoes\n 2 - Sneakers\n 3 - Derbys\n 0 - Exit ");
			choice = scanner.nextInt();
			
		}
	}
	
	@Override
	public void list() {
				
		for(Item item: itemList) {
			
			System.out.printf("\nName\t%s\nCode Number\t%d\nBrand\t%s\nPrice\t$ %.2f\nStock\t%d\n", item.getName(), item.getCode(), 
					item.getBrand(), item.getPrice(), item.getStock());
			
			if (item instanceof Sneakers)
				System.out.printf("Shoelace Colour\t%s", ((Sneakers)item).getShoelaceColour());	
			else if (item instanceof Shoes)
				System.out.printf("Type\t%s", ((Shoes)item).getType());
			else
				System.out.printf("Heels\t%s", ((Derbys)item).hasHeels());	
			
			}
	}
	
	
	public void update() {
		
		Item item = search();
		
		if (item != null) {
			
			double newPrice;
			
			System.out.printf("\nEnter new price for %s", item.getName());
			newPrice = scanner.nextDouble();
			item.setPrice(newPrice);
			System.out.printf("Price updated! New price is $ %.2f\n", newPrice);
			
		}
		else
			System.out.print("Wrong code number or item not found.\n");
	}
	
	
	@Override
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
		
		System.out.print("\nEnter code number to search: ");
		searchCode = scanner.nextInt();
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