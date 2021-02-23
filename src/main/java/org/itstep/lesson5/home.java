package org.itstep.lesson5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class home {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrive\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("file:///C:/Users/totsa/OneDrive/%D0%A0%D0%B0%D0%B1%D0%BE%D1%87%D0%B8%D0%B9%20%D1%81%D1%82%D0%BE%D0%BB/%D0%94%D0%97/Java/%D0%90%D0%B2%D1%82%D0%BE%D1%82%D0%B5%D1%81%D1%82%D1%8B/Lesson4%20hw/select_hw.html");
        WebElement selectElement = webDriver.findElement(By.cssSelector("#auto"));
        Select select = new Select(selectElement);

        List<WebElement> options = select.getOptions();
        select.selectByIndex(1);
        String output = webDriver.findElement(By.id("out1")).getText();
        //System.out.println(output);
        if (output.equals("value:volvo")) {
            System.out.println("Pass");
        } else {
            System.out.println("Error");
        }
        Thread.sleep(2000);

        select.selectByValue("saab");
        String output1 = webDriver.findElement(By.id("out1")).getText();
        //System.out.println(output1);
        if (output1.equals("value:saab")) {
            System.out.println("Pass");
        } else {
            System.out.println("Error");
        }
        Thread.sleep(2000);

        select.selectByVisibleText("Mercedes");
        String output2 = webDriver.findElement(By.id("out1")).getText();
        //System.out.println(output2);
        if (output2.equals("value:mercedes")) {
            System.out.println("Pass");
        } else {
            System.out.println("Error");
        }
        Thread.sleep(2000);

        webDriver.quit();
    }
}
