package org.itstep.lesson2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class home_work3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrive\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        System.out.println("Start test");
        webDriver.navigate().to("https://itstep.dp.ua/about-academy" );
        System.out.println("Loaded itstep.dp.ua/about-academy/");
        Thread.sleep(1000);
        String title = "О нас: история, преимущества и достижения Компьютерной Академии ШАГ";
        webDriver.getTitle();
        if (title.equals(webDriver.getTitle())) {
            System.out.println("Pass");
        } else {
            System.out.println("Error");
        }

        webDriver.navigate().to("https://itstep.dp.ua/formy-obucheniya/");
        System.out.println("Loaded itstep.dp.ua/formy-obucheniya/" );
        Thread.sleep(1000);
        String title1 = "Формы и направления обучения в Компьютерной Академии ШАГ Днепропетровск";
        webDriver.getTitle();
        if (title1.equals(webDriver.getTitle())) {
            System.out.println("Pass");
        } else {
            System.out.println("Error");
        }

        webDriver.navigate().to("https://itstep.dp.ua/testirovanie-po-qa/");
        System.out.println("Loaded itstep.dp.ua/testirovanie-po-qa/");
        Thread.sleep(1000);
        String title2 = "Курсы тестирования ПО, курсы тестировщиков в Днепропетровске – КА ШАГ";
        webDriver.getTitle();
        if (title2.equals(webDriver.getTitle())) {
            System.out.println("Pass");
        } else {
            System.out.println("Error");
        }

        webDriver.quit();
        System.out.println("End test");
    }
}
