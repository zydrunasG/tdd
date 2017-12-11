import org.junit.Test;
import org.junit.Assert;


public class SphereCalcutareTest {
    @Test
    public void testCreateObject() throws Exception{
        SphereCalculate sphereCalculate = new SphereCalculate();
        Assert.assertNotNull(sphereCalculate);
    }
}
