package org.itstep.lesson10;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//        #. Запустить браузер
//        #. Открыть url https://swisnl.github.io/jQuery-contextMenu/demo.html
//        #. Кликнуть правой кнопкой мыши по кнопке "right click me"
//        #. В появившемся конекстном меню нажать на кнопку "Quit"
//        #. Переключится на модальное диалоговое окно alert
//        #. Проверить текст сообщения в "alert: clicked: quit"
//        #. Закрыть модально окно
//        #. Закрыть браузер
public class home_work12 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrive\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        System.out.println("Start test");
        webDriver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

        Actions action = new Actions(webDriver).contextClick(webDriver.findElement(By.cssSelector("body > div.wy-grid-for-nav > section > div > div > div > p > span")));
        action.build().perform();

        Thread.sleep(2000);
        WebElement quit = null;
        try {

            quit = webDriver.findElement(By.cssSelector("body > ul > li.context-menu-item.context-menu-icon.context-menu-icon-quit > span"));
            quit.click();
            Thread.sleep(2000);
            WebDriver.TargetLocator targetLocator = webDriver.switchTo();
            Alert alert = targetLocator.alert();

            String expectedText = "alert: clicked: quit";
            String actualText = alert.getText();

            if (expectedText.equals(actualText)) {
                System.out.println("Pass");
            } else {
                System.out.println("Модальное окно содержит текст - " + actualText);
            }
            alert.accept();
            Thread.sleep(2000);
            System.out.println("Все прошло хорошо");
        } catch (NoSuchElementException | InterruptedException e) {
            System.out.println("Элемент не найден");
        }

        Thread.sleep(2000);
        webDriver.quit();
        System.out.println("End test");
    }
}
