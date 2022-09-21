package com.edgebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class PluralsightDemo {

    public static void main(String args[]){
        WebDriver driver = new EdgeDriver();

        driver.get("http://google.com");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.click();
        searchBox.sendKeys("Pluralsight");
        searchBox.sendKeys(Keys.ENTER);

        WebElement imagesLink = driver.findElement(By.linkText("Images"));
        imagesLink.click();



        WebElement imageElement = driver.findElement(By.cssSelector("img[class ='rg_i Q4LuWd']"));
        imageElement.click();
        //driver.quit();


    }
}
