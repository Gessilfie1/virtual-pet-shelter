import java.util.Scanner;

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
		
	
		
//		System.out.println(pet1.getPetName());
//		System.out.println(pet1.getPetDescription());
				
		Scanner input = new Scanner(System.in);
		
		System.out.println("Thank you for volunteering at Columbus Resort Animal Protection and Adoption Agency...call us CRAPAA for short!");
		System.out.println("\nThis is the status of your pets:\n");
		System.out.printf("%-10s %-10s %-10s %-10s\n", "Name", "Hunger", "Thirst", "Boredom");
		System.out.printf("%-10s %-10s %-10s %-10s\n", "Joey", "83", "34", "23");
		System.out.printf("%-10s %-10s %-10s %-10s\n", "Johnny", "69", "49", "2");
		System.out.printf("%-10s %-10s %-10s %-10s\n", "DeeDee", "39", "18", "88");
		System.out.printf("%-10s %-10s %-10s %-10s\n", "Tommy", "59", "19", "37");
		System.out.println("\nWhat would you like to do:\n");
		
		
		int select;

		do {
			System.out.println("Pick a number.");
			System.out.println("[0] Quit. ");
			System.out.println("[1] Feed the pets");
			System.out.println("[2] Water the pets");
			System.out.println("[3] Pick a pet to play with");
			System.out.println("[4] Adopt a pet");
			System.out.println("[5] Admit a pet");

			select = input.nextInt();

			if (select == 0) {
				continue;

			}

			else if (select == 1) { // Feed the pets
				
				for(VirtualPet petsAction: pets.getAllPets()) {
					petsAction.modifyHunger(-20);
					petsAction.modifyThirst(+10);
					petsAction.modifyBoredom(+10);
				}
				
				System.out.println("Yummy! Thanks for the food!");
			
			}

			else if (select == 2) {// Water the pets

				for(VirtualPet petsAction: pets.getAllPets()) {
					petsAction.modifyHunger(-10);
					petsAction.modifyThirst(-20);
				}
				System.out.println("Thank you for the water...I was sooo thirsty");
				
			}

			else if (select == 3) {// pick a pet to play with
				
				System.out.println("Ok so you'd like to play with a pet. Which pet do you want to play with? Please Choose One: ");
				System.out.println(pet1.getPetName() + pet1.getPetDescription());
				System.out.println(pet2.getPetName() + pet2.getPetDescription());
				System.out.println(pet3.getPetName() + pet3.getPetDescription());
				System.out.println(pet4.getPetName() + pet4.getPetDescription());
				
				String userSelectPet = input.nextLine();
				
//				if (userSelectPet == pets.findPet(pet1);
//				
//
//				pets.findPet(petName)
//
//				System.out.println("Let's watch a movie!");
//				// boredom += 1 boredom goes up.
//				//pet.modifyBoredom(1);
//
//				String[] movies = new String[] { "Tom and Jerry. ", "Ratatouille ", "3 Blind Mice " };
//				// randomize the movie it picks when selected
//				System.out.println(movies[rand.nextInt(movies.length)]);

			}

			else {
				System.out.println("Invalid selection. Please select one of the numbers listed");
			}
//tick method
//			 pet.tick();

		} while (select != 0);

	}
		
//		System.out.println("Name\tHunger\tThirst\tBoredom\n");
//		for(VirtualPet myPets: pets.getAllPets()) {
//			System.out.println(myPets.getPetName());
//		}
//		
//		for(VirtualPet petsHunger: pets.getAllPets()) {
//			System.out.println(petsHunger.getHunger());
//		}
		
		

	}


