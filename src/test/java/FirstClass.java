
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstClass {
    private WebDriver driver;
    private WebDriverWait waittt;
    @Before
    public void start() {
        driver = new ChromeDriver();
    }

    @Test
    public void FirstClass() {
        driver.get("https://www.google.com");
    }
}
