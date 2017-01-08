import com.hpe.alm.octane.OctaneCucumber;
import junit.framework.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

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

    @Test
    public void alwaysFailGuy2()
    {
        Assert.assertEquals(1, 0);
    }

    @Ignore
    @Test
    public void ignoredGuy1()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFifee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFifee, true);
    }
   
    @Ignore
    @Test
    public void sometimesPassGuy2() throws InterruptedException
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFifee =  randomNumber < 50 ? true : false;
////        Thread.sleep(40000);
        Assert.assertEquals(smallerThanFifee, true);
    }

    @Test
    public void sometimesPassGuy3()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFifee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFifee, true);
    }
   
   @Test
    public void sometimesPassGuy5()
    {
        Random random = new Random();
        int randomNumber = random.nextInt(100);
        boolean smallerThanFifee =  randomNumber < 50 ? true : false;
        Assert.assertEquals(smallerThanFifee, true);
    }
    @RunWith(OctaneCucumber.class)
    public class RunCukesTest {
        @Test
        public void doNothing()
        {

        }
    }

}
