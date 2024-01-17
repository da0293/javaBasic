package part3.practice1.캡슐화;

import java.util.Scanner;

public class Inventory {
	private Product[] products;
	private int current; 
	
	public Inventory() {
		this(5);
	}	
	
	public Inventory(int size) {
		this.products = new Product[size]; 
		this.current=0; 
	}
	
	public void addInventory() {
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
		Product[] products = this.products; 
		int size = this.current; 
		if(products.length==size) {
			// 1.크기가 3개정도 더 큰 새로운 배열을 생성
			Product[] temp = new Product[size+3]; 
			// 2.값을 이주 
			for( int i=0; i<size; i++) {
				temp[i]=products[i]; 
			}
			// 3.inventory.products가 새로 만든 temp배열을 참조
			products = temp;
			 /*
			 이 부분 추가 
			 temp 배열을 products에 할당했지만, 이는 지역 변수에 할당된 것이기 때문에 메소드가 종료되면서 사라지게 됩니다 
			 따라서 this.products에 다시 할당
			 */
			this.products=products;
		}
		products[size]=product;
		current++;
	}
	public void displayInventory() {
		// 집중화 코드 
		this.displayInventory(this.current);
	}
	
	// overload
	// 넘겨받은 size값만큼 출력
	public void displayInventory(int size) {
		System.out.println("상품 출력");
		for( int i=0; i<size; i++) {
			Product product = this.products[i]; 
			String name = product.getName(); 
			int price = product.getPrice();
			int quantity = product.getQuantity();
			System.out.println( "상품 이름 : " + name);
			System.out.println( "상품 가격 : " + price);
			System.out.println( "상품 수량 : " + quantity);
		}		
	}
}
