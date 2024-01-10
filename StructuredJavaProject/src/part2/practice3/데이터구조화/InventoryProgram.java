package part2.practice3.데이터구조화;

import java.util.Scanner;

public class InventoryProgram {
	public static void main(String[] args) {
		Product product = new Product();
		Inventory inventory = new Inventory();
		addInventory(product, inventory);
		displayInventory(inventory);
	}
	private static void addInventory(Product product, Inventory inventory) {
		Scanner sc = new Scanner(System.in);
		System.out.println("상품 입력");

		String name; 
		int price, quantity;
		
		System.out.println("상품 이름"); 
		name=sc.next();
		do {
			System.out.println("가격");
			price=sc.nextInt();
			if(price<0) {
				System.out.println("가격은 0보다 커야합니다.");
			}
		}while(price<0);
		do {
			System.out.println("수량");
			quantity=sc.nextInt();
			if(quantity<0) {
				System.out.println("수량은 0보다 커야합니다.");
			}
		}while(quantity<0);
		product.name=name;
		product.price=price;
		product.quantity=quantity;
		
	}
	private static void displayInventory(Inventory inventory) {
		System.out.println("상품 출력");
		for( int i=0; i<)
	}

	
}
