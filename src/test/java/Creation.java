import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Creation{

    @Test
    void account() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://candymapper.com/");


       //popup
       driver.findElement(By.id("popup-widget111379-cta")).click();
        Thread.sleep(2000);

        String expectedTitle = "CandyMapper.Com";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);


        // find creation account

        driver.findElement(By.id("bs-4")).click();

        Thread.sleep(2000);

          // click on registration form
        driver.findElement(By.id("n-111258111296-membership-create-account")).click();

       // fill first name
        driver.findElement(By.name("nameFirst")).sendKeys("Dragostin");

        // fill last name

        driver.findElement(By.name("nameLast")).sendKeys("Dragostinov");

        // email

        driver.findElement(By.name("email")).sendKeys("zamund4e@gmail.com");

        // click create account button

        driver.findElement(By.xpath("//button[@data-ux-btn='primary']\n")).click();


        driver.close();





    }
}
