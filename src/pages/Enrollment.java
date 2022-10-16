package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.network.model.DataReceived;
import org.openqa.selenium.support.ui.Select;

public class Enrollment {
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



        //Select Enrollment from the menubar
        driver.findElement(By.xpath("//body/aside[@id='left-panel']/nav[1]/div[1]/ul[1]/li[3]/a[1]")).click();
        Thread.sleep(2000);
        //select Staff from submenu
        driver.findElement(By.xpath("//a[contains(text(),'Staff')]")).click();
        Thread.sleep(2000);

        //We are now in ENROLLMENT(STAFF) page

        //Search Staff with Name
        //Enter name of the staff
        driver.findElement(By.id("name")).sendKeys("Rakib");
        Thread.sleep(2000);
        //hit the search button
        driver.findElement(By.name("action")).click();
        Thread.sleep(1000);
        //hit the reset button
        driver.findElement(By.xpath("//body/div[@id='right-panel']/div[3]/form[1]/div[1]/div[1]/div[1]/a[1]")).click();



        //Search Staff with Staff ID
        //Enter Staff ID
        driver.findElement(By.id("staffId")).sendKeys("2021110014");
        Thread.sleep(1000);
        //hit the search button
        driver.findElement(By.name("action")).click();
        Thread.sleep(1000);
        //hit the reset button
        driver.findElement(By.xpath("//body/div[@id='right-panel']/div[3]/form[1]/div[1]/div[1]/div[1]/a[1]")).click();



        //Search Staff with Email
        //enter email address
        driver.findElement(By.id("email")).sendKeys("teacher12@gmail.com");
        Thread.sleep(1000);
        //hit the search button
        driver.findElement(By.name("action")).click();
        Thread.sleep(1000);
        //hit the reset button
        driver.findElement(By.xpath("//body/div[@id='right-panel']/div[3]/form[1]/div[1]/div[1]/div[1]/a[1]")).click();
        Thread.sleep(2000);



        //search staff with staff type
        Select s = new Select(driver.findElement(By.id("staffType")));
        s.selectByIndex(2);
        Thread.sleep(2000);
        //hit the search button
        driver.findElement(By.name("action")).click();
        Thread.sleep(2000);
        //hit the reset button
        driver.findElement(By.xpath("//body/div[@id='right-panel']/div[3]/form[1]/div[1]/div[1]/div[1]/a[1]")).click();
        Thread.sleep(2000);


        //search staff with status
        Select s1 = new Select(driver.findElement(By.id("status")));
        s1.selectByIndex(1);
        Thread.sleep(2000);
        //hit the search button
        driver.findElement(By.name("action")).click();
        Thread.sleep(2000);

        //check the add new button
        driver.findElement(By.xpath("//body/div[@id='right-panel']/div[3]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]/a[1]")).click();

        //Fill up the personal info
        //upload photo
//        driver.findElement(By.className("upload-btn")).click();
        driver.findElement(By.id("face")).sendKeys("C:\\Users\\tigerit\\Pictures\\nasir.jpg");

    }
}