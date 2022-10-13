package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dashboard {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "D:\\Software\\ChromeDriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://192.168.4.94:8081/sas-portal-test/login");

        //Input username & password
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");

        //click the remember me check box
        driver.findElement(By.id("RememberMe")).click();

        Thread.sleep(2000);

        //click the Login button
        driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();

        Thread.sleep(3000);

        //Dashboard
        //click on view eye (Notice)
        driver.findElement(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[3]")).click();

        String expectedResult = "Wearing a face mask shows kindness. My mask protects you, your mask protects me. Stay safe.";

        String actualResult = driver.findElement(By.xpath("//td[contains(text(),'Wearing a face mask shows kindness. My mask protec')]")).getText();

        if (actualResult.equals(expectedResult)) {
            System.out.println("Test Passed Successfully ✓");
        }
        else {
            System.out.println("Test Failed");
        }

        //Class attendance Class change
        driver.findElement(By.id("nine-tab")).click();
        driver.findElement(By.id("ten-tab")).click();

    }
}
