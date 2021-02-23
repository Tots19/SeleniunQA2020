package org.itstep.lesson1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Application {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrive\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        String url = "https://rozetka.com.ua/";
        webDriver.get(url);
        //webDriver.get("http://rozetka.com.ua");
        Thread.sleep(1000);
        System.out.println(webDriver.getCurrentUrl());
        if(url.equals(webDriver.getCurrentUrl())) {
            System.out.println("Pass");
        }else {
            System.out.println("Error");
        }
        System.out.println(webDriver.getTitle());
// запись html в переменною
        String pageSours = webDriver.getPageSource();
        // Обьект который записывает данные в файл index.html
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("index.html"));
        bufferedWriter.write(pageSours);//сам процесс записи данных в файл
        bufferedWriter.close();
        //webDriver.getPageSource();

        System.out.println("OK");
        webDriver.close();

    }
}
