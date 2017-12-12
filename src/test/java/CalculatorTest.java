import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

public class CalculatorTest {

    private  Calculator calculator;
    @Before
    public void setUp() throws Exception
    {
       calculator = new Calculator(10,5);
    }


    @Test
    public void testCreateCalculatorObject()
    {
        Assert.assertNotNull(calculator);
    }

    @Test
    public void testCalculateSum()
    {
        Assert.assertEquals(15, calculator.calculateSum(), 0);
    }

    @Test
    public void testCalculateSubtract()
    {
        Assert.assertEquals(5, calculator.calculateSubtract(), 0);
    }

    @Test
    public void testCalculateMultiply()
    {
        Assert.assertEquals(50,calculator.calculateMultiply(), 0);
    }

    @Test
    public void testCalculateDivision()
    {
        Assert.assertEquals(2, calculator.calculateDivision(), 0);
    }


}
