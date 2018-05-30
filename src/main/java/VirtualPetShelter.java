import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	
	Map<String, VirtualPet> pets = new HashMap<>();
	
	
	//add pet to shelter + adoption of pet into shelter
	public void add(VirtualPet pet) {
		pets.put(pet.getPetName(), pet);
		
	}

	// access individual pet to play with
	public VirtualPet findPet(String petName) {
		return pets.get(petName);
	}
	
	//collection to return all the pets in the shelter
	public Collection<VirtualPet> getAllPets() {
		return pets.values();
	}
	
	//Removes pet from shelter once adopted
	public void adopt(VirtualPet pet) {
		
		pets.remove(pet.getPetName(), pet);
		
	}

	public void feed(VirtualPet pet1) {
		pet1.modifyHunger(+2);
		
	}

	

//	public void add(String string, String string2) {
//		// TODO Auto-generated method stub
//		
//	}
	
	

}
