import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class OrganicDogTest {
    OrganicDog underTest = new OrganicDog("name", "description", 10, 10, 20,5,5);

    @Test
    public void shouldReturnName(){
        String check = underTest.getPetName();
        assertThat(check).isEqualToIgnoringCase("rusty");
    }

    @Test
    public void shouldReturnDescription(){
        String check = underTest.getDescription();
        assertThat(check).isEqualToIgnoringCase("german shepard");

    }

    @Test
    public void shouldReturnTrueIfPetIsReal(){
        boolean check = underTest.getReal();
        assertThat(check).isEqualTo(true);

    }

    @Test
    public void shouldDecreaseHungerBy5(){
        int hungerBeforeEating = underTest.getHunger();
        underTest.feedPet();
        int hungerAfterEating = underTest.getHunger();
        assertThat(hungerBeforeEating - hungerAfterEating).isEqualTo(5);
    }

    @Test
    public void shouldDecreaseThirstBy5(){
        int thirstBeforeDrinking = underTest.getThirst();
        underTest.waterPet();
        int thirstAfterDrinking = underTest.getThirst();
        assertThat(thirstBeforeDrinking - thirstAfterDrinking).isEqualTo(5);
    }

    @Test
    public void shouldDecreaseBoredomBy10(){
        int boredomBeforeWalking = underTest.getBoredom();
        underTest.walkDogs();
        int boredomAfterWalking = underTest.getBoredom();
        assertThat(boredomBeforeWalking - boredomAfterWalking).isEqualTo(10);

    }

}
