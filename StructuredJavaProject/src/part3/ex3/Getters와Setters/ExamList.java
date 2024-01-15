package part3.ex3.Getters와Setters;

import java.util.Scanner;

public class ExamList {
	private Exam[] exams;
	private int current;
	public ExamList() {
		this(3); 
	}
	
	public ExamList(int size) {
		exams = new Exam[size]; 
		current=0;
	}
	
	public void printList() {
		printList(current);
	}
	public void printList(int size) {
		System.out.println("┌──────────────────┐");
		System.out.println("│     성적 출력            │");
		System.out.println("└──────────────────┘");
		System.out.println();
		Exam[] exams = this.exams;
		for ( int i=0; i<size; i++) {
			Exam exam = exams[i];
			int kor = exam.getKor(); // exam.kor;
			int eng = exam.getEng(); // exam.eng;
			int math = exam.getMath(); // exam.math;
			int total = exam.total();//kor + eng + math;
			float avg = exam.avg();//total/3.0f; 
			System.out.println("국어 : " + kor );
			System.out.println("수학 : " + math );
			System.out.println("영어 : " + eng );
			
			System.out.printf("총점 : %3d\n", total);
			System.out.printf("평균 : %6.2f\n", avg);
			System.out.println("────────────────────────");

		}	
	}
	
	public void inputList() {
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
		/*
		Exam exam = new Exam(); 
		exam.setKor(kor);//exam.kor=kor;
		exam.setEng(eng);//exam.eng=eng;
		exam.setMath(math);//exam.math=math;
		
		굳이 이런 방법보다 overload생성자를 쓰는 방법이 효율적이다. 
		*/
		
		Exam exam = new Exam(kor,eng, math); 
		
		Exam[] exams =  this.exams;
		int size = this.current;		
		if(exams.length == size) {
			System.out.println("실행");
			Exam[] temp = new Exam[size + 5];
			for ( int i = 0; i< size; i++ ) {
				temp [i] = exams[i]; 
			}
			// temp배열을 exams에 할당 그러나 지역변수이므로 함수 종료시 사라진다. 
			exams = temp; 
			// 여기서 현재 객체의 exams를 새로운 배열로 갱신
			this.exams = exams;
		}
		System.out.println( "exams의길이" + exams.length);
		exams[size] = exam; 
		current++;
	}
}
