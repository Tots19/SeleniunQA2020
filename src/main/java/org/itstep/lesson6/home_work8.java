package org.itstep.lesson6;


import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Запустить браузер.
//Открыть файл windows.html
//Протестировать оставишиеся iframe.
public class home_work8 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrive\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        System.out.println("Start test");
        webDriver.get("file:///C:/home/windows.html");
        WebElement iframe = null;
        try {
            iframe =  webDriver.findElement(By.cssSelector("#main > div:nth-child(7) > iframe"));
        }catch (NotFoundException e){
            System.out.println("Элемент не найден");
        }
        WebDriver frame = webDriver.switchTo().frame(iframe);
        String select =  frame.findElement(By.tagName("h1")).getText();

        if (select.equals("Inner html")) {
            System.out.println("Pass");
        } else {
            System.out.println("Error");
        }
        Thread.sleep(2000);

        System.out.println("End test");
        webDriver.quit();

    }
}
