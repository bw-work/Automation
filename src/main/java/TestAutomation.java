/**
 * Created by ben on 5/13/16.
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestAutomation
{
    public static void main(String[] args)
    {
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://www.amazon.com";

        driver.get(baseUrl);
    }
}