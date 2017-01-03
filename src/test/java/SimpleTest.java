import junit.framework.Assert;
import org.junit.Ignore;
import org.junit.Test;
import java.util.Random;


/**
 * Created by gadiel on 15/11/2016.
 */
public class SimpleTest {

   @Test
   public void alwaysPassGuy1()
   {
       Assert.assertEquals(1, 1);
   }

    @Test
    public void alwaysPassGuy2()
    {
        Assert.assertEquals(1, 1);
    }

    //@Test
    public void alwaysFailGuy1()
    {
        Assert.assertEquals(1, 0);
    }

    //@Test
    public void alwaysFailGuy2()
    {
        Assert.assertEquals(1, 0);
    }

    @Ignore
    @Test
    public void sometimesPassGuy1()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFifee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFifee, true);
    }
   
    @Test
    public void sometimesPassGuy2() throws InterruptedException
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFifee =  randomNumber < 50 ? true : false;
////        Thread.sleep(40000);
        Assert.assertEquals(smallerThanFifee, true);
    }

    //@Test
    public void sometimesPassGuy3()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFifee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFifee, true);
    }
   
   //@Test
    public void sometimesPassGuy4()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFifee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFifee, true);
    }
}
