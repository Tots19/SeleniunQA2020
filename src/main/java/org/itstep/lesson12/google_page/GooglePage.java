package org.itstep.lesson12.google_page;


import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class GooglePage extends Page{

    //@FindBy(how = How.TAG_NAME,using = "q");
    WebElement q;

    @FindBy(id = "result-stats")
    WebElement resultStats;

    String url = "https://google.com";

    public GooglePage(WebDriver webDriver) {
        super(webDriver);
    }


    //public  String query(String text){
    // super.webDriver.get(url);
    // q.sendKeys("hjkbrjdst rjymrb");
    //}
}
