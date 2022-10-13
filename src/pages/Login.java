package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

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

        //click the logout
        driver.findElement(By.xpath("//header/div[2]/div[1]/div[2]/a[1]/img[1]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//header/div[2]/div[1]/div[2]/div[1]/a[1]")).click();



    }
}
