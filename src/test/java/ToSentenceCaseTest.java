import homework.ToSentenceCase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import javax.swing.text.html.CSS;

public class ToSentenceCaseTest {

    //private static final String SENTENCE = "Mom";
    private static final String URL = "https://capitalizemytitle.com";
    private static final String TEST_SENTENCE = "mom is cleaning the Window";


    @Test
    public void testCapitalizeMyTitle() {

        final String expectedResult = new ToSentenceCase().toSentenceCase(TEST_SENTENCE);

        WebDriver driver = new ChromeDriver();
        driver.get(URL);

        /*
        xpath
        //textarea[@id='main_input']

        css
        textarea#main_input
        */

        //three ways to find an element
        driver.findElement(By.name("main_input"));
        WebElement textarea = driver.findElement(By.xpath("//textarea[@id='main_input']"));
        driver.findElement(By.cssSelector("textarea#main_input"));

        textarea.sendKeys(TEST_SENTENCE);



        driver.quit();
        //driver.close();
    }
}
