package paralleltestng;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParallelTestngDemo 
{

    WebDriver driver;
   

    @BeforeMethod
    public void setUp()
    {
    	//intialisation of chrome driver
        driver = new ChromeDriver();
       
     
    }

    @Test
    public void demoWebShop() 
    {
    	//navigate to the url
        driver.get("https://demowebshop.tricentis.com/computers");

        WebElement shoppingkart = driver.findElement(By.className("cart-label"));
        shoppingkart.click();
        
    
    }

    @Test
    public void openNon() 
    {
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2F");

       

        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("anju303123@gmail.com");

        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("Demo1234" );

        WebElement btnLogin = driver.findElement(By.className("login-button"));
        btnLogin.click();
       
    }

   @Test
   public void openShopsy()
   {
        driver.get("https://www.shopsy.in/");

       WebElement searchbox = driver.findElement(By.name("q"));
        searchbox.sendKeys("watches" + Keys.ENTER);
    }

   
    }




