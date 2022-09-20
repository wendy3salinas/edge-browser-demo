package com.edgebrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverSignIn {
    public static void main(String args[]){
        WebDriver driver = new EdgeDriver();

        driver.get("https://github.com/");

        WebElement signIn = driver.findElement(By.linkText("Sign in"));
        signIn.click();
        signIn.sendKeys("wendy3salinas");



    }
}
