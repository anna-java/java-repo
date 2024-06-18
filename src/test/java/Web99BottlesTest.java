import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Web99BottlesTest {

    @Test
    public void test99Bottles() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.99-bottles-of-beer.net");
        driver.findElement(By.xpath("//ul[@id='menu']//a[@href='/']")).click();
        driver.findElement(By.linkText("Song Lyrics")).click();

        driver.quit();
    }
}
