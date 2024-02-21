package hiJava.oop;

public class Dog extends Animal{

	@Override
	public void bark() {
		System.out.println("BowWow!");
	}
	public static void eat(String food) {
		System.out.println("Dog eat : " + food);
	}
	
	// 객체가 String화 될때 불러짐 
	@Override
	public String toString() {
		return "This is Dog";
	}
	
	/*
	 * Object.toString()
	 * public String toString(){
	 * 	return getClass().getName(). + '@' + Integer.toHexString(hashCode());(Hash코드를 16진수로 바꿈)
	 */
	public static void main(String[] args) {
		Dog d = new Dog();
		System.out.println(d); 
		//toString()전: hiJava.oop.Dog@7e774085
		//toString()후: This is Dog
		
		// d가 String타입이 되는 이유 : String과 연산이 일어나면 자동으로 String이 된다. 
		String s = "Test : " + d; 
		System.out.println(s); // Test : This is Dog
	}
}
