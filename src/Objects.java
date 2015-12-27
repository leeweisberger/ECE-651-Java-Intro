import pets.Cat;
import pets.Dog;
import pets.Pet;


public class Objects {
	public static void main(String[] args) {
		Pet dog = new Dog("Max");
		Pet cat = new Cat("Boots");
		//Create a Pig, and add it to the array!!!
		Dog dog2 = new Dog("Fifi");
		Pet[] pets = new Pet[2];
		pets[0]=dog;
		pets[1]=cat;
		for(Pet pet : pets){
			pet.makeNoise();
		}
		
		dog2.woof();
	}
}
