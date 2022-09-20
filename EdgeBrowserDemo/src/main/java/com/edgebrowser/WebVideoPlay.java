package com.edgebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebVideoPlay {
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

        WebElement videoPlayer = driver.findElement(By.id("play"));
        videoPlayer.click();

    }
}
