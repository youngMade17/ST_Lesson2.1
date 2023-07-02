
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.By.name;

public class FirstClass {
    private WebDriver driver;
    private WebDriverWait wait;
    @Before
    public void start() {
        driver = new ChromeDriver();
    }

    @Test
    public void FirstClass() {

        driver.get("https://www.google.com");
        driver.quit();
    }
}
