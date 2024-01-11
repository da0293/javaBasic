package part2.practice3.데이터구조화;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Product[] products = new Product[5];
		int menu; 
		boolean keepLoop=true;
		
		while(keepLoop) {
			menu=inputMenu();
			switch(menu) 
			{
			case 1:
				addInventory(products);
				break; 
			case 2 :
				displayInventory(products);
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
	private static void addInventory(Product[] products) {
		Scanner sc = new Scanner(System.in);
		System.out.println("상품 입력");

		String name; 
		int price, quantity;
		
		for( int i=0; i<5; i++ ) {
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
			products[i] = product; 
		}
		
		
	}
	private static void displayInventory(Product[] products) {
		System.out.println("상품 출력");
		for( int i=0; i<5; i++) {
			Product product = products[i]; 
			String name=product.name;
			int price=product.price;
			int quantity=product.quantity;
			System.out.println( "상품 이름 : " + name);
			System.out.println( "상품 가격 : " + price);
			System.out.println( "상품 수량 : " + quantity);
		}		
	}
}
