package part3.ex6.인터페이스;

public class A {
	private X x; 
	
	public void setX(X x) {
		this.x = x;
	}
	public A() {
		// B 생성 코드
		//b=new B();;
	}
	public void print() {
		int total = x.total();
		System.out.printf("total is %d\n",total);
	}
}
