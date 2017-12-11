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
        Assert.assertEquals(254.34, sphereCalculate.calculateArea());

    }

    @Test
    public void testCalculateVolume()
    {
        SphereCalculate sphereCalculate = new SphereCalculate(4.5);
        Assert.assertNotNull(sphereCalculate);
        Assert.assertEquals(413.1, sphereCalculate.calculateVolume());
    }
}
