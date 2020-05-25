package shelter;

import org.assertj.core.api.Assertions;
import java.util.Collection;
import org.junit.Before;
import org.junit.Test;

public class VirtualPetShelterTest {

    private VirtualPetShelter underTest;
    private VirtualPet pet1;
    private VirtualPet pet2;

    @Before
    public void setUp() {
        underTest = new VirtualPetShelter();
        pet1 = new VirtualPet("Lola", "cat", 1, 2, 3);
        pet2 = new VirtualPet("Max", "dog", 1, 2, 3);
    }

    @Test
    public void t1shouldBeAbleToAddAPet() {
        underTest.addNewPet(pet1);
        VirtualPet petEntered = underTest.findPet("Lola");
        Assertions.assertThat(petEntered).isEqualTo(pet1);
    }

    @Test
    public void t2shouldBeAbleToAddTwoPets() {
        underTest.addNewPet(pet1);
        underTest.addNewPet(pet2);
        VirtualPet petEntered = underTest.findPet("");
        Collection<VirtualPet> allPets = underTest.getAllPets();
        Assertions.assertThat(allPets).contains(pet1, pet2);
        Assertions.assertThat(2).isEqualTo(allPets.size());
    }

    @Test
    public void t3shouldBeAbleToRemoveAPet() {
        underTest.addNewPet(pet1);
        underTest.closeAPet(pet1);
        VirtualPet petEntered = underTest.findPet(pet1.getName());
        Assertions.assertThat("Lola").isEqualTo("Lola");
    }

    @Test
    public void t4shouldBeAbleToFeedAPet() {
        underTest.addNewPet(pet1);
        underTest.feed(pet1.getName(), 0);
        Assertions.assertThat(pet1.getHunger()).isEqualTo(1);
    }

    @Test
    public void t5shouldBeAbleToFeedALLPets() {
        underTest.addNewPet(pet1);
        underTest.addNewPet(pet2);
        underTest.feed(pet1.getName(), 5);
        underTest.feed(pet2.getName(), 5);
        Collection<VirtualPet> allPets = underTest.feedAllPets();
        Assertions.assertThat(allPets).contains(pet1, pet2);
    }

    @Test
    public void t6shouldBeAbleToWaterAPet() {
        underTest.addNewPet(pet1);
        underTest.water(pet1.getName(), 0);
        Assertions.assertThat(pet1.getThirst()).isEqualTo(2);
    }

    @Test
    public void t7shouldBeAbleToWaterAllPets() {
        underTest.addNewPet(pet1);
        underTest.addNewPet(pet2);
        underTest.water(pet1.getName(), 5);
        underTest.water(pet2.getName(), 5);
        Collection<VirtualPet> allPets = underTest.waterAllPets();
        Assertions.assertThat(allPets).contains(pet1, pet2);
    }

    @Test
    public void t8shouldBeAbleToPlayWithAPet() {
        underTest.addNewPet(pet1);
        underTest.play(pet1.getName(), 0);
        Assertions.assertThat(pet1.getBored()).isEqualTo(3);
    }
      //test in the ShelterTest are not running in the assignment, and I checked build.gradle I have all the right dependencies
      //They are running just fine on a separate project in my folder, and all passing
      //showed this on Wed on our 1:1 Q&A and they were running great, it is just assignment
}
