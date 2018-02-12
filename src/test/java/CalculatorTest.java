import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

public class CalculatorTest {

//    @Before
//        Calculator testBasicMath = new Calculator();



    @Test
    public void addTest() {

        Calculator testBasicMath = new Calculator();

        double expected = 10.0;
        double actual = testBasicMath.add(7, 3);

        Assert.assertEquals(expected, actual,.05);
    }

    @Test
    public void subtractTest () {

        Calculator testBasicMath = new Calculator();

        double expected = 20.0;
        double actual = testBasicMath.subtract(32, 12.02);

        Assert.assertEquals(expected, actual, .05);
    }

    @Test
    public void multiplyTest () {

        Calculator testBasicMath = new Calculator();

        double expected = 100.0;
        double actual = testBasicMath.multiply(10, 10);

        Assert.assertEquals(expected, actual, .05);
    }

    @Test
    public void divideTest () {

        Calculator testBasicMath = new Calculator();

        double expected = 4;
        double actual = testBasicMath.divide(28, 7);

        Assert.assertEquals(expected, actual, .05);

    }
}
