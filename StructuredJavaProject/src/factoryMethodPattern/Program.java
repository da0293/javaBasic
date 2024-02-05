package factoryMethodPattern;

public class Program {
	public static void main(String[] args) {
		AnimalFactory factory = new CatFactory();
		Animal animal = factory.identify();
		animal.getToy();
		
		Animal bolt = new Cat();
		bolt.getToy();
	}
}
