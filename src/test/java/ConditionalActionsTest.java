import algorithms.ConditionalActions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ConditionalActionsTest {

    @Test
    public void multipleOf7And9() {

        int M = 63;
        String expectedResult = "Good Number";

        String actualResult = new ConditionalActions().conditionalActions(M);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void multipleOf9Only() {

        int M = 54;
        String expectedResult = "Bad Number";

        String actualResult = new ConditionalActions().conditionalActions(M);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void multipleOf11() {

        int M = 77;
        String expectedResult = "Poor Number";

        String actualResult = new ConditionalActions().conditionalActions(M);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void anyOtherNumberNotEqualToZero() {

        int M = 101;
        String expectedResult = "-1";

        String actualResult = new ConditionalActions().conditionalActions(M);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void equalToZero() {

        int M = 0;
        String expectedResult = "0";

        String actualResult = new ConditionalActions().conditionalActions(M);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
