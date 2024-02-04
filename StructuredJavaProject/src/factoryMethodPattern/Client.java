package factoryMethodPattern;

public class Client {
	public static void main(String[] args) {
		BeverageFactory factory = new TeaFactory(); 
		Beverage tea = factory.createBeverage();
//		coffee.prepare();
		tea.prepare();
	}
}
