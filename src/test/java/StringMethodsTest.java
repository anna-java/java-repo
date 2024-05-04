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


    //4
    @Test
    public void StringWithSpaces() {

        String text = "    R e d     Ro ve    r Sc   h ool   ";
        String expectedResult = "RedRoverSchool";

        String actualResult = new StringMethods().removeAllSpaces(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void StringWithSpaces2() {

        String text = "p a     n   d a   ";
        String expectedResult = "panda";

        String actualResult = new StringMethods().removeAllSpaces(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void EmptyString4() {

        String text = "";
        String expectedResult = "The string is empty";

        String actualResult = new StringMethods().removeAllSpaces(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    //5
    @Test
    public void StringWithAs() {

        String text = "Abracadabra";
        String expectedResult = "5, 6";

        String actualResult = new StringMethods().countAs(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void StringWithoutAs() {

        String text = "Homenum Revelio";
        String expectedResult = "0, 15";

        String actualResult = new StringMethods().countAs(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void StringWithAsAndSpaces() {

        String text = "3 tarAmasAlatA";
        String expectedResult = "6, 8";

        String actualResult = new StringMethods().countAs(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void EmptyString5() {

        String text = "";
        String expectedResult = "The string is empty";

        String actualResult = new StringMethods().countAs(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    //6
    @Test
    public void ContainsWordJava() {

        String text = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current " +
                "long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy " +
                "version Java 8 LTS in January 2019 for commercial use, although it will otherwise still support Java 8 " +
                "with public updates for personal use indefinitely. Other vendors have begun to offer zero-cost " +
                "builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        String expectedResult = String.valueOf(true);

        String actualResult = new StringMethods().countJava(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void NoWordJava() {

        String text = "99 little bugs in a code. 99 little bugs in a code. Take one down, and patch it around. " +
                "235 critical bugs in the code.";
        String expectedResult = String.valueOf(false);

        String actualResult = new StringMethods().countJava(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void EmptyString6() {

        String text = "";
        String expectedResult = "The string is empty";

        String actualResult = new StringMethods().countJava(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    //7
    @Test
    public void AddQuotes() {

        String text = "Abracadabra";
        String expectedResult = "\"Abracadabra\"";

        String actualResult = new StringMethods().insertQuotes(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void EmptyString7() {

        String text = "";
        String expectedResult = "The string is empty";

        String actualResult = new StringMethods().insertQuotes(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    //8
    @Test
    public void addQuotesAdvanced() {

        String text1 = "Федор Достоевский писал";
        String text2 = "Надо любить жизнь больше, чем смысл жизни.";
        String expectedResult = "Федор Достоевский писал: \"Надо любить жизнь больше, чем смысл жизни.\"";

        String actualResult = new StringMethods().insertQuotes2(text1, text2);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void addQuotesAdvanced2() {

        String text1 = "Наполеон Бонапарт писал";
        String text2 = "В моем словаре нет слова «невозможно».";
        String expectedResult = "Наполеон Бонапарт писал: \"В моем словаре нет слова \"невозможно\".\"";

        String actualResult = new StringMethods().insertQuotes2(text1, text2);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void OneStringIsEmpty() {

        String text1 = "Test";
        String text2 = "";
        String expectedResult = "Either one or two strings are empty";

        String actualResult = new StringMethods().insertQuotes2(text1, text2);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void BothStringAreEmpty() {

        String text1 = "";
        String text2 = "";
        String expectedResult = "Either one or two strings are empty";

        String actualResult = new StringMethods().insertQuotes2(text1, text2);

        Assert.assertEquals(actualResult, expectedResult);
    }


    //9
    @Test
    public void testCityStartingWithLowercase() {

        String city = "ташкент";
        String expectedResult = "Ташкент";

        String actualResult = new StringMethods().inputCity(city);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testCityEndingWithUppercase() {

        String city = "ЧикаГО";
        String expectedResult = "Чикаго";

        String actualResult = new StringMethods().inputCity(city);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testEmptyString9() {

        String city = "";
        String expectedResult = "The city name is empty";

        String actualResult = new StringMethods().inputCity(city);

        Assert.assertEquals(actualResult, expectedResult);
    }


    //10
    @Test
    public void testIndexOf() {

        String text = "Abracadabra";
        char letter = 'b';
        String expectedResult = "bracadab";

        String actualResult = new StringMethods().printPartialText(text, letter);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testLastIndexOf() {

        String text = "Whippersnapper";
        char letter = 'p';
        String expectedResult = "ppersnapp";

        String actualResult = new StringMethods().printPartialText(text, letter);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testEmptyString10() {

        String text = "";
        char letter = 'a';
        String expectedResult = "The string is empty";

        String actualResult = new StringMethods().printPartialText(text, letter);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testEmptyChar() {

        String text = "Abracadabra";
        char letter = ' ';
        String expectedResult = "The char is empty";

        String actualResult = new StringMethods().printPartialText(text, letter);

        Assert.assertEquals(actualResult, expectedResult);
    }


    //11
    @Test
    public void testWhenFirstAndLastLettersAreTheSame() {

        String word = "Abracadabra";
        boolean expectedResult = true;

        boolean actualResult = new StringMethods().compareFirstAndLastLetters(word);

        Assert.assertEquals(actualResult, expectedResult);
    }


    //11
    @Test
    public void testWhenFirstAndLastLettersAreDifferent() {

        String word = "Whippersnapper";
        boolean expectedResult = false;

        boolean actualResult = new StringMethods().compareFirstAndLastLetters(word);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testEmptyString11() {

        String word = "";
        boolean expectedResult = false;

        boolean actualResult = new StringMethods().compareFirstAndLastLetters(word);

        Assert.assertEquals(actualResult, expectedResult);
    }


    //12
    @Test
    public void testStringContainingTwoWords() {

        String text = "Red Rover";
        String expectedResult = "Rover";

        String actualResult = new StringMethods().returnSecondWord(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testStringContainingOneWord() {

        String text = "RedRover";
        String expectedResult = "The string consists of just one word";

        String actualResult = new StringMethods().returnSecondWord(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testEmptyString12() {

        String text = "";
        String expectedResult = "The string is empty";

        String actualResult = new StringMethods().returnSecondWord(text);

        Assert.assertEquals(actualResult, expectedResult);
    }


    //13
    @Test
    public void testPartialString() {

        String text = "Red rover";
        int num1 = 1;
        int num2 = 4;
        String expectedResult = "Rover";

        String actualResult = new StringMethods().returnPartialString(text, num1, num2);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testNegativeNumbers() {

        String text = "Red rover";
        int num1 = -1;
        int num2 = 4;
        String expectedResult = "Numbers can't be negative";

        String actualResult = new StringMethods().returnPartialString(text, num1, num2);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testEqualNumbers() {

        String text = "Red rover";
        int num1 = 3;
        int num2 = 3;
        String expectedResult = "Redrover";

        String actualResult = new StringMethods().returnPartialString(text, num1, num2);

        Assert.assertEquals(actualResult, expectedResult);
    }


    @Test
    public void testEmptyString13() {

        String text = "";
        int num1 = 2;
        int num2 = 5;
        String expectedResult = "The string is empty";

        String actualResult = new StringMethods().returnPartialString(text, num1, num2);

        Assert.assertEquals(actualResult, expectedResult);
    }



}
