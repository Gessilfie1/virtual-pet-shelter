import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class VirtualPetShelter {
	
	Map<String, VirtualPet> pets = new HashMap<>();
	
	
	//add pet to shelter + take-in of pet into shelter
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
	public void adopt(String pet) {
		
		pets.remove(pet);
		
	}
	//feed One Pet
	public void feed(VirtualPet pet1) {
		pet1.modifyHunger(2);
		
	}

	//Generate random message while playing with Pet
	public void randomGame() {
		String[] arr = { "Let's play fetch! ", "Chase those bubbles! ", "Tug of War! Let's see how strong you are! " };
		Random random = new Random();
		int selectR = random.nextInt(arr.length);
		System.out.println("" + arr[selectR]);
	}
	

	public void tick(VirtualPet tickpet) {
		if (tickpet.getHunger() == 0) {// if hunger reaches 0
			System.out.println("WARNING: TOO MUCH FOOD. PLAY WITH A PET AND RUN IT OFF!");

			
		}
		
		if (tickpet.getHunger() < 0) {// if hunger is less than 0
			System.out.println("PETS DECEASED:......");

			
		}

		if (tickpet.getThirst() == 0) { // if thirst reaches 0
			System.out.println("WARNING: TOO MUCH WATER. FEED THE PETS OR PICK ONE TO PLAY WITH TO RUN IT OFF!");

			
		}
		
		if (tickpet.getThirst() < 0) { // if thirst is less than 0
			System.out.println("PETS DECEASED:......");

			
		}	
				
		if (tickpet.getBoredom() == 0) { // if boredom reaches 0
			System.out.println("WARNING:...that's enough playing for today. I need some food and water please");
			
		}
		
		if (tickpet.getBoredom() < 0) { // if boredom is less than 0
			System.out.println("PETS DECEASED:......");
			
		}
		
		if (tickpet.getHunger() == 200) { // if hunger reaches max
			System.out.println("WARNING: I NEED FOOD BEFORE I PASS OUT!");

			
		}
		
		if (tickpet.getHunger() > 200) { // if hunger goes over max
			System.out.println("PETS DECEASED:......");

			
		}
		
		if (tickpet.getThirst() == 200) { // if thirst reaches max
			System.out.println("WARNING: NEED WATER RIGHT NOW!");

			
		}
		
		if (tickpet.getThirst() > 200) { // if thirst is more than max
			System.out.println("PETS DECEASED:......");
		
		}
	}

	public void feedAllPets() {
		
		for (VirtualPet feedPet: pets.values()) {
			feedPet.modifyHunger(-20);
		}
	}
		
	public void waterAllPets() {
			
		for (VirtualPet waterPet: pets.values()) {
			waterPet.modifyThirst(-10);
		}
	}

		
				
	}



	

		
		
		
		
				
				
		



	
	


