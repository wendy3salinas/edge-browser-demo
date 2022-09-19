package com.edgebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTables {

    public static void main(String args[]){
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/v-wendys/Desktop/EdgeBrowserDemo/src/main/webapp/TableTest.html");

        /*
        WebElement outerTable = driver.findElement(By.tagName("table"));
        WebElement innerTable = outerTable.findElement(By.tagName("table"));
        WebElement row = innerTable.findElement(By.tagName("td"));
        System.out.println(row.getText());
        */

        WebElement row = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr[2]/td"));


        System.out.println(row.getText());

    }

}
