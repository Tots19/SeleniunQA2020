package org.itstep.lesson12;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrive\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = null;


        try {
            webDriver = new ChromeDriver();
            webDriver.get("C:\\Users\\totsa\\IdeaProjects\\SeleniunQA2020\\src\\test\\resources\\index.html");
            System.out.println("Start test");

            webDriver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
            WebElement h1 = webDriver.findElement(By.tagName("h1"));
            if(!h1.getText().equals("Hello selenium")) {
                System.out.println("Error");
            }else{
                System.out.println("Pass");
            }
            System.out.println("End test");
        } catch (Exception e) {
            e.getMessage();
        }finally {
            assert webDriver != null;
            webDriver.quit();
        }
    }
}
