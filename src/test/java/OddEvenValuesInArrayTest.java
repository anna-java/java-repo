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
}
