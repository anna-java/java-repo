//First Selenium auto test

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class FirstSeleniumTest {
    WebDriver driver = new ChromeDriver();

    @Test
    public void openMyGithubProfile() {

        driver.get("https://github.com/anna-java/");
        Assert.assertEquals(driver.getTitle(), "anna-java (Anna B) · GitHub");
        driver.quit();
        //or driver.close();
    }
}