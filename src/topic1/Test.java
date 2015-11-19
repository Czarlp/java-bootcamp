package topic1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public ArrayList<Item> list;
	public static Scanner scanner;
	public static ShoppingCart cart;
	
	public static void main(String[] args) {
		
		scanner = new Scanner(System.in);
		cart = ShoppingCart.getInstance();
		cart.payMethod();
		
	}
	
}