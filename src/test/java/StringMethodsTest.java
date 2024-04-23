import homework.StringMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StringMethodsTest {

    //1
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


    //2
    @Test
    public void RedRoverSchoolString() {

        String text = "    Red Rover School   ";
        String expectedResult = "Red Rover School";

        String actualResult = new StringMethods().removeAllAs(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void PandaString() {

        String text = "panda   ";
        String expectedResult = "pnd";

        String actualResult = new StringMethods().removeAllAs(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void TaramasalataString() {

        String text = "taramasalata";
        String expectedResult = "trmslt";

        String actualResult = new StringMethods().removeAllAs(text);

        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test
    public void EmptyString2() {

        String text = "";
        String expectedResult = "The string is empty";

        String actualResult = new StringMethods().removeAllAs(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    //3
    @Test
    public void StringWithZerosAndSpaces() {

        String text = "3504209706040000 ";
        String expectedResult = "35429764";

        String actualResult = new StringMethods().removeAllZeros(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void StringWithZerosNoSpaces() {

        String text = "0000000111";
        String expectedResult = "111";

        String actualResult = new StringMethods().removeAllZeros(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void EmptyString3() {

        String text = "";
        String expectedResult = "The string is empty";

        String actualResult = new StringMethods().removeAllZeros(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


}
