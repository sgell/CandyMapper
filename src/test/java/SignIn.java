import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SignIn {



   @Test
   void SignInn() {
            WebDriver driver = new ChromeDriver();
          driver.manage().window().maximize();
          driver.get("https://candymapper.com/");

       //popup
       driver.findElement(By.id("popup-widget111379-cta")).click();

       // click join us
       driver.findElement(By.id("bs-2")).click();

       String expectedTitle = "Login";
       String actualTitle = driver.getTitle();
       Assert.assertEquals(actualTitle, expectedTitle);

       // email field
       driver.findElement(By.name("email"))
               .sendKeys("zamund4e@gmail.com");

       // password field
       driver.findElement(By.name("password")).sendKeys("12345678");

       // sign in button

       driver.findElement(By.cssSelector("button[type='submit']"))
               .click();

       driver.close();

   }

}
