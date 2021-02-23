package org.itstep.lesson2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lesson2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Webdrive\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

       // webDriver.get("http://www.google.com");
       // System.out.println("ok");
        //webDriver.quit();
       // System.out.println("Start test");
        //webDriver.navigate().to("http:gismeteo.ua");
        //System.out.println("Loaded gismeteo.ua" + webDriver.getPageSource());
        //Thread.sleep(1000);

       // webDriver.navigate().to("http:olx.ua");
        //System.out.println("Loaded olx.ua" + webDriver.getPageSource());
        //Thread.sleep(1000);

       // webDriver.navigate().to("http:logbook.itstep.org");
       // System.out.println("Loaded logbook.itstep.org" + webDriver.getPageSource());
        //Thread.sleep(1000);


       // webDriver.navigate().back();
       // System.out.println("Back to olx.ua" + webDriver.getCurrentUrl());
        //Thread.sleep(1000);


       // webDriver.navigate().back();
       // System.out.println("Back to gismeteo.ua" + webDriver.getCurrentUrl());
       // Thread.sleep(1000);

       // webDriver.navigate().forward();
       // System.out.println("Forward to olx.ua" + webDriver.getCurrentUrl());
       // Thread.sleep(1000);

        //new test
String[] url = {"http:gismeteo.ua",
        "http:olx.ua",
        "http:logbook.itstep.org"};
        System.out.println("Start test");

       // for (int i = 0; i < url.length; i++){
           // webDriver.navigate().to(url[i]);
           // System.out.println("Loaded" + webDriver.getCurrentUrl());
           // Thread.sleep(1000);
       // }

        for (String s : url) {
            webDriver.navigate().to(s);
            System.out.println("Loaded" + webDriver.getCurrentUrl());
            Thread.sleep(1000);
        }

        for (int i = url.length-1; i > 0; i--){
            webDriver.navigate().back();
            System.out.println("Back" + url[i-1] + "" + webDriver.getCurrentUrl());
        }

        webDriver.navigate().forward();
        System.out.println("Forward to olx.ua" + webDriver.getCurrentUrl());

        webDriver.quit();
        System.out.println("End test");
    }
}

