package org.itstep.lesson3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;
public class home_work4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrive\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        String url = "file:///C:/automation-practice-table.html";
        System.out.println("Start test");
        webDriver.get(url);
        List<WebElement> td = webDriver.findElements(By.tagName("td"));
        for(WebElement w : td) {
        System.out.println("text = " + w.getText());
        }
       // webDriver.findElement(By.partialLinkText("details")).click();
        webDriver.findElement(By.linkText("details")).click();
        String expectedUrl = webDriver.getCurrentUrl();
        if(expectedUrl.equals("https://ru.wikipedia.org/wiki/%D0%91%D1%83%D1%80%D0%B4%D0%B6-%D0%A5%D0%B0%D0%BB%D0%B8%D1%84%D0%B0")){
           System.out.println("Pass");
           }else {
           System.err.println("Error");
           }

        webDriver.quit();
        System.out.println("End test");
    }
}
