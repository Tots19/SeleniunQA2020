package org.itstep.lesson6;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InnerTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrive\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        System.out.println("Start test");

        webDriver.get("file:///C:/home/windows.html");

        WebElement iframe = null;
                try {
                   iframe =  webDriver.findElement(By.cssSelector("#iframe > iframe"));
                }catch (NotFoundException e){
                    System.out.println("Элемент не найден");
                }
        WebDriver frame = webDriver.switchTo().frame(iframe);
        WebElement select =  frame.findElement(By.cssSelector("#selectable > li:nth-child(1)"));
        select.click();
        Thread.sleep(2000);
        System.out.println("End test");
    }
}
