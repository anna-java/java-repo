import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class LumaTopJacketsTest {

    @Test
    public void testLumaTopJacketsTest() throws InterruptedException {

        //WebDriver driver = new EdgeDriver();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://magento.softwaretestingboard.com/");
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[text()='Women']/preceding-sibling::span")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//span[text()='Women']/ancestor::li//span[text()='Tops']/preceding-sibling::span"));
        Thread.sleep(2000);
    }
}
