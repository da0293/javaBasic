package part3.practice1.캡슐화;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Inventory inventory = new Inventory(); 

		int menu; 
		boolean keepLoop=true;
		
		while(keepLoop) {
			menu=inputMenu();
			switch(menu) 
			{
			case 1:
				inventory.addInventory();
				break; 
			case 2 :
				inventory.displayInventory();
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
}
