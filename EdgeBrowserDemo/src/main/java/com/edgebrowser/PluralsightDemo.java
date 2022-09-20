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

       //WebElement pluralsightLink = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/a/h3"));
        //pluralsightLink.click();

        //WebElement signIn = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/div[2]/header/nav[1]/div/ul/li[5]/button"));
        //signIn.click();

        /*
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Images")));

        WebElement imagesLink = driver.findElement(By.linkText("Images"));
        imagesLink.click();

        WebElement imageElement = driver.findElement(By.cssSelector("img[class ='rg_i Q4LuWd']"));
        imageElement.click();
        //driver.quit();
        */

    }
}
