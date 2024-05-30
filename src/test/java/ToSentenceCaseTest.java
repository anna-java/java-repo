import homework.ToSentenceCase;
import org.openqa.selenium.WebDriver;
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
        xPath
        //textarea[@id='main_input']

        CSS
        textarea#main_input
        */

        //driver.findElement();




        driver.quit();
    }
}
