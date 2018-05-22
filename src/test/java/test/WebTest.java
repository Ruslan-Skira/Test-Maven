package test;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;

import java.util.concurrent.TimeUnit;

public class WebTest {
    WebDriver driver;
    String name = "Программист";

    @Before
    public void init() {
        System.setProperty("webdriver.chrome.driver", "/Users/ruslanskira/Sites/Testing-Maven/chromedriver");
        driver = new ChromeDriver();
    }
    @Test
    public void testSearch() throws InterruptedException{
        String baseUrl = "https://csltd.com.ua/";
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(baseUrl);
        String searchButtonLocator = "#undefined-sticky-wrapper > header > div > div > div.pure-u-lg-3-4.pure-u-xs-1 > div.pure-menu.pure-menu-horizontal.menu-head > ul > li:nth-child(1) > a";
        WebElement element = driver.findElement(By.cssSelector(searchButtonLocator));
        element.click();
        WebElement field = driver.findElement(By.cssSelector("#search_form_type_term"));
        field.sendKeys(name);
        field.sendKeys(Keys.RETURN);

        Thread.sleep(10_000);
        //finde line
        //element sent
    }
    @After
    public void closeWeb (){
        driver.close();

    }
}
