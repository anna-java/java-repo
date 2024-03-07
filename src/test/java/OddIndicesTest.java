import algorithms.OddIndices;
import org.testng.Assert;
import org.testng.annotations.Test;


@Test
public class OddIndicesTest {

    public void testOddIndices_HappyPath() {

        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);

    }


    public void testOddIndices_ArrayOfTwo() {

        int[] array = {-45, 590};
        int[] expectedResult = {590};

        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);

    }


    //Negative
    public void testOddIndices_ArrayOfOne() {

        int[] array = {-45};
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);

    }


    public void testOddIndices_Null() {

        int[] array = null;
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);

    }


    public void testOddIndices_Empty() {

        int[] array = {};
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);

    }
}
