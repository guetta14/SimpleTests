import com.hpe.alm.octane.OctaneCucumber;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by Guy Guetta on 08/01/2017.
 */
@RunWith(OctaneCucumber.class)
public class GherkinTest {
    @Test
    public void doNothing()
    {
        Assert.assertTrue(true);
    }
}
