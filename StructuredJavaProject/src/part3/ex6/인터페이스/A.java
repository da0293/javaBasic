package part3.ex6.인터페이스;

public class A {
	private B b; 
	public A() {
		// B 생성 코드
		b=new B();
	}
	public void print() {
		int total = b.total();
		System.out.printf("total is %d\n",total);
	}
}
