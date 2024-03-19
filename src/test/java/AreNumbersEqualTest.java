import algorithms.AreNumbersEqual;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AreNumbersEqualTest {

    @Test
    public void equalNumbers() {

        int num1 = 89;
        int num2 = num1;
        int expectedresult = 0;

        int actualResult = new AreNumbersEqual().areNumbersEqual(num1, num2);

        Assert.assertEquals(actualResult, expectedresult);
    }


    @Test
    public void num1GreaterThanNum2() {

        int num1 = -89;
        int num2 = 89;
        int expectedResult = -1;

        int actualResult = new AreNumbersEqual().areNumbersEqual(num1, num2);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void num1LesserThanNum2() {

        int num1 = 89;
        int num2 = -89;
        int expectedResult = 1;

        int actualResult = new AreNumbersEqual().areNumbersEqual(num1, num2);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
