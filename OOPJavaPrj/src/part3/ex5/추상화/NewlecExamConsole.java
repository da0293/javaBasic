package part3.ex5.추상화;

import java.util.Scanner;

// NewlecExam을 이용한 입출력
public class NewlecExamConsole extends ExamConsole {
	// NewlecExam객체 생성해서 반환 
	// 반환타입이 Exam이지만 부모라서 가능 
	@Override
	protected Exam makeExam() {
		return new NewlecExam();
	}

	@Override
	protected void onPrint(Exam exam) {
		NewlecExam newlecExam = (NewlecExam)exam; 
		int com = newlecExam.getCom();
		System.out.println("컴퓨터 : " + com );
	}

	@Override
	protected void onInput(Exam exam) {
		NewlecExam newlecExam = (NewlecExam)exam; 
		int com; 
		Scanner scan = new Scanner(System.in); 
		do 
		{
			System.out.printf("컴퓨터 : ");
			com = scan.nextInt();
			
			if(com < 0 || 100 < com)
			{
				System.out.println("컴퓨터성적은 0~100까지의 범위만 입력이 가능합니다.");
			}
		}while(com<0 || 100 < com);
		newlecExam.setCom(com);
	}

}
