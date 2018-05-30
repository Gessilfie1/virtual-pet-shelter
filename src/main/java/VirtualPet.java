
public class VirtualPet {

	private String petName;
	private String petDescription;
	private int hunger;
	private int thirst;
	private int boredom;

	public VirtualPet(String petName, String petDescription) {
		this.petName = petName;
		this.petDescription = petDescription;
		this.hunger = 100;
		this.thirst = 100;
		this.boredom = 100;
	}

	public String getPetName() {
		return petName;
	}
	
	public String getPetDescription() {
		return petDescription;
	}

	public int getHunger() {
		return hunger;
	}

	public int getBoredom() {
		return boredom;
	}

	public int getThirst() {
		return thirst;
	}

	// utility methods to modify levels

	public void modifyHunger(int hgr) {
		hunger += hgr;
	}

	public void modifyBoredom(int b) {
		boredom += b;
	}

	public void modifyThirst(int t) {
		thirst += t;
	}

//	// tick method to randomize game loop
//	public void tick() {
//		hunger += 2;
//		boredom += 2;
//		thirst += 1;
//	}
}
