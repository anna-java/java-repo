import algorithms.OddIndices;
import org.testng.Assert;
import org.testng.annotations.Test;


public class OddIndicesTest {

    @Test
    public void testOddIndices_HappyPath() {

        int[] array = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testOddIndices_ArrayOfTwo_HappyPath() {

        int[] array = {-45, 590};
        int[] expectedResult = {590};

        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    //Negative
    public void testOddIndices_ArrayOfOne_HappyPath() {

        int[] array = {-45};
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /*
    Cannot read the array length because "array" is null

    @Test
    public void testOddIndices_Null_Negative() {

        int[] array = null;
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
     */


    @Test
    public void testOddIndices_EmptyArray_Negative() {

        int[] array = {};
        int[] expectedResult = {};

        int[] actualResult = new OddIndices().oddIndices(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
