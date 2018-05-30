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
	
	public void feedAllPets(VirtualPet pets) {
		pets.modifyHunger(+10); 
	}
	
	public void tick() {
//		if (pets.() + 1 > 6) {// if hunger reaches max
//			System.out.println(
//					"Alright...That's enough. I'm running my tail off here. Get me some food before I pass out.");
//
//			continue;
//		}
//
//		if (pet.getSleepy() + 1 > 6) { // if sleepy reaches max
//			System.out.println(" I'm tired. I need some chill time. Let's go watch a movie or somethin'");
//
//			continue;
		
		// If hunger reaches minimum
//		if (pet.getHunger() - 1 < 0) {
//			System.out.println("ugggg....no more. One more bite of cheese and I'm gonna throw up.");
//			continue;
//		}
//
//		if (pet.getSleepy() + 1 > 6) { // if sleepy reaches max
//			System.out.println(" I'm tired. I need some chill time. Let's go watch a movie or somethin'");
//
//			continue;
//		}
		
//		if (pet.getBoredom() + 1 > 6) {
//			System.out.println("I'm bored. Let's go out and Play!");
//
//			continue;
//		}
		}
	}

	

//	public void add(String string, String string2) {
//		// TODO Auto-generated method stub
//		
//	}
	
	


