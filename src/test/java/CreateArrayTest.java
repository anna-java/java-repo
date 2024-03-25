import algorithms.CreateArray;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CreateArrayTest {

    @Test
    public void createIntArray() {

        int num1 = 1, num2 = 2, num3 = 3, num4 = 4, num5 = 5;
        int[] expectedResult = {1, 2, 3, 4, 5};

        int[] actualResult = new CreateArray().createIntArray(num1, num2, num3, num4, num5);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void createDoubleArray() {

        double num1 = 1.1, num2 = 2.5, num3 = 3.7, num4 = 4.0, num5 = 5.5;
        double[] expectedResult = {1.1, 2.5, 3.7, 4.0, 5.5};

        double[] actualResult = new CreateArray().createDoubleArray(num1, num2, num3, num4, num5);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void createStringArray() {

        String word1 = "It", word2 = "was", word3 = "an", word4 = "apple", word5 = "pie";
        String[] expectedResult = {"It", "was", "an", "apple", "pie"};

        String[] actualResult = new CreateArray().createStringArray(word1, word2, word3, word4, word5);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void createArrayFromTextTest() {

        String sentence = "It was an apple pie";
        String[] expectedResult = {"It", "was", "an", "apple", "pie"};

        String[] actualResult = new CreateArray().createArrayFromText(sentence);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
