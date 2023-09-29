package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/**
 *
 * @author TharangaD
 */
public class UGCTestCase {

    public void UgcWebsiteTest() {
        String driverPath = System.getProperty("user.dir") + "\\src\\Drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);

        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://admission.ugc.ac.lk/#/login");
            WebElement username = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/form/div[1]/div/div/div[1]/div[1]/input"));
            username.click();
            Thread.sleep(2000);
            //your username
            username.sendKeys("YourEmail@gmail.com");
            Thread.sleep(5000);
            WebElement password = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/form/div[2]/div/div/div[1]/div[1]/input"));
            password.click();
            Thread.sleep(2000);
            //your password
            password.sendKeys("********");
            Thread.sleep(5000);
            WebElement login = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[2]/div/form/div[4]/button"));
            // Click the login button
            login.click();
            Thread.sleep(5000);
            WebElement index = driver.findElement(By.id("other_previous_al_index_number"));
            WebElement submit = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/form/fieldset[2]/div[4]/div[3]/button"));
            WebElement year = driver.findElement(By.id("other_previous_al_year"));
            Select comboBox = new Select(year);
            int x = 7527593;
            while (x > 7527408) {
                String in = Integer.toString(x);
                comboBox.selectByIndex(3);
                Thread.sleep(2000);
                index.click();
                Thread.sleep(500);
                index.sendKeys(in);
                Thread.sleep(500);
                submit.click();
                Thread.sleep(3000);
                index.clear();
                x--;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
