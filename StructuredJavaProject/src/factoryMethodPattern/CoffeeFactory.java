package factoryMethodPattern;

public class CoffeeFactory implements BeverageFactory{

	@Override
	public Beverage createBeverage() {
		return new Coffee();
	}
}
