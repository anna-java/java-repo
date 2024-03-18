import algorithms.GreaterValue;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GreaterValueTest {

    @Test
    public void aGreaterThanB_HappyPath() {

        int a = 18;
        int b = 10;
        int expectedResult = 18;

        int actualResult = new GreaterValue().greaterValue(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void aLesserThanB_HappyPath() {

        int a = 23;
        int b = 57;
        int expectedResult = 57;

        int actualResult = new GreaterValue().greaterValue(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void aEqualToB_Negative() {

        int a = 35;
        int b = 35;
        int expectedResult = 0;

        int actualResult = new GreaterValue().greaterValue(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /*
    Variable might not have been initialized

    @Test
    public void oneNumNotDefined() {

        int a;
        int b = 63;
        int expectedResult = 0;

        int actualResult = new GreaterValue().biggerValue(a, b);

        Assert.assertEquals(actualResult, expectedResult);
    }
     */
}
