import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {

	VirtualPetShelter underTest;
	VirtualPet pet1;
	VirtualPet pet2;

	@Before
	public void setup() {
		underTest = new VirtualPetShelter();
		pet1 = new VirtualPet("name1", "description1");
		pet2 = new VirtualPet("name2", "description2");
	}

	// To add Pet
	@Test
	public void shouldBeAbleToAddPet() {
		underTest.add(pet1);
		VirtualPet retrievedPet = underTest.findPet("name1");
		assertThat(retrievedPet, is(pet1));

	}

	@Test
	public void shouldBeAbleToAddTwoPets() {
		underTest.add(pet1);
		underTest.add(pet2);

		Collection<VirtualPet> allPets = underTest.getAllPets();

		// assertThat(allPets, containsInAnyOrder(pet1,pet2));
		assertEquals(2, allPets.size());

	}

	@Test
	public void shouldBeAbleToAdoptAPet() {
		underTest.add(pet1);
		underTest.adopt(pet1.getPetName());
		VirtualPet retrievedPet = underTest.findPet(pet1.getPetName());
		assertThat(retrievedPet, is(nullValue()));
	}

	@Test
	public void shouldFeedPet() {
		underTest.feed(pet1);
		// VirtualPet petHunger = underTest.findPet(pet1.getPetName()).getHunger();
		assertThat(pet1.getHunger(), is(102));

	}

	@Test
	public void shouldFeedAllPets() {
		underTest.add(pet1);
		underTest.add(pet2);

		// Check pet1 and pet2 hunger before feeding
		assertThat(pet1.getHunger(), is(100));
		assertThat(pet2.getHunger(), is(100));
		// Feed all pets
		Collection<VirtualPet> petCollection = underTest.getAllPets();
		underTest.feedAllPets();
		// Check pet1 and pet2 hunter after
		assertThat(pet1.getHunger(), is(80));
		assertThat(pet2.getHunger(), is(80));

	}

}
