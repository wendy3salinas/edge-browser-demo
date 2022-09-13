package com.edgebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class EdgeBrowserDemo {

    public static void main(String args[]){
        WebDriver driver = new EdgeDriver();

        driver.get("http://google.com");


        WebElement searchField = driver.findElement(By.name("q"));
        searchField.click();
        searchField.sendKeys("Youtube");
        searchField.sendKeys(Keys.ENTER);

        WebElement youtubeElement = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/a/h3"));
        youtubeElement.click();

        WebElement searchBox = driver.findElement(By.id("search-container"));
        searchBox.click();
        searchBox.sendKeys("Dogs");
        searchBox.sendKeys(Keys.ENTER);

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
