package pets;

public class Dog extends Pet implements Woofable{

	public Dog(String name) {
		super(name);
	}

	@Override
	public void makeNoise() {
		System.out.println("Bark!");
	}

	@Override
	public void woof() {
		System.out.println("Woof!!!");	
	}
}
