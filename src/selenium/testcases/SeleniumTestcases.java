/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selenium.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author TharangaD
 */
public class SeleniumTestcases {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "E:\\Selenium\\Chrome Driver\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.google.com");
       WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Saudi Arabia");

        searchBox.submit();
         JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        while (true) {
            // Execute JavaScript to scroll down to the bottom of the page
            jsExecutor.executeScript("window.scrollTo(0, document.body.scrollHeight);");

            // Add a short delay to let more results load (adjust the value if needed)
            try {
                Thread.sleep(1000); // Wait for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Check if the page has reached the bottom by comparing the current scroll position
            // with the total height of the page
            long currentScrollPosition = (long) jsExecutor.executeScript("return window.scrollY;");
            long totalPageHeight = (long) jsExecutor.executeScript("return document.body.scrollHeight;");
            if (currentScrollPosition >= totalPageHeight) {
                break; // Reached the bottom of the page, exit the loop
            }
       
        }

    }
    
}
