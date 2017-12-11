import org.junit.Test;
import org.junit.Assert;


public class SphereCalcutareTest {
    @Test
    public void testCreateObjectWithParameter() throws Exception{
        SphereCalculate sphereCalculate = new SphereCalculate(4.5);
        Assert.assertNotNull(sphereCalculate);
    }
}
