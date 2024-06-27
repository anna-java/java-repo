import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

public class LumaTopJacketsTest {

    @Test
    public void testLumaTopJacketsTest() {

        WebDriver driver = new EdgeDriver();
        driver.get("https://magento.softwaretestingboard.com/");
        driver.findElement(By.xpath("//span[text()='Women']/preceding-sibling::span")).click();

        //span[@class='ui-menu-icon ui-icon ui-icon-carat-1-e']
        //span[text()='Women']/preceding-sibling::span

    }
}
