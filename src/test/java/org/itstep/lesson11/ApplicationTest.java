package org.itstep.lesson11;


import org.junit.After;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;



import java.time.Duration;
import java.util.NoSuchElementException;

import java.util.function.Function;

import static org.junit.Assert.*;

public class ApplicationTest {
    private WebDriver webDriver;


    @Before
    public void setUp() {
        System.out.println("Before test");
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrive\\chromedriver_win32\\chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("C:\\Users\\totsa\\IdeaProjects\\SeleniunQA2020\\src\\test\\resources\\index.html");
    }

    @Test
    public void testHeaderMain() throws InterruptedException {
        Thread.sleep(30000);
        WebElement h1 = webDriver.findElement(By.tagName("h1"));
        System.out.println(h1.getText());
    }

    @Test
    public void testHeaderFluentWait() {
        //Явное ожидание
        FluentWait<WebDriver> fluentWait = new FluentWait<>(webDriver);
        //общее время ожидания 30 секунд
        //fluentWait.withTimeout(30, TimeUnit.SECONDS);
        fluentWait.withTimeout(Duration.ofSeconds(30));
        //проверка каждую секнду
        fluentWait.pollingEvery(Duration.ofSeconds(1));
        //Игнорируем исключения
        fluentWait.ignoring(NoSuchElementException.class);
        //WaitH1 waitH1 = new WaitH1();//Класс реализует интерфейс Function
        //fluentWait.until(waitH1);


        //Анонимный класс
  /*      fluentWait.until(new Function<WebDriver, WebElement>() {
            @Override
            public WebElement apply(WebDriver webDriver) {
                return webDriver.findElement(By.tagName("h1"));
            }
        });*/

        //Лямда выражения
        WebElement h1 = fluentWait.until(webDriver -> webDriver.findElement(By.tagName("h1")));
        System.out.println(h1.getText());

    }


    @Test
    public void testHeaderWebDriverWait() {
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 15);
        WebElement h1 = webDriverWait.until(webDriver -> webDriver.findElement(By.tagName("h1")));
        assertEquals("Hello selenium", h1.getText());

    }

    @Test
    public void test1() {
        WebDriverWait webDriverWait = new WebDriverWait(webDriver, 30);
        String alert = webDriverWait.until(webDriver -> webDriver.switchTo().alert().getText());
        assertEquals("Test it", alert);
        //System.out.println(alert);

    }

        @Test
        public void test2() {
            WebDriverWait webDriverWait = new WebDriverWait(webDriver, 30);
            WebElement blue = webDriverWait.until(webDriver -> webDriver.findElement(By.className("blue")));
            assertTrue(blue.isDisplayed());
        }

        @After
        public void close() {
            webDriver.quit();
        }

    }


class WaitH1 implements Function<WebDriver, WebElement>{
    //int count;

    @Override
    public WebElement apply(WebDriver webDriver) {
        //System.out.println("Wait " + count + " second");
        return webDriver.findElement(By.tagName("h1"));
    }
}