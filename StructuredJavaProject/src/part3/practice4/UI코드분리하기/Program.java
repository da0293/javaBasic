package part3.practice4.UI코드분리하기;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		InventoryConsole inventory = new InventoryConsole(); 

		int menu; 
		boolean keepLoop=true;
		
		while(keepLoop) {
			menu=inputMenu();
			switch(menu) 
			{
			case 1:
				inventory.inputInventory();
				break; 
			case 2 :
				inventory.outputInventory();
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
