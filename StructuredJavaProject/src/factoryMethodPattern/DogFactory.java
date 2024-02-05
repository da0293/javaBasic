package factoryMethodPattern;

public class DogFactory implements AnimalFactory {

	@Override
	public Animal identify() {
		return new Dog();
	}

}
