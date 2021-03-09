package org.itstep.lesson11;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrive\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        System.out.println("Start test");
        webDriver.get("C:\\Users\\totsa\\IdeaProjects\\SeleniunQA2020\\src\\test\\resources\\index.html");



        Thread.sleep(2000);
        webDriver.quit();
        System.out.println("End test");
    }
}
