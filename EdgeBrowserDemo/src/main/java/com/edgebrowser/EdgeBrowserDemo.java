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
        //Gets starting Link
        driver.get("http://google.com");

        //Uses name element to find searchbox
        WebElement searchField = driver.findElement(By.name("q"));
        searchField.click();
        searchField.sendKeys("Youtube");
        searchField.sendKeys(Keys.ENTER);

        //Uses xpath to find Youtube link
        WebElement youtubeElement = driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/a/h3"));
        youtubeElement.click();

        ////Uses name element to find searchbox
        WebElement searchBox = driver.findElement(By.name("search_query"));
        searchBox.click();
        searchBox.sendKeys("Dogs");
        searchBox.sendKeys(Keys.ENTER);



        /*

        driver.get("pluralsight.com");

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
