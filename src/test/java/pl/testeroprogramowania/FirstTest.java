package pl.testeroprogramowania;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;
import org.testng.annotations.Listeners;

import static pl.testeroprogramowania.waitUtil.waitForElementToExist;


@Listeners(value = {SimpleTestListener.class})
public class FirstTest extends BaseTest {

    WebDriver driver;

    @Test
    public void firstTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();
        waitForElementToExist(By.cssSelector("p"));
        WebElement para = driver.findElement(By.cssSelector("p"));
        Assert.assertEquals(para.isDisplayed(),true);
        Assert.assertEquals(para, "Dopiero się pojawiłem!");
        Assert.assertEquals(para,"Dopiero","Teksty są różne");
        driver.quit();
    }

    @Test
    @Ignore
    public void secondTest() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/wait2.html");
        driver.findElement(By.id("clickOnMe")).click();
        waitForElementToExist(By.cssSelector("p"));
        String paraText = driver.findElement(By.cssSelector("p")).getText();
        driver.quit();
    }


    }
