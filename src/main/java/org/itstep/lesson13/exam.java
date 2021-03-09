package org.itstep.lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class exam {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrive\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        webDriver.navigate().to("http://shop.demoqa.com/shop/");
        System.out.println("Start test");
        webDriver.manage().window().maximize();

        WebElement element = null;
        try {
            element = webDriver.findElement(By.cssSelector("#noo-site > div.noo-container-shop.noo-shop-wrap > div.noo-container-catalog > div > form > select"));
            element.click();
            Thread.sleep(1000);
            element= webDriver.findElement(By.cssSelector("#noo-site > div.noo-container-shop.noo-shop-wrap > div.noo-container-catalog > div > form > select > option:nth-child(2)"));
            element.click();
            Thread.sleep(1000);
            element= webDriver.findElement(By.cssSelector("#noo-site > div.noo-container-shop.noo-shop-wrap > div.noo-row > div > div > div.noo-product-item.one.noo-product-sm-4.not_featured.post-1318.product.type-product.status-publish.has-post-thumbnail.product_cat-shoes.product_tag-shoes.product_tag-women.has-featured.instock.shipping-taxable.purchasable.product-type-variable > div > span.posted_in > a"));
            element.click();
            Thread.sleep(1000);
            element= webDriver.findElement(By.cssSelector("#noo-site > div.noo-container-shop.noo-shop-wrap > div.noo-row > div > div > div.noo-product-item.one.noo-product-sm-4.not_featured.post-1287.product.type-product.status-publish.has-post-thumbnail.product_cat-shoes.product_tag-shoes.product_tag-women.has-featured.first.instock.shipping-taxable.purchasable.product-type-variable > div > h3 > a"));
            element.click();
            Thread.sleep(1000);
            String h1 = webDriver.findElement(By.tagName("h1")).getText();
            //System.out.println(h1);
        if (h1.equals("ROSE GOLD SIMPLE STRAP PLATFORM SANDALS")) {
            System.out.println("Pass");
        } else {
            System.out.println("Error");
        }
            Thread.sleep(1000);
            webDriver.navigate().to("http://shop.demoqa.com/shop/");
            webDriver.manage().window().maximize();

            element= webDriver.findElement(By.xpath("//*[@id=\"noo-site\"]/header/div[2]/div/div/div/a"));
            element.click();
            WebElement search= webDriver.findElement(By.cssSelector("#noo-site > header > div.search-header.search-header-eff > div.noo-container > form > input.form-control"));
            search.sendKeys("QUAY AUSTRALIA X JLO REINA WHITE SUNGLASSES");
            Thread.sleep(1000);
            search.submit();

            String price= webDriver.findElement(By.cssSelector("#product-1323 > div.single-product-content > div.summary.entry-summary > p > ins > span > bdi")).getText();
            //System.out.println(price);
        if (price.equals("₹55.00")) {
            System.out.println("Pass");
        } else {
            System.out.println("Error");
        }
            Thread.sleep(1000);
            webDriver.quit();
            System.out.println("Все прошло хорошо");
        } catch (NoSuchElementException | InterruptedException e) {
            System.out.println("Элемент не найден");
        }
        System.out.println("End test");
    }
}
