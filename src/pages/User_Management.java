package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class User_Management {

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

        //click user management from the menubar
        driver.findElement(By.id("menu-user-setup")).click();

        //fill up the Search User
        driver.findElement(By.id("staffName")).sendKeys("Mr kamal");
        Thread.sleep(1000);
        driver.findElement(By.id("staffId")).sendKeys("2021110003");
        Thread.sleep(1000);
        driver.findElement(By.id("username")).sendKeys("k");
        Thread.sleep(1000);

        //Select dropdown
        Select s = new Select(driver.findElement(By.id("role")));
        s.selectByIndex(2);

        //hit the search button
        driver.findElement(By.name("action")).click();

        Thread.sleep(3000);

        //back to the user management page
        driver.findElement(By.xpath("//body/div[@id='right-panel']/div[1]/ol[1]/li[1]/a[1]")).click();

        //Check the reset button
        //fill up the Search User
        driver.findElement(By.id("staffName")).sendKeys("Mr kamal");
        Thread.sleep(1000);
        driver.findElement(By.id("staffId")).sendKeys("2021110003");
        Thread.sleep(1000);
        driver.findElement(By.id("username")).sendKeys("k");
        Thread.sleep(1000);

        //hit the reset button
        driver.findElement(By.xpath("//body/div[@id='right-panel']/div[3]/form[1]/div[1]/div[1]/div[1]/a[1]")).click();

    }
}
