package part3.ex5.추상화;

public class NewlecExamConsole extends ExamConsole {
	// NewlecExam객체 생성해서 반환 
	// 반환타입이 Exam이지만 부모라서 가능 
	@Override
	protected Exam makeExam() {
		return new NewlecExam();
	}

}
