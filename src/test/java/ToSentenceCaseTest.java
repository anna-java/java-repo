import homework.ToSentenceCase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ToSentenceCaseTest {

    @Test
    public void testCapitalizeMyTitle() {

        String sentence = "Mother";
        final String expectedResult = new ToSentenceCase().toSentenceCase(sentence);

        WebDriver driver = new ChromeDriver();
        driver.get("https://capitalizemytitle.com");




        driver.quit();


    }
}
