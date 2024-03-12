import algorithms.OddEven;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

    @Test
    public void testNumOddOrEven_NegativeNum() {

        int num = -345;
        String expectedResult = "Odd";

        String actualResult = new OddEven().oddEven(num);

        Assert.assertEquals(actualResult, expectedResult);
    }


@Test
public void testNumOddOrEven_Zero() {

    int num = 0;
    String expectedResult = "Even";

    String actualResult = new OddEven().oddEven(num);

    Assert.assertEquals(actualResult, expectedResult);
}


@Test
    public void testNumOddOrEven_PositiveNum() {

        int num = 222222;
        String expectedResult = "Even";

        String actualResult = new OddEven().oddEven(num);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
