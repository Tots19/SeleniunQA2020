package org.itstep.lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
//          1. Открыть страницу http://www.seleniumeasy.com/test/dynamic-data-loading-demo.html
//          2. Нажать на кнопку "Get New User"
//          3. Проверить появление изображения http://seleniumeasy.com/test/img/loader-image.gif в
//             div элементе с id='loading'
//          4. Дождаться загрузки данных пользователя
//          5. Вывести First Name, Last Name и значение атрибута src загруженного изображения
public class home {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrive\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = null;

        WebElement button = null;
        try {
            webDriver = new ChromeDriver();
            webDriver.get("http://www.seleniumeasy.com/test/dynamic-data-loading-demo.html");
            System.out.println("Start test");
            webDriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            WebElement element = webDriver.findElement(By.cssSelector("#save"));
            WebElement element1 = webDriver.findElement(By.cssSelector("#loading"));
            element.click();

            if(element1.isDisplayed()) {
                System.out.println("Pass");
            }else{
                System.out.println("Error");
            }

            Thread.sleep(2000);
            System.out.println(element1.getText());
            WebElement img = webDriver.findElement(By.cssSelector("#loading > img"));
            String src = img.getAttribute("src");
            System.out.println(src);

            System.out.println("End test");
        } catch (Exception e) {
            e.getMessage();
        }finally {
            assert webDriver != null;
            webDriver.quit();
        }

    }
}
