import java.util.Scanner;
import java.util.Random;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		
		
		
		VirtualPet pet1 = new VirtualPet("Joey", " Looks like he's seen better days");
		VirtualPet pet2 = new VirtualPet("Johnny", " is a bit nervous");
		VirtualPet pet3 = new VirtualPet("DeeDee", " probably didn't start with that many legs");
		VirtualPet pet4 = new VirtualPet("Tommy", " smells like a Stargazer lily fresh with morning dew.");
		
		VirtualPetShelter pets = new VirtualPetShelter();
		pets.add(pet1);
		pets.add(pet2);
		pets.add(pet3);
		pets.add(pet4);
				
		Scanner input = new Scanner(System.in);

				
		int select;

		do {
			System.out.println("Thank you for volunteering at Columbus Resort Animal Protection and Adoption Agency...call us CRAPAA for short!");
			System.out.println("\nThis is the status of your pets:\n");
			System.out.printf("%-10s %-10s %-10s %-10s\n", "Name", "Hunger", "Thirst", "Boredom");
			System.out.printf("%-10s %-10s %-10s %-10s\n", pet1.getPetName(), pet1.getHunger(), pet1.getThirst(), pet1.getBoredom());
			System.out.printf("%-10s %-10s %-10s %-10s\n", pet2.getPetName(), pet2.getHunger(), pet2.getThirst(), pet2.getBoredom());
			System.out.printf("%-10s %-10s %-10s %-10s\n", pet3.getPetName(), pet3.getHunger(), pet3.getThirst(), pet3.getBoredom());
			System.out.printf("%-10s %-10s %-10s %-10s\n", pet4.getPetName(), pet4.getHunger(), pet4.getThirst(), pet4.getBoredom());
			System.out.println("\nWhat would you like to do:\n");
			
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
				
				pets.feedAllPets();
								
				for(VirtualPet petsActionAfterFeed: pets.getAllPets()) {
					petsActionAfterFeed.modifyThirst(+10);
					petsActionAfterFeed.modifyBoredom(+10);
				}

				
				System.out.println("Yummy! Thanks for the food!");
				
							
			}

			else if (select == 2) {// Water the pets
				
				pets.waterAllPets();

				for(VirtualPet petsActionAfterWater: pets.getAllPets()) {
					petsActionAfterWater.modifyHunger(-10);
				}
					
				System.out.println("Thank you for the water...we were sooo thirsty");
				
			}

			else if (select == 3) {// pick a pet to play with
				
				System.out.println("Ok so you'd like to play with a pet.");
				
				String userSelectPet;					
				
				for(VirtualPet myPet: pets.getAllPets()) { 
						System.out.println(myPet.getPetName() + myPet.getPetDescription());
						
				}
				
				System.out.println("\nEnter name of pet you want to play with");
				input.nextLine();
				userSelectPet = input.nextLine();
				
				System.out.println("You want to play with " + userSelectPet);
				VirtualPet thisPet = pets.findPet(userSelectPet);
				//prints random game to play with Pet
				pets.randomGame();
				
				thisPet.modifyHunger(+10);
				thisPet.modifyThirst(+10);
				thisPet.modifyBoredom(-20);

					continue;
						
			}		
			
			else if (select == 4) {//adopt a pet
				System.out.println("Great! You want to adopt a pet!\n");
				for(VirtualPet myPetAdopt: pets.getAllPets()) {
					System.out.println(myPetAdopt.getPetName() + myPetAdopt.getPetDescription());
				}
				
				System.out.println("\nPlease enter the name of the pet you want to adopt?");
				input.nextLine();
				String userPetAdopt = input.nextLine();
				
				pets.adopt(userPetAdopt);

				System.out.println("Congratulations you have adopted " + userPetAdopt );
				}
												
			else if (select == 5) {//admit a pet
				System.out.println("You want to admit a pet");
				System.out.println("What is the name of your pet?");
				input.nextLine();
				String petAdmitName = input.nextLine();
				System.out.println("Enter a short description about your pet");
				String petAdmitDescription = input.nextLine();
				VirtualPet pet5 = new VirtualPet(petAdmitName, petAdmitDescription);
				pets.add(pet5);
				System.out.println("We are glad to bring " + petAdmitName + " on board!");
			}


			else {
				System.out.println("Invalid selection. Please select one of the numbers listed");
			}
			
			pets.tick(pet1);
			pets.tick(pet2);
			pets.tick(pet3);
			pets.tick(pet4);
	
		} while (select != 0);

	}
	
}
	
		

		
		



