import junit.framework.Assert;
import org.junit.Test;


/**
 * Created by Guy Guetta on 15/11/2016.
 */
public class SimpleTest {

   @Test
   public void alwaysPassGuy88888()
   {
       Assert.assertEquals(1, 1);
   }

    @Test
    public void alwaysPassGuy999999() throws InterruptedException
    {
        Thread.sleep(100000);
        Assert.assertEquals(1, 1);
    }

    @Test
    public void alwaysFailGuy1()
    {
        Assert.assertEquals(1, 0);
    }

//    @Test
//    public void alwaysFailGuy2()
//    {
//        Assert.assertEquals(1, 0);
//    }
//
//    @Test
//    public void alwaysFailGuy3()
//    {
//        Assert.assertEquals(1, 0);
//    }
//
//    @Test
//    public void alwaysFailGuy4()
//    {
//        Assert.assertEquals(1, 0);
//    }
//
//    @Test
//    public void alwaysFailGuy5()
//    {
//        Assert.assertEquals(1, 0);
//    }
//
//    @Test
//    public void alwaysFailGuy6()
//    {
//        Assert.assertEquals(1, 0);
//    }
//
//    @Test
//    public void alwaysFailGuy7()
//    {
//        Assert.assertEquals(1, 0);
//    }
//
//    @Test
//    public void alwaysFailGuy8()
//    {
//        Assert.assertEquals(1, 0);
//    }
//
//    @Ignore
//    @Test
//    public void ignoredGuy1()
//    {
//        Random random = new Random();
//        int randomNumber = random.nextInt(100);
//        boolean smallerThanFifee =  randomNumber < 50 ? true : false;
//        Assert.assertEquals(smallerThanFifee, true);
//    }
//
//    @Ignore
//    @Test
//    public void sometimesPassGuy2() throws InterruptedException
//    {
//        Random random = new Random();
//        int randomNumber = random.nextInt(100);
//        boolean smallerThanFifee =  randomNumber < 50 ? true : false;
//        Assert.assertEquals(smallerThanFifee, true);
//    }
//
//    @Test
//    public void sometimesPassGuy3()
//    {
//        Random random = new Random();
//        int randomNumber = random.nextInt(100);
//        boolean smallerThanFifee =  randomNumber < 50 ? true : false;
//        Assert.assertEquals(smallerThanFifee, true);
//    }
//
//    @Test
//    public void sometimesPassGuy5()
//    {
//        Random random = new Random();
//        int randomNumber = random.nextInt(100);
//        boolean smallerThanFifee =  randomNumber < 50 ? true : false;
//        Assert.assertEquals(smallerThanFifee, true);
//    }
//
//    @Test
//    public void sometimesPassGuy6()
//    {
//        Random random = new Random();
//        int randomNumber = random.nextInt(100);
//        boolean smallerThanFifee =  randomNumber < 50 ? true : false;
//        Assert.assertEquals(smallerThanFifee, true);
//    }
//
//    @Test
//    public void sometimesPassGuy7()
//    {
//        Random random = new Random();
//        int randomNumber = random.nextInt(100);
//        boolean smallerThanFifee =  randomNumber < 50 ? true : false;
//        Assert.assertEquals(smallerThanFifee, true);
//    }
//
//    @Test
//    public void sometimesPassGuy8()
//    {
//        Random random = new Random();
//        int randomNumber = random.nextInt(100);
//        boolean smallerThanFifee =  randomNumber < 50 ? true : false;
//        Assert.assertEquals(smallerThanFifee, true);
//    }
//
//    @Test
//    public void sometimesPassGuy9()
//    {
//        Random random = new Random();
//        int randomNumber = random.nextInt(100);
//        boolean smallerThanFifee =  randomNumber < 50 ? true : false;
//        Assert.assertEquals(smallerThanFifee, true);
//    }
//
//    @Test
//    public void sometimesPassGuy10()
//    {
//        Random random = new Random();
//        int randomNumber = random.nextInt(100);
//        boolean smallerThanFifee =  randomNumber < 50 ? true : false;
//        Assert.assertEquals(smallerThanFifee, true);
//    }
//
//    @Test
//    public void sometimesPassGuy11()
//    {
//        Random random = new Random();
//        int randomNumber = random.nextInt(100);
//        boolean smallerThanFifee =  randomNumber < 50 ? true : false;
//        Assert.assertEquals(smallerThanFifee, true);
//    }
//
//    @Test
//    public void sometimesPassGuy12()
//    {
//        Random random = new Random();
//        int randomNumber = random.nextInt(100);
//        boolean smallerThanFifee =  randomNumber < 50 ? true : false;
//        Assert.assertEquals(smallerThanFifee, true);
//    }
//
//    @Test
//    public void sometimesPassGuy13()
//    {
//        Random random = new Random();
//        int randomNumber = random.nextInt(100);
//        boolean smallerThanFifee =  randomNumber < 50 ? true : false;
//        Assert.assertEquals(smallerThanFifee, true);
//    }
//
//    @Test
//    public void sometimesPassGuy14()
//    {
//        Random random = new Random();
//        int randomNumber = random.nextInt(100);
//        boolean smallerThanFifee =  randomNumber < 50 ? true : false;
//        Assert.assertEquals(smallerThanFifee, true);
//    }

}
