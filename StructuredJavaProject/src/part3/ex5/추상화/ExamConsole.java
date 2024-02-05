package part3.ex5.추상화;

import java.util.Scanner;

public abstract class ExamConsole {
	// Composition Has A 일체형
	private ExamList list;

	public ExamConsole() {
		list = new ExamList();
	}
	
	public void input() {
		Scanner scan = new Scanner(System.in);
		System.out.println("┌──────────────────┐");
		System.out.println("│     성적 입력            │");
		System.out.println("└──────────────────┘");
		System.out.println();
		
		int kor, eng, math; 
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
		//onInput(); 
		//Exam exam = new Exam(kor,eng, math); 
		// 추상메서드를 통해 NewlecExam이던, YBMExam이던 그에 맞게 객체 생성 가능  
		// makeExam()을 이용해 exam을 다른 객체로 생성이 가능해진다.
		Exam exam = makeExam();
		// 과거엔 생성자를 통해 셋팅했으나 지금은 직접 셋팅할 수 밖에 없다.
		// 무조건 국어, 영어, 수학은 공통적으로 셋팅되므로 세개 다 setter이용해 값 셋팅
		// 기본 객체 셋팅
		exam.setKor(kor); 
		exam.setEng(eng);
		exam.setMath(math);
		// 추가과목 입력
		onInput(exam); 
		//목록에 추가하는 함수
		list.add(exam);
		
	}


	// 자식이 Override할 수 있고 외부에 노출되지 않도록 protected로 지정
	// 추상메서드는 오로지 추상클래스만 가질 수 있다. 
	protected abstract Exam makeExam();

	// 배열에 들어간 것 다 출력 
	public void print() {
		print(list.size());
	}
	
	// 지정한 사이즈 만큼만 출력
	public void print(int size) {
		System.out.println("┌──────────────────┐");
		System.out.println("│     성적 출력            │");
		System.out.println("└──────────────────┘");
		System.out.println();
		
		for ( int i=0; i<size; i++) {
			// 목록에서 성적을 꺼냄
			Exam exam = list.get(i);
			
			int kor = exam.getKor(); // exam.kor;
			int eng = exam.getEng(); // exam.eng;
			int math = exam.getMath(); // exam.math;
			int total = exam.total();//kor + eng + math;
			float avg = exam.avg();//total/3.0f; 
			System.out.println("국어 : " + kor );
			System.out.println("수학 : " + math );
			System.out.println("영어 : " + eng );
			onPrint(exam); 
			System.out.printf("총점 : %3d\n", total);
			System.out.printf("평균 : %6.2f\n", avg);
			System.out.println("────────────────────────");

		}	
	}
	 
	protected abstract void onInput(Exam exam);
	protected abstract void onPrint(Exam exam);
}
