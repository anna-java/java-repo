import algorithms.OddIndices;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class OddIndicesTest {

    public void testOddIndices_HappyPath() {

        int[] expectedResult = {590, 985, 68};

        int actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);
    }




}
