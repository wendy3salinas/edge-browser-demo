package com.edgebrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserDemo {

    public static void main(String args[]){
        WebDriver driver = new EdgeDriver();
        driver.get("http://www.pluralsight.com");
    }
}
