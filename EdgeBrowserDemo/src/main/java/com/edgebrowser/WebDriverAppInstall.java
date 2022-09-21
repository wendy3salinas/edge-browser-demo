package com.edgebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverAppInstall {
    public static void main(String args[]) {
        WebDriver driver = new EdgeDriver();

        driver.get("http://google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.click();
        searchBox.sendKeys("Zoom Download");
        searchBox.sendKeys(Keys.ENTER);

        WebElement zoomLink = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div[2]/ul/li[3]/div/div/div/div[1]/div/a/h3"));
        zoomLink.click();

        WebElement zoomHost = driver.findElement(By.linkText("SIGN IN"));
        zoomHost.click();
    }
}
