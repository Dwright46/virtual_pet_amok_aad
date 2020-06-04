import org.junit.Assert;
import org.junit.Test;

public class RoboticCatTest {
    RoboticDog underTest = new RoboticDog("name","description",10,20,5,10);

    @Test
    public void shouldReturnRoboticName(){
        String check = underTest.getPetName();
        Assert.assertEquals(check,"name");
    }
    @Test
    public void shouldReturnRoboticCatName(){
        String check = underTest.getPetName();
        Assert.assertEquals(check,"name");
    }

}