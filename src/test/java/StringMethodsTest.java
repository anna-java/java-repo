import homework.StringMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StringMethodsTest {

    @Test
    public void StringWithExtraSpaces() {

        String text = "    Red Rover School   ";
        String expectedResult = "Red Rover School; extra spaces are removed";

        String actualResult = new StringMethods().removeSpaces(text);

        Assert.assertEquals(actualResult, expectedResult);

    }
}
