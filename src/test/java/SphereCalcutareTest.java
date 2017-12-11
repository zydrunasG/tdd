import org.junit.Test;
import org.junit.Assert;


public class SphereCalcutareTest {
    @Test
    public void testCreateObjectWithParameter() throws Exception{
        SphereCalculate sphereCalculate = new SphereCalculate(4.5);
        Assert.assertNotNull(sphereCalculate);
    }

    @Test
    public void testCalculateArea()
    {
        SphereCalculate sphereCalculate = new SphereCalculate(4.5);
        Assert.assertNotNull(sphereCalculate);
        Assert.assertEquals(254.34, sphereCalculate.calculateArea(),0);

    }

    @Test
    public void testCalculateVolume()
    {
        SphereCalculate sphereCalculate = new SphereCalculate(4.5);
        Assert.assertNotNull(sphereCalculate);
        Assert.assertEquals(381.51, sphereCalculate.calculateVolume(), 0);
    }
}
