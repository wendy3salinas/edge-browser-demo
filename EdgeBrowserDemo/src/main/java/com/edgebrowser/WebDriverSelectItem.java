package com.edgebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebDriverSelectItem {

    public static void main(String args[]) {
        WebDriver driver = new EdgeDriver();
        driver.get("file:///C:/Users/v-wendys/Desktop/EdgeBrowserDemo/src/main/webapp/SelectItemTest.HTML.html");


        WebElement selectElement = driver.findElement(By.id("select1"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("Maybe");

        /*
        Select oSelect = new Select();
        oSelect.selectByVisibleText("");

        Selelct oSelect = new Select();
        */

    }
}

