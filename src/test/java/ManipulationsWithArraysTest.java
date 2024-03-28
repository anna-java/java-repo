import algorithms.ManipulationsWithArrays;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ManipulationsWithArraysTest {

    @Test
    public void multiplyArrayByNumber_HappyPath() {

        int[] array = {1, 2, 3, 4, 5};
        int multiplier = 3;
        int[] expectedResult = {3, 6, 9, 12, 15};

        int[] actualResult = new ManipulationsWithArrays().multiplyArrayByNumber(array, multiplier);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void multiplyArrayByNumber_Null() {

        int[] array = null;
        int multiplier = 3;
        int[] expectedResult = null;

        int[] actualResult = new ManipulationsWithArrays().multiplyArrayByNumber(array, multiplier);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void doubleArray_HappyPath() {

        int[] array = {1, 2, 3, 4, 5};
        double[] expectedResult = {1.0, 2.0, 3.0, 4.0, 5.0};

        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void doubleArray_Null() {

        int[] array = null;
        double[] expectedResult = null;

        double[] actualResult = new ManipulationsWithArrays().toDoubleArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void intArray_HappyPath() {

        double[] array = {1.1, 2.5, 3.7, 4.0, 5.5};
        int[] expectedResult = {1, 2, 3, 4, 5};

        int[] actualResult = new ManipulationsWithArrays().toIntArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void intArray_Null() {

        double[] array = null;
        int[] expectedResult = null;

        int[] actualResult = new ManipulationsWithArrays().toIntArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void stringArray_HappyPath() {

        int[] array = {1, 2, 3, 4, 5};
        String[] expectedResult = {"1", "2", "3", "4", "5"};

        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void stringArray_Null() {

        int[] array = null;
        String[] expectedResult = null;

        String[] actualResult = new ManipulationsWithArrays().toStringArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
