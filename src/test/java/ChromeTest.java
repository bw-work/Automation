import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by ben on 5/17/16.
 */

public class ChromeTest
{
    WebDriver chrome;

    @Test (priority = 0)
    public void startBrowser()
    {
        System.setProperty("webdriver.chrome.driver","/home/ben/IdeaProjects/chromedriver");

        chrome = new ChromeDriver();
    }

    @Test (priority = 2)
    public void search()
    {
        chrome.get("http://www.amazon.com");

        WebElement searchBox = chrome.findElement(By.id("twotabsearchtextbox"));

        searchBox.sendKeys("short ram intake");
        searchBox.sendKeys(Keys.RETURN);
    }

    @Test (priority = 3)
    public void storeSearch()
    {
        chrome.get("http://www.google.com");

        WebElement googleSearch = chrome.findElement(By.id("lst-ib"));

        googleSearch.sendKeys("auto stores in kearney ne");
        googleSearch.sendKeys(Keys.RETURN);
    }
}