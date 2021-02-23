package org.itstep.lesson1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class home_work1 {
        public static void main(String[] args) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Webdrive\\chromedriver_win32\\chromedriver.exe");
            WebDriver webDriver = new ChromeDriver();
            String url = "https://www.kaercher.com/";
            webDriver.get(url);
            Thread.sleep(1000);
            System.out.println(webDriver.getCurrentUrl());
            if (url.equals(webDriver.getCurrentUrl())) {
                System.out.println("Pass");
            } else {
                System.out.println("Error");
            }
        }
}
