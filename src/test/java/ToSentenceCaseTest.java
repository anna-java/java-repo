/*
* 1. Prepare the expected result - "Mom is cleaning the window"
* 2. Go to the website https://capitalizemytitle.com
* 3. Input data - mom is cleaning the Window
* 4. Click the Sentence case button
* 5. Get the modified text
* 6. Verify that modified text matches the expected result
*/

import homework.ToSentenceCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class ToSentenceCaseTest {

    private static final String URL = "https://capitalizemytitle.com";
    private static final String TEST_SENTENCE = "mom is cleaning the Window";


    @Test
    public void testCapitalizeMyTitle() throws InterruptedException {

        final String expectedResult = new ToSentenceCase().toSentenceCase(TEST_SENTENCE);

        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        /*
        xpath
        //textarea[@id='main_input']
        or
        css
        textarea#main_input
        */

        //3 ways to find an element
        driver.findElement(By.name("main_input"));
        WebElement textArea = driver.findElement(By.xpath("//textarea[@id='main_input']"));
        driver.findElement(By.cssSelector("textarea#main_input"));

        textArea.sendKeys(TEST_SENTENCE);
        Thread.sleep(3000);

        WebElement sentenceCaseButton = driver.findElement(By.id("sentencecase"));
        sentenceCaseButton.click();
        Thread.sleep(3000);

        String actualResult = textArea.getAttribute("value");

        Assert.assertEquals(expectedResult, actualResult);

        driver.quit();
        //driver.close();
    }
}
