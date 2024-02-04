package factoryMethodPattern;

public class Tea extends Beverage{

	@Override
	void prepare() {
		System.out.println("차잎 준비");
		System.out.println("레몬 추가");
	}

}
