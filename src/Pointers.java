import pets.Dog;


public class Pointers {
	public static void main(String[] args) {
		passByValue();
		passReferencesByValue();
		System.out.println("--------------");
		System.out.println("Basically, Java passes a copy of a reference (pointer) as a value. "
				+ "\nIf you change what the reference is pointing to in another method, "
				+ "\nthe change persists. If you reassign the reference, it does not.");
		System.out.println("--------------");
		useEquals();
		System.out.println(".equals() compares the value of the objects. == compares whether the objects"
				+ "\nreference the exact same object. Use == for primitives and .equals() for objects!");
	}
	
	private static void passByValue() {
		Dog dog = new Dog("Max");
		foo(dog);
	
		if (dog.getName().equals("Max")) { //true
			System.out.println( "Java passes by value." );
	
		} else if (dog.getName().equals("Fifi")) {
			System.out.println( "Java passes by reference." );
		}
	}

	private static void foo(Dog d) {
		d.getName().equals("Max"); // true
	
		d = new Dog("Fifi");
		d.getName().equals("Fifi"); // true
	}

	private static void passReferencesByValue() {
		Dog dog = new Dog("Max");
		bar(dog);
		if (dog.getName().equals("Max")) { //true
			System.out.println( "Java passes copy of value as the value!" );

		} else if (dog.getName().equals("Fifi")) {
			System.out.println( "Java passes copy of reference as the value!" );
		}
		
	}

	private static void bar(Dog dog) {
		dog.rename("Fifi");
	}

	private static void useEquals() {
		String str1 = new String("Max");
		String str2 = new String("Max");
		if(str1==str2){
			System.out.println("Use == when comparing objects.");
		}
		if(str1.equals(str2)){
			System.out.println("Always Use .equals() when comparing objects!");
		}
		
	}

	
}
