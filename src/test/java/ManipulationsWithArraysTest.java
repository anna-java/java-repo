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
        int[] expectedResult = {};

        int[] actualResult = new ManipulationsWithArrays().multiplyArrayByNumber(array, multiplier);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
