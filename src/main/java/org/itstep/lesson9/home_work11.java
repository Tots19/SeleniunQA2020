package org.itstep.lesson9;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
//        1. Открыть веб-браузер и загрузить страницу select.html.
//        2. В первом выпадающем списке "Multiple select" необходиом выбрать "Cheese"
//        3. Проверить наличие выбранного элемента "Cheese" в select элементе с id = out2
//        4. Далее выбрать "Pepperoni"
//        5. Проверить наличие выбранного элемента "Cheese" и "Pepperoni" в select элементе с id = out2
//        6. Далее выбрать "Mushrooms"
//        7. Проверить наличие выбранного элемента "Cheese" и "Pepperoni" и "Mushrooms" в select элементе с id = out2
public class home_work11 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Webdrive\\chromedriver_win32\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();
        System.out.println("Start test");
        String str = "file:///C:/home/select.html";
        webDriver.get(str);

        Actions actions = new Actions(webDriver);
        WebElement selectElement = webDriver.findElement(By.cssSelector("#out2"));
        Select select = new Select(selectElement);

        try {
            List<WebElement> option = webDriver.findElements(By.tagName("option"));
            actions
                    .click(option.get(0))
                    .keyDown(Keys.CONTROL)
                    .perform();

            String option1 = webDriver.findElement(By.id("out2")).getText();
            //System.out.println(option1);

            if (option1.equals("Cheese")) {
                System.out.println("Pass");
            } else {
                System.out.println("Error");
            }

                    actions.moveToElement(option.get(2))
                    .click().perform();
            String option2 = webDriver.findElement(By.id("out2")).getText();
            //System.out.println(option2);
            if (option2.equals("Cheese\nPepperoni")) {
                System.out.println("Pass");
            } else {
                System.out.println("Error");
            }

            actions
                    .moveToElement(option.get(4))
                    .click().pause(2000).perform();

            String option3 = webDriver.findElement(By.id("out2")).getText();
            //System.out.println(option3);
            if (option3.equals("Cheese\nPepperoni\nMushrooms")) {
                System.out.println("Pass");
            } else {
                System.out.println("Error");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        webDriver.quit();
        System.out.println("End test");
    }
}
