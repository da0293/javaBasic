package factoryMethodPattern;

public class Coffee extends Beverage {

	@Override
	void prepare() {
		System.out.println("커피원두 갈기");
		System.out.println("설탕 준비");
	}
}
