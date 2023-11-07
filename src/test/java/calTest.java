import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class calTest{
    private Main uncalculator;
    @Before
    public void setUp() {
        uncalculator = new Main();
    }
    @Test
    public void test_add() {
        double a = 2;
        double aa = 2;
        double expectedResult = 4;
        double result = uncalculator.add(a,aa);
        Assert.assertEquals(expectedResult, result,0.001);
    }

    @Test
    public void test_subt() {
        double a = 2;
        double aa = 2;
        double expectedResult = 0;
        double result = uncalculator.subt(a,aa);
        Assert.assertEquals(expectedResult, result,0.001);
    }

    @Test
    public void test_mul() {
        double a = 2;
        double aa = 2;
        double expectedResult = 4;
        double result = uncalculator.mul(a,aa);
        Assert.assertEquals(expectedResult, result,0.001);
    }

    @Test
    public void test_per() {
        double a = 2;
        double b = 5;
        double expectedResult = 2;
        double result = uncalculator.per(a,b);
        Assert.assertEquals(expectedResult, result,0.001);
    }
}