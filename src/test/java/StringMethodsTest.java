import homework.StringMethods;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StringMethodsTest {

    //1
    @Test
    public void testStringWithExtraSpaces() {

        String text = "    Red Rover School   ";
        String expectedResult = "Red Rover School; extra spaces are removed";

        String actualResult = new StringMethods().removeSpaces(text);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testStringWithoutExtraSpaces() {

        String text = "Red Rover School";
        String expectedResult = "No extra spaces found";

        String actualResult = new StringMethods().removeSpaces(text);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testEmptyString() {

        String text = "";
        String expectedResult = "The string is empty";

        String actualResult = new StringMethods().removeSpaces(text);

        Assert.assertEquals(expectedResult, actualResult);
    }


    //2
    @Test
    public void testRedRoverSchoolString() {

        String text = "    Red Rover School   ";
        String expectedResult = "Red Rover School";

        String actualResult = new StringMethods().removeAllAs(text);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testPandaString() {

        String text = "panda   ";
        String expectedResult = "pnd";

        String actualResult = new StringMethods().removeAllAs(text);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testTaramasalataString() {

        String text = "taramasalata";
        String expectedResult = "trmslt";

        String actualResult = new StringMethods().removeAllAs(text);

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testEmptyString2() {

        String text = "";
        String expectedResult = "The string is empty";

        String actualResult = new StringMethods().removeAllAs(text);

        Assert.assertEquals(expectedResult, actualResult);
    }


    //3
    @Test
    public void testStringWithZerosAndSpaces() {

        String text = "3504209706040000 ";
        String expectedResult = "35429764";

        String actualResult = new StringMethods().removeAllZeros(text);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testStringWithZerosAndNoSpaces() {

        String text = "0000000111";
        String expectedResult = "111";

        String actualResult = new StringMethods().removeAllZeros(text);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testEmptyString3() {

        String text = "";
        String expectedResult = "The string is empty";

        String actualResult = new StringMethods().removeAllZeros(text);

        Assert.assertEquals(expectedResult, actualResult);
    }


    //4
    @Test
    public void testStringWithSpaces() {

        String text = "    R e d     Ro ve    r Sc   h ool   ";
        String expectedResult = "RedRoverSchool";

        String actualResult = new StringMethods().removeAllSpaces(text);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testStringWithSpaces2() {

        String text = "p a     n   d a   ";
        String expectedResult = "panda";

        String actualResult = new StringMethods().removeAllSpaces(text);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testEmptyString4() {

        String text = "";
        String expectedResult = "The string is empty";

        String actualResult = new StringMethods().removeAllSpaces(text);

        Assert.assertEquals(expectedResult, actualResult);
    }


    //5
    @Test
    public void testStringWithAs() {

        String text = "Abracadabra";
        String expectedResult = "5, 6";

        String actualResult = new StringMethods().countAs(text);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testStringWithoutAs() {

        String text = "Homenum Revelio";
        String expectedResult = "0, 15";

        String actualResult = new StringMethods().countAs(text);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testStringWithAsAndSpaces() {

        String text = "3 tarAmasAlatA";
        String expectedResult = "6, 8";

        String actualResult = new StringMethods().countAs(text);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testEmptyString5() {

        String text = "";
        String expectedResult = "The string is empty";

        String actualResult = new StringMethods().countAs(text);

        Assert.assertEquals(expectedResult, actualResult);
    }


    //6
    @Test
    public void testStringContainingWordJava() {

        String text = "As of March 2022, Java 18 is the latest version, while Java 17, 11 and 8 are the current " +
                "long-term support (LTS) versions. Oracle released the last zero-cost public update for the legacy " +
                "version Java 8 LTS in January 2019 for commercial use, although it will otherwise still support Java 8 " +
                "with public updates for personal use indefinitely. Other vendors have begun to offer zero-cost " +
                "builds of OpenJDK 8 and 11 that are still receiving security and other upgrades.";
        String expectedResult = String.valueOf(true);

        String actualResult = new StringMethods().countJava(text);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testStringNoWordJava() {

        String text = "99 little bugs in a code. 99 little bugs in a code. Take one down, and patch it around. " +
                "235 critical bugs in the code.";
        String expectedResult = String.valueOf(false);

        String actualResult = new StringMethods().countJava(text);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testEmptyString6() {

        String text = "";
        String expectedResult = "The string is empty";

        String actualResult = new StringMethods().countJava(text);

        Assert.assertEquals(expectedResult, actualResult);
    }


    //7
    @Test
    public void AddQuotes() {

        String text = "Abracadabra";
        String expectedResult = "\"Abracadabra\"";

        String actualResult = new StringMethods().insertQuotes(text);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testEmptyString7() {

        String text = "";
        String expectedResult = "The string is empty";

        String actualResult = new StringMethods().insertQuotes(text);

        Assert.assertEquals(expectedResult, actualResult);
    }


    //8
    @Test
    public void addQuotesAdvanced() {

        String text1 = "Федор Достоевский писал";
        String text2 = "Надо любить жизнь больше, чем смысл жизни.";
        String expectedResult = "Федор Достоевский писал: \"Надо любить жизнь больше, чем смысл жизни.\"";

        String actualResult = new StringMethods().insertQuotes2(text1, text2);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void addQuotesAdvanced2() {

        String text1 = "Наполеон Бонапарт писал";
        String text2 = "В моем словаре нет слова «невозможно».";
        String expectedResult = "Наполеон Бонапарт писал: \"В моем словаре нет слова \"невозможно\".\"";

        String actualResult = new StringMethods().insertQuotes2(text1, text2);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testOneStringIsEmpty() {

        String text1 = "Test";
        String text2 = "";
        String expectedResult = "Either one or two strings are empty";

        String actualResult = new StringMethods().insertQuotes2(text1, text2);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testBothStringAreEmpty() {

        String text1 = "";
        String text2 = "";
        String expectedResult = "Either one or two strings are empty";

        String actualResult = new StringMethods().insertQuotes2(text1, text2);

        Assert.assertEquals(expectedResult, actualResult);
    }


    //9
    @Test
    public void testCityStartingWithLowercase() {

        String city = "ташкент";
        String expectedResult = "Ташкент";

        String actualResult = new StringMethods().inputCity(city);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testCityEndingWithUppercase() {

        String city = "ЧикаГО";
        String expectedResult = "Чикаго";

        String actualResult = new StringMethods().inputCity(city);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testEmptyString9() {

        String city = "";
        String expectedResult = "The city name is empty";

        String actualResult = new StringMethods().inputCity(city);

        Assert.assertEquals(expectedResult, actualResult);
    }


    //10
    @Test
    public void testIndexOf() {

        String text = "Abracadabra";
        char letter = 'b';
        String expectedResult = "bracadab";

        String actualResult = new StringMethods().printPartialText(text, letter);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testLastIndexOf() {

        String text = "Whippersnapper";
        char letter = 'p';
        String expectedResult = "ppersnapp";

        String actualResult = new StringMethods().printPartialText(text, letter);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testEmptyString10() {

        String text = "";
        char letter = 'a';
        String expectedResult = "The string is empty";

        String actualResult = new StringMethods().printPartialText(text, letter);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testEmptyChar() {

        String text = "Abracadabra";
        char letter = ' ';
        String expectedResult = "The char is empty";

        String actualResult = new StringMethods().printPartialText(text, letter);

        Assert.assertEquals(expectedResult, actualResult);
    }


    //11
    @Test
    public void testWhenFirstAndLastLettersAreTheSame() {

        String word = "Abracadabra";
        boolean expectedResult = true;

        boolean actualResult = new StringMethods().compareFirstAndLastLetters(word);

        Assert.assertEquals(expectedResult, actualResult);
    }


    //11
    @Test
    public void testWhenFirstAndLastLettersAreDifferent() {

        String word = "Whippersnapper";
        boolean expectedResult = false;

        boolean actualResult = new StringMethods().compareFirstAndLastLetters(word);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testEmptyString11() {

        String word = "";
        boolean expectedResult = false;

        boolean actualResult = new StringMethods().compareFirstAndLastLetters(word);

        Assert.assertEquals(expectedResult, actualResult);
    }


    //12
    @Test
    public void testStringContainingTwoWords() {

        String text = "Red Rover";
        String expectedResult = "Rover";

        String actualResult = new StringMethods().returnSecondWord(text);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testStringContainingOneWord() {

        String text = "RedRover";
        String expectedResult = "The string consists of just one word";

        String actualResult = new StringMethods().returnSecondWord(text);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testEmptyString12() {

        String text = "";
        String expectedResult = "The string is empty";

        String actualResult = new StringMethods().returnSecondWord(text);

        Assert.assertEquals(expectedResult, actualResult);
    }


    //13
    @Test
    public void testPartialString() {

        String text = "Red rover";
        int num1 = 1;
        int num2 = 4;
        String expectedResult = "Rover";

        String actualResult = new StringMethods().returnPartialString(text, num1, num2);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testNegativeNumbers() {

        String text = "Red rover";
        int num1 = -1;
        int num2 = 4;
        String expectedResult = "Numbers can't be negative";

        String actualResult = new StringMethods().returnPartialString(text, num1, num2);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testEqualNumbers() {

        String text = "Red rover";
        int num1 = 3;
        int num2 = 3;
        String expectedResult = "Redrover";

        String actualResult = new StringMethods().returnPartialString(text, num1, num2);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testEmptyString13() {

        String text = "";
        int num1 = 2;
        int num2 = 5;
        String expectedResult = "The string is empty";

        String actualResult = new StringMethods().returnPartialString(text, num1, num2);

        Assert.assertEquals(expectedResult, actualResult);
    }


    //14
    @Test
    public void testStringWithSpaces3() {

        String sentence = "QA for Everyone";
        String[] expectedResult = {"QA", "for", "Everyone"};

        String[] actualResult = new StringMethods().returnWordsFromTheSentence(sentence);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testStringWithSpaces4() {

        String sentence = "Александр Сергеевич Пушкин";
        String[] expectedResult = {"Александр", "Сергеевич", "Пушкин"};

        String[] actualResult = new StringMethods().returnWordsFromTheSentence(sentence);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testEmptyString14() {

        String sentence = "";
        String[] expectedResult = new String[0];

        String[] actualResult = new StringMethods().returnWordsFromTheSentence(sentence);

        Assert.assertEquals(expectedResult, actualResult);
    }


    //15 skipped


    //16
    @Test
    public void testRepeatedString() {

        String word = "one";
        int num = 5;

        String expectedResult = "oneoneoneoneone";

        String actualResult = new StringMethods().returnRepeatedString(word, num);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testNegativeNumber() {

        String word = "one";
        int num = -7;

        String expectedResult = "The number must be a positive digit";

        String actualResult = new StringMethods().returnRepeatedString(word, num);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testZero() {

        String word = "one";
        int num = 0;

        String expectedResult = "The number must be a positive digit";

        String actualResult = new StringMethods().returnRepeatedString(word, num);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testEmptyString16() {

        String word = "";
        int num = 2;

        String expectedResult = "The string is empty";

        String actualResult = new StringMethods().returnRepeatedString(word, num);

        Assert.assertEquals(expectedResult, actualResult);
    }


    //17
    @Test
    public void testString() {

        String text = "Moscow";
        int index = 3;
        String expectedResult = "c";

        String actualResult = new StringMethods().returnLetter(text, index);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testNegativeIndex() {

        String text = "Moscow";
        int index = -5;
        String expectedResult = "The index can't be a negative number";

        String actualResult = new StringMethods().returnLetter(text, index);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testEmptyString17() {

        String text = "";
        int index = 2;
        String expectedResult = "The string is empty";

        String actualResult = new StringMethods().returnLetter(text, index);

        Assert.assertEquals(expectedResult, actualResult);
    }


    //18
    @Test
    public void testTheSameWords() {

        String word1 = "one";
        String word2 = "One";
        String word3 = "ONE";
        boolean expectedResult = true;

        boolean actualResult = new StringMethods().compareThreeWords(word1, word2, word3);

        Assert.assertEquals(expectedResult, actualResult);

    }


    @Test
    public void testDifferentWords() {

        String word1 = "one";
        String word2 = "Один";
        String word3 = "ONE";
        boolean expectedResult = false;

        boolean actualResult = new StringMethods().compareThreeWords(word1, word2, word3);

        Assert.assertEquals(expectedResult, actualResult);
    }


    @Test
    public void testEmptyString18() {

        String word1 = "one";
        String word2 = "Один";
        String word3 = "";
        boolean expectedResult = false;

        boolean actualResult = new StringMethods().compareThreeWords(word1, word2, word3);

        Assert.assertEquals(expectedResult, actualResult);
    }
}
