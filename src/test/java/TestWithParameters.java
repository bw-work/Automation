import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.*;

/**
 * Created by ben on 5/13/16.
 */

public class TestWithParameters
{
    @Test
    @Parameters({"author","searchKey"})
    public void testNoParameter(@Optional("abc") String author, String searchKey) throws InterruptedException
    {
        WebDriver driver = new FirefoxDriver();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://google.com");

        WebElement searchText = driver.findElement(By.name("q"));

        //Searching text in google text box

        searchText.sendKeys(searchKey);

        System.out.println("Welcome ->" + author + " Your search key is->" + searchKey);

        System.out.println("Thread will sleep now");

        Thread.sleep(3000);

        System.out.println("Value in Google Search Box = " + searchText.getAttribute("value") + " ::: Value given by input = " + searchKey);

        //verifying the value in google search box

        Assert.assertTrue(searchText.getAttribute("value").equalsIgnoreCase(searchKey));

    }
}