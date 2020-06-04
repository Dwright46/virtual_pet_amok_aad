import org.junit.Assert;
import org.junit.Test;

public class RoboticDogTest {
    RoboticDog underTest = new RoboticDog("name","description",10,20,5,10);

    @Test
    public void shouldReturnRoboticDogName(){
        String check = underTest.getPetName();
        Assert.assertEquals(check,"name");
    }
    @Test
    public void shouldReturnRoboticCatName(){
        String check = underTest.getPetName();
        Assert.assertEquals(check,"name");
    }

}
