package org.itstep.lesson7;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrive\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        System.out.println("Start test");

        webDriver.get("file:///C:/Users/totsa/OneDrive/%D0%A0%D0%B0%D0%B1%D0%BE%D1%87%D0%B8%D0%B9%20%D1%81%D1%82%D0%BE%D0%BB/%D0%94%D0%97/Java/%D0%90%D0%B2%D1%82%D0%BE%D1%82%D0%B5%D1%81%D1%82%D1%8B/Lesson6%20hw/Lesson6%20hw/windows.html");


        WebElement btn = webDriver.findElement(By.cssSelector("#btm > button"));
        System.out.println("Before open window ");
        showWindows(webDriver.getWindowHandles());
        System.out.println("------------------------------------");
        btn.click();

        Thread.sleep(3000);

        showWindows(webDriver.getWindowHandles());
        System.out.println("After open window ");

        //webDriver.switchTo().window(s);

        System.out.println("Title = " + webDriver.getTitle());

        webDriver.quit();
        System.out.println("End test");
    }
    public static void showWindows(Set<String> windowHandles) {
        System.out.println("Size = " +  windowHandles.size());
        Iterator<String> iterator = windowHandles.iterator();
        while (iterator.hasNext()) {
            System.out.println("handler = " + iterator.next());
        }
    }
}
