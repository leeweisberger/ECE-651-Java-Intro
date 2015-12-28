import pets.Cat;
import pets.Dog;
import pets.DogCollection;
import pets.Pet;
import pets.PetCollection;


public class Generics {
	public static void main(String[] args) {
		//A Pet Collection can only contain Pet objects or subclasses of Pet
		PetCollection<Pet> petHotel = new PetCollection<>();
		petHotel.addPet(new Dog("Max"));
		petHotel.addPet(new Cat("Bootz"));
		petHotel.addPet(new Dog("Fifi"));
		petHotel.makeNoise();
		
		System.out.println("----------------");
		
		PetCollection<Dog> dogHotel = new PetCollection<>();
		dogHotel.addPet(new Dog("Max"));
//		petHotel.addPet(new Cat("Bootz")); can't do this!!!
		dogHotel.addPet(new Dog("Fifi"));
		dogHotel.makeNoise();
		
		System.out.println("----------------");
		
		//A Dog Collection can only contain Dog objects or subclasses of Dog
		DogCollection<Dog> dogHotel2 = new DogCollection<>();
		dogHotel2.addPet(new Dog("Max"));
//		petHotel.addPet(new Cat("Bootz")); can't do this!!!
		dogHotel2.addPet(new Dog("Fifi"));
		dogHotel2.makeNoise();

		//
	}
}
