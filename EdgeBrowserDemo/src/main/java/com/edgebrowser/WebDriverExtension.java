package com.edgebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverExtension {
    public static void main (String args[]){
        WebDriver driver = new EdgeDriver();
        //Gets starting Link
        driver.get("http://google.com");
    }
}

