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


    @Test
    public void StringWithoutExtraSpaces() {

        String text = "Red Rover School";
        String expectedResult = "No extra spaces found";

        String actualResult = new StringMethods().removeSpaces(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void EmptyString() {

        String text = "";
        String expectedResult = "The string is empty";

        String actualResult = new StringMethods().removeSpaces(text);

        Assert.assertEquals(actualResult, expectedResult);
    }
}
