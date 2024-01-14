package part2.practice3.데이터구조화;

import java.util.Scanner;

public class InventoryProgram {
	public static void main(String[] args) {
		Inventory inventory = new Inventory(); 
		inventory.products = new Product[5]; 
		inventory.current=0; 
		int menu; 
		boolean keepLoop=true;
		
		while(keepLoop) {
			menu=inputMenu();
			switch(menu) 
			{
			case 1:
				addInventory(inventory);
				break; 
			case 2 :
				// 기본 함수
				displayInventory(inventory);
				// overload 함수
				displayInventory(inventory,2);
				break;
			case 3 : 
				System.out.println("종료");
				keepLoop=false;
				break;
			default :
				System.out.println("메뉴는 1~3번까지 입니다.");
			}
			
		}
	}

	private static int inputMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1.상품 입력 ");
		System.out.println("2.재고 출력 ");
		System.out.println("3.종료");
		int menu=sc.nextInt();
		return menu;
	}
	private static void addInventory(Inventory inventory) {
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
		Product product = new Product();
		product.name=name;
		product.price=price;
		product.quantity=quantity;
		
		Product[] products = inventory.products; 
		int size = inventory.current; 
		
		if(products.length==size) {
			// 1.크기가 3개정도 더 큰 새로운 배열을 생성
			Product[] temp = new Product[size+3]; 
			// 2.값을 이주 
			for( int i=0; i<size; i++) {
				temp[i]=products[i]; 
			}
			// 3.inventory.products가 새로 만든 temp배열을 참조
			inventory.products = temp; 
		}
		products[size]=product;
		inventory.current++;
	}
	private static void displayInventory(Inventory inventory) {
		// 집중화 코드 
		displayInventory(inventory, inventory.current);
	}
	
	// overload
	// 넘겨받은 size값만큼 출력
	private static void displayInventory(Inventory inventory, int size) {
		System.out.println("상품 출력");
		for( int i=0; i<size; i++) {
			Product product = inventory.products[i]; 
			String name=product.name;
			int price=product.price;
			int quantity=product.quantity;
			System.out.println( "상품 이름 : " + name);
			System.out.println( "상품 가격 : " + price);
			System.out.println( "상품 수량 : " + quantity);
		}		
	}
}
