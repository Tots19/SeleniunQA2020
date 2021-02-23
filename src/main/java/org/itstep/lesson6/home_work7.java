package org.itstep.lesson6;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

//Запустить браузер.
//Открыть файл windows.html
//Протестировать модальное окно Prompt.

public class home_work7 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrive\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("file:///C:/home/windows.html");
        System.out.println("Start test1");

        WebElement button = null;

        try {
            button = webDriver.findElement(By.cssSelector("#prompt > button"));
            button.click();

            WebDriver.TargetLocator targetLocator = webDriver.switchTo();
            Alert alert = targetLocator.alert();

            String expectedText = "How old are you?";
            String actualText = alert.getText();

            if (expectedText.equals(actualText)) {
                System.out.println("Passed");
            } else {
                System.out.println("Модальное окно содержит текст " + actualText);
            }
            Thread.sleep(2000);
            alert.dismiss();
            Thread.sleep(2000);

            String span = webDriver.findElement(By.cssSelector("#prompt > span")).getText();
            if (span.equals("null")) {
                System.out.println("Pass");
            } else {
                System.out.println("Error");
            }

            System.out.println("Все прошло хорошо");
        } catch (NoSuchElementException | InterruptedException e) {
            System.out.println("Элемент не найден");
        }
        System.out.println("End test1");
        System.out.println("Start test2");

        try {
            button = webDriver.findElement(By.cssSelector("#prompt > button"));
            button.click();

            WebDriver.TargetLocator targetLocator = webDriver.switchTo();
            Alert alert = targetLocator.alert();

            java.lang.String keysToSend;
            alert.sendKeys("18");
            Thread.sleep(2000);
            alert.accept();
            Thread.sleep(2000);

            String span = webDriver.findElement(By.cssSelector("#prompt > span:nth-child(3)")).getText();
            if (span.equals("18")) {
                System.out.println("Pass");
            } else {
                System.out.println("Error");
            }

            System.out.println("Все прошло хорошо");
        } catch (NoSuchElementException | InterruptedException e) {
            System.out.println("Элемент не найден");
        }

        webDriver.quit();
        System.out.println("End test2");

    }
}
