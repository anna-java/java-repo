import homework.ToSentenceCase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToSentenceCaseTest {

    private static final String SENTENCE = "Mother";
    private static final String URL = "https://capitalizemytitle.com";


    @Test
    public void testCapitalizeMyTitle() {

        final String expectedResult = new ToSentenceCase().toSentenceCase(SENTENCE);

        WebDriver driver = new ChromeDriver();
        driver.get(URL);




        driver.quit();


    }
}
