import pets.Cat;
import pets.Dog;
import pets.Pet;


public class Objects {
	public static void main(String[] args) {
		//We can declare as the superclass to use polymorphism: 
		Pet dog = new Dog("Max");
		Pet cat = new Cat("Boots");
		//Create a Pig, and add it to the array!!!
		Pet[] pets = new Pet[2];
		pets[0]=dog;
		pets[1]=cat;
		for(Pet pet : pets){
			//they are all pets, but make different noises depending on what type of pet!
			pet.makeNoise();
		}
		//but only dogs can woof, so we must declare it as a Dog!
		Dog dog2 = new Dog("Fifi");
		dog2.woof();
	}
}
