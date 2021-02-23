package org.itstep.lesson4;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class home_work5 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrive\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        String[] url = {"http://google.com",
                "http://google.com"};
        System.out.println("Start test");

         for (int i = 0; i < url.length; i++){
             webDriver.navigate().to(url[i]);
             WebElement to_find = webDriver.findElement(By.name("q"));
             to_find.sendKeys("вагон цистерна светлая оптом украина");
             to_find.submit();
             Thread.sleep(2000);
             String element = webDriver.findElement(By.cssSelector("#result-stats")).getText();
             String nobr = webDriver.findElement(By.tagName("nobr")).getText();
             String element2 = element.replace(nobr, "");
             //System.out.println(element2);
            if (element2.equals("Результатов: примерно 11 600 ")) {
                 System.out.println("Pass");
            } else {
                 System.out.println("Error");
            }
         }
        System.out.println("End test");
        webDriver.quit();
    }
}
