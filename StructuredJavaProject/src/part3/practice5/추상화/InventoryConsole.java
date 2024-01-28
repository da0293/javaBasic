package part3.practice5.추상화;

import java.util.Scanner;

public class InventoryConsole {
	Inventory inventory = new Inventory();
	
	public void inputInventory() {
		Scanner sc = new Scanner(System.in);
		System.out.println("상품 입력");
		
		String name; 
		int price, quantity;
		
		System.out.printf("상품 이름 : "); 
		name=sc.next();
		do {
			System.out.print("가격 : ");
			price=sc.nextInt();
			if(price<0) {
				System.out.println("가격은 0보다 커야합니다.");
			}
		}while(price<0);
		do {
			System.out.print("수량 : ");
			quantity=sc.nextInt();
			if(quantity<0) {
				System.out.println("수량은 0보다 커야합니다.");
			}
		}while(quantity<0);
		
		Product product= new Product(name, price, quantity); 
		// 더하는 메서드 
		inventory.add(product);
		
	}
	
	// 재고목록 총 출력 
	public void outputInventory() {
		this.outputInventory(inventory.size());
	}

	// 재고목록 필요범위까지만 출력
	public void outputInventory(int size) {
		System.out.println("상품 출력");
		for( int i=0; i<size; i++) {
			// 재고목록에서 상품을 꺼내는 메서드 get()
			Product product = inventory.get(i);
			String name = product.getName(); 
			int price = product.getPrice();
			int quantity = product.getQuantity();
			int total = product.calculateTotal(); // 상품별 총 가격 계산
			System.out.println( "상품 이름 : " + name);
			System.out.println( "상품 가격 : " + price);
			System.out.println( "상품 수량 : " + quantity);
			System.out.println( "상품별 총 가격 : " + total);
		}		
	}
}
