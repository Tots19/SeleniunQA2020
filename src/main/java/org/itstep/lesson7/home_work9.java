package org.itstep.lesson7;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//        #. Запустить браузер
//        #. Открыть страницу https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe
//        #. Переключиться на iframe#iframeResult
//        #. Получить title - должен быть "W3Schools Online Web Tutorials"
//        #. Закрыть браузер
//        Задача с подвохом, дело в том, что искомый iframe находится внутри другого и получить его title так просто не получится.
//        Подсказка: можно получить всю страницу искомого iframe и уже оттуда взять title.
//        Если будут вопросы разберем на занятии!
public class home_work9 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrive\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        System.out.println("Start test");
        webDriver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");

        WebElement iframe = null;
        try {
            iframe =  webDriver.findElement(By.cssSelector("#iframeResult"));
        }catch (NotFoundException e){
            System.out.println("Элемент не найден");
        }
        WebDriver frame = webDriver.switchTo().frame(0);
        String page = frame.getPageSource();
        //System.out.println(page);

        // первый вариант
        // boolean result = page.contains("W3Schools Free Online Web Tutorials");
        //System.out.println(result);

        //второй вариант
        if(page.contains("W3Schools Free Online Web Tutorials")) {
            //Pass
            System.out.println("Заголовок страницы содержит «ожидаемый текст»");
        }else {
            //Error
            System.out.println("Заголовок страницы не содержит «ожидаемого текста»");
        }

        Thread.sleep(2000);
        System.out.println("End test");
        webDriver.quit();

    }
}
