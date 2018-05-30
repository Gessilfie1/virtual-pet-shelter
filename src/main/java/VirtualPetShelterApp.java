
public class VirtualPetShelterApp {

	public static void main(String[] args) {
		
		VirtualPet pet1 = new VirtualPet("Joey", "Looks like he's seen better days");
		VirtualPet pet2 = new VirtualPet("Johnny", "is a bit nervous");
		VirtualPet pet3 = new VirtualPet("DeeDee", "probably didn't start with that many legs");
		VirtualPet pet4 = new VirtualPet("Tommy", "smells like a Stargazer lily fresh with morning dew.");
		
		VirtualPetShelter pets = new VirtualPetShelter();
		pets.add(pet1);
		pets.add(pet2);
		pets.add(pet3);
		pets.add(pet4);
		
		System.out.println(pet1.getPetName());
		System.out.println(pet1.getPetDescription());
		
//		for(VirtualPet thisPet: pets.getAllPets()) {
//			System.out.println(thisPet.getPetName());
//		}
		
		
		
		

	}

}
