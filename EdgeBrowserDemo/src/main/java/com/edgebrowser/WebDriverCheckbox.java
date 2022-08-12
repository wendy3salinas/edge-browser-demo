package com.edgebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverCheckbox {

    public static void main(String args[]){
        WebDriver driver = new EdgeDriver();
        driver.get("file:///C:/Users/v-wendys/Desktop/EdgeBrowserDemo/src/main/webapp/CheckboxTest.html");

        WebElement checkbox = driver.findElement(By.id("lettuceCheckbox"));
        checkbox.click();

    }
}
