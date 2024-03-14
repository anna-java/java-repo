import algorithms.SumArray;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumArrayTest {

    @Test
    public void testSumArray_PositiveValues_HappyPath() {

        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        int actualResult = new SumArray().sumArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testSumArray_NegativeValues_HappyPath() {

        int[] array = {-7, -3};
        int expectedResult = -10;

        int actualResult = new SumArray().sumArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testSumArray_EmptyArray_Negative() {

        int[] array = {}; // or int[] array = new int[0];
        int expectedResult = 0;

        int actualResult = new SumArray().sumArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /*
    Cannot read the array length because "array" is null

    @Test
    public void testSumArray_Null_Negative() {

        int[] array = null;
        int expectedResult = 0;

        int actualResult = new SumArray().sumArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
     */
}
