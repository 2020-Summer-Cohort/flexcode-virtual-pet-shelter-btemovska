package shelter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class VirtualPetTest {

    VirtualPet underTest = new VirtualPet("Teddy", "bear",40,35,80 );

    @Test
    public void t1shouldReturnAName() {
    String getPetName = underTest.getName();
        Assertions.assertThat(getPetName).isEqualTo("Teddy");
    }

    @Test
    public void t2shouldReturnAType() {
        String getPetType = underTest.getType();
        Assertions.assertThat(getPetType).isEqualTo("bear");
    }

    @Test
    public void t3shouldReturnHunger() {
        int getPetHunger = underTest.getHunger();
        Assertions.assertThat(getPetHunger).isEqualTo(40);
    }

    @Test
    public void t4shouldReturnThirst() {
        int getPetThirst = underTest.getThirst();
        Assertions.assertThat(getPetThirst).isEqualTo(35);
    }

    @Test
    public void t5shouldReturnBored() {
        int getPetBored = underTest.getBored();
        Assertions.assertThat(getPetBored).isEqualTo(80);
    }
}
