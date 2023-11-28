package part2.ex2.탑다운예제;

public class Program {
	public static void main(String[] args) {
		// 로또라는 것에 대한 기본적인 메인 메뉴를 입력받음
		int [][]lottos = null; 
		int menu;
		boolean running = true;
		
		while(running)
		{
		menu = inputMenu();
		// 입력받은 메뉴에 따라 달라짐
		switch(menu) {
		case 1:
			lottos =  createLottosAuto();
			break;
		case 2:
			lottos = generateLottosManual();
			break;
		case 3:
			printLottos(lottos);
			break;
		case 4:
			running = false; 
			break;
		}
		}
	}

	private static void printLottos(int[][] lottos) {
		// TODO Auto-generated method stub
		
	}

	private static int[][] generateLottosManual() {
		// TODO Auto-generated method stub
		return null;
	}

	private static int[][] createLottosAuto() {
		// TODO Auto-generated method stub
		return null;
	}

	private static int inputMenu() {
		
		return 0;
	}
	
	
}
