package part2.ex3.데이터구조화;

import java.util.Scanner;

public class ListProgram {
	public static void main(String[] args) {
		ExamList list = new ExamList();
		list.exams = new Exam[3]; // 3으로 고정시킴 
		list.current=0; // 이렇게 하면 공유 가능해짐

		int menu; 
		boolean keepLoop = true;
		
		while(keepLoop)
		{
			menu=inputMenu();
			switch(menu)
			{
			case 1:
				inputList(list); 
				break;
			case 2:
				printList(list);
				break;
			case 3:
				System.out.println("Bye~~");
				keepLoop = false;
				break;
			default:
				System.out.println("잘못된 값을 입력하셨습니다. 메뉴는 1~3까지입니다.");
			}
		}
		
	}
	private static void printList(ExamList list ) {
		System.out.println("┌──────────────────┐");
		System.out.println("│     성적 출력            │");
		System.out.println("└──────────────────┘");
		System.out.println();
		
		int size = list.current;
		Exam[] exams = list.exams;
		
		for ( int i=0; i<size; i++) { // exams.length는 exam의 방의 개수를 말하기 때문에 안됨 그 방의 데이터가 몇개인지를 써야함 i<3인 이유다. 
			Exam exam = exams[i]; // 이건 선언이 아닌 연산
			// for문 안에 변수를 선언하면 비효율적이다 ? -> for문 안이든 for문 밖이든 준비는 한번이다. 고로 상관없다.
			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math;
			
			int total = kor + eng + math;
			float avg = total/3.0f; 
			System.out.println("국어 : " + kor );
			System.out.println("수학 : " + math );
			System.out.println("영어 : " + eng );
			
			System.out.printf("총점 : %3d\n", total);
			System.out.printf("평균 : %6.2f\n", avg);
			System.out.println("────────────────────────");

		}	
	}
	private static void inputList(ExamList list) {
		Scanner scan = new Scanner(System.in);
		System.out.println("┌──────────────────┐");
		System.out.println("│     성적 입력            │");
		System.out.println("└──────────────────┘");
		System.out.println();
		
		
		int kor, eng, math; // 입력받을 때 임시변수에 받음
		do 
		{
			System.out.printf("국어 : ");
			kor = scan.nextInt();
			
			if(kor < 0 || 100 < kor)
			{
				System.out.println("국어성적은 0~100까지의 범위만 입력이 가능합니다.");
			}
			
		}while(kor<0 || 100 < kor);
		do 
		{
			System.out.printf("영어 : ");
			eng = scan.nextInt();
			
			if(eng < 0 || 100 < eng)
			{
				System.out.println("영어성적은 0~100까지의 범위만 입력이 가능합니다.");
			}
			
		}while(eng<0 || 100 < eng);
		do 
		{
			System.out.printf("수학 : ");
			math = scan.nextInt();
			
			if(math < 0 || 100 < math)
			{
				System.out.println("수학성적은 0~100까지의 범위만 입력이 가능합니다.");
			}
			
		}while(math<0 || 100 < math);
		Exam exam = new Exam(); // 실제 국어, 수학, 영어 방 만들어줌
		// 임수변수에 받은 값을 대입  
		exam.kor=kor;
		exam.eng=eng;
		exam.math=math;
		
		Exam[] exams =  list.exams;
		int size = list.current; 
		
		if(exams.length == size) {
			// 1. 크기가 5개정도 더 큰 새로운 배열을 생성하시오
			Exam[] temp = new Exam[size + 5];
			
			// 2. 값을 이주시키기
			for ( int i = 0; i< size; i++ ) {
				temp [i] = exams[i]; 
			}
			// 3. list.exams가 새로만든 temp 배열을 참조하도록 한다. 
			list.exams = temp; 
		}
		list.exams[list.current] = exam; 
		list.current++;
	}
	static int inputMenu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("┌──────────────────┐");
		System.out.println("│     메인 메뉴            │");
		System.out.println("└──────────────────┘");
		System.out.println("\t1. 성적입력 ");
		System.out.println("\t2. 성적출력 ");
		System.out.println("\t3. 종료 ");
		System.out.println("\t선택> ");
		int menu = scan.nextInt();
		return menu;
	}
}
