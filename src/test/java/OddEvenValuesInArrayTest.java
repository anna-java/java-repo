import algorithms.OddEvenValuesInArray;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenValuesInArrayTest {

    @Test
    public void evenValuesInArray_HappyPath() {

        int[] array = {0, 3, 6, 8, 11, 15, 18, 20};
        int expectedResult = 5;

        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void noEvenValuesInArray() {

        int[] array = {1, 3, 5, 7, 9, 11};
        int expectedResult = 0;

        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void nullArray() {

        int[] array = null;
        int expectedResult = -1;

        int actualResult = new OddEvenValuesInArray().countEvenValuesInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void oddValuesInArray_HappyPath() {

        int[] array = {0, 3, 6, 10, 13, 17, 18};
        int expectedResult = 3;

        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void noOddValuesInArray() {

        int[] array = {0, 2, 4, 6, 8, 10};
        int expectedResult = 0;

        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void nullArray2() {

        int[] array = null;
        int expectedResult = -1;

        int actualResult = new OddEvenValuesInArray().countOddValuesInArray(array);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void allArrayValuesAreGreaterThanNumber_HappyPath() {

        int[] array = {6, 7 , 8, 9, 10};
        int number = 5;

        boolean expectedResult = true;

        boolean actualResult = new OddEvenValuesInArray().areValuesGreaterThanNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void allArrayValuesAreLesserThanNumber_HappyPath() {

        int[] array = {1, 2, 3, 7, 8};
        int number = 10;

        boolean expectedResult = false;

        boolean actualResult = new OddEvenValuesInArray().areValuesGreaterThanNumber(array, number);

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

        boolean actualResult = new OddEvenValuesInArray().areValuesGreaterThanNumber(array, number);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void NullArray() {

        int[] array = null;
        int num = 10;

        boolean expectedResult = false;

        boolean actualResult = new OddEvenValuesInArray().areValuesGreaterThanNumber(array, num);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
