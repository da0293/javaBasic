package factoryMethodPattern;

public class CatFactory implements AnimalFactory {

	@Override
	public Animal identify() {
		return new Cat();
	}

}
