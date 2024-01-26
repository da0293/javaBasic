package part3.ex5.추상화;

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
	
	public void add(Exam exam) {
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
		exams[size] = exam; 
		current++;
		
	}
	
	public Exam get(int i) {
		return this.exams[i];
	}

	public int size() {
		return this.current;
	}

	
}
