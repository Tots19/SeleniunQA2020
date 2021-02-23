package org.itstep.lesson1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class home_work2 {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrive\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.navigate().to("http://google.com");
        System.out.println("Loaded google page");
        String title = "Google";
        Thread.sleep(1000);
        webDriver.navigate().to("https://www.kaercher.com/");
        System.out.println("Loaded kaercher page");
        String title1 = "Kaercher";
        Thread.sleep(1000);
        webDriver.quit();


 }

}
