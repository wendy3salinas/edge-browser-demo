package com.edgebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverData {
    public static void main(String args[]) {
        WebDriver driver = new EdgeDriver();

        driver.get("file:///C:/Users/wendy/Desktop/EdgeBrowserDemo/src/main/webapp/index.html");

        WebElement myName = driver.findElement(By.name("First_Name"));
        myName.click();
        myName.sendKeys("Wendy");

        WebElement myName2 = driver.findElement(By.id("LastName"));
        myName2.click();
        myName2.sendKeys("Salinas");

        WebElement emailBox = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
        emailBox.click();
        emailBox.sendKeys("test@gmail.com");

        WebElement addressBox = driver.findElement(By.name("Address"));
        addressBox.click();
        addressBox.sendKeys("seattle wa");

        WebElement commentsBox = driver.findElement(By.name("Comments"));
        commentsBox.click();
        commentsBox.sendKeys("Here are Comments 'sdfv' 'sdv'");

        WebElement submitbutton = driver.findElement(By.xpath("//*[@id=\"widgets\"]/div[9]/input"));
        submitbutton.click();
    }
}
