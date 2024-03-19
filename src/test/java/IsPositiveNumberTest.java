import algorithms.IsPositiveNumber;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveNumberTest {

    @Test
    public void positiveNum_HappyPath() {

        int num = 555;
        boolean expectedResult = true;

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(num);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void negativeNum_HappyPath() {

        int num = -555;
        boolean expectedResult = false;

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(num);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void zero_HappyPath() {

        int num = 0;
        boolean expectedResult = false;

        boolean actualResult = new IsPositiveNumber().isPositiveNumber(num);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
