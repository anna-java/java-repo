import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Web99BottlesTest {

    @Test(invocationCount = 10)
    public void test99Bottles() {

        WebDriver driver = new ChromeDriver();
        int expectedResult = 100;

        driver.get("https://www.99-bottles-of-beer.net");
        driver.findElement(By.xpath("//ul[@id='menu']//a[@href='/']")).click();
        driver.findElement(By.linkText("Song Lyrics")).click();
        /* partial locator can be used as well
        driver.findElement(By.partialLinkText("Song")).click(); */
        List<WebElement> elements = driver.findElements(By.xpath("//div[@id='main']//p"));

        int actualResult = elements.size();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }
}
