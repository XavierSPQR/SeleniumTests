/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestCases;

import javax.swing.JOptionPane;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

    public void ScrollWithChrome() {
// Relative path given to chromedriver.
        String driverPath = System.getProperty("user.dir") + "\\src\\Drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        WebDriver driver = new ChromeDriver();
        try{
            driver.get("https://www.google.com");
            Thread.sleep(5000);
            WebElement searchBox = driver.findElement(By.name("q"));
            searchBox.click();
            Thread.sleep(2000);
            searchBox.sendKeys("Mahinda Rajapaksa");
            Thread.sleep(2000);
            searchBox.submit();
        }catch(Exception E){
            JOptionPane.showMessageDialog(null, E);
        }
       
        
       
 




    }
}
