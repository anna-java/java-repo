import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Web99BottlesTest {

    @Test
    public void test99Bottles() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.99-bottles-of-beer.net");
    }

}
