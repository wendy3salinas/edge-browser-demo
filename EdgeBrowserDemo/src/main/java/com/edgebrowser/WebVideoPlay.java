package com.edgebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebVideoPlay {
    public static void main(String args[]){
        WebDriver driver = new EdgeDriver();

        driver.get("http://www.youtube.com");

        WebElement searchbox = driver.findElement(By.name("search_query"));
        searchbox.click();
        searchbox.sendKeys("Dogs");
        searchbox.sendKeys(Keys.ENTER);

        WebElement video = driver.findElement(By.xpath("//*[@id=\"video-title\"]/yt-formatted-string"));
        video.click();

    }
}
