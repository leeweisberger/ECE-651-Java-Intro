package pets;

import java.util.ArrayList;
import java.util.List;

public class PetCollection<T extends Pet> {
	private List<T> petList = new ArrayList<T>();
	
	public void addPet(T pet){
		petList.add(pet);
	}
	
	public void removePet(T pet){
		petList.remove(pet);
	}
	
	public void makeNoise(){
		for(T pet : petList){
			pet.makeNoise();
		}
	}

}
