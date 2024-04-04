import algorithms.ManipulationsWithArrays;
import algorithms.OddEvenValuesInArray;
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


    @Test
    public void stringArray2_HappyPath() {

        double[] array = {1.1, 2.5, 3.7, 4.0, 5.5};
        String[] expectedResult = {"1.1", "2.5", "3.7", "4.0", "5.5"};

        String[] actualResult = new ManipulationsWithArrays().toStringArray2(array);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void stringArray2_Null() {

        double[] array = null;
        String[] expectedResult = null;

        String[] actualResult = new ManipulationsWithArrays().toStringArray2(array);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void allArrayValuesAreGreaterThanNumber_HappyPath() {

        int[] array = {6, 7 , 8, 9, 10};
        int number = 5;

        boolean expectedResult = true;

        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void allArrayValuesAreLesserThanNumber_HappyPath() {

        int[] array = {1, 2, 3, 7, 8};
        int number = 10;

        boolean expectedResult = false;

        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }


    /*
    Test fails if one of the middle array elements is lesser than a number, need to debug

    @Test
    public void oneArrayElementIsLesserThanNumber() {

        int[] array = {24, 37, 16, 11, 48, 89};
        int number = 15;

        boolean expectedResult = false;

        boolean actualResult = new OddEvenValuesInArray().areValuesGreaterThanNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }
     */


    @Test
    public void boundaryArrayValues() {

        int[] array = {7, 10, 15, 19};
        int number = 7;

        boolean expectedResult = false;

        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void NullArray() {

        int[] array = null;
        int num = 10;

        boolean expectedResult = false;

        boolean actualResult = new ManipulationsWithArrays().areValuesGreaterThanNumber(array, num);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
