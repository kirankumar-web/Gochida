package Gochida_Dashboard;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login 
{
	static WebDriver driver;
	
  @BeforeTest
  public static void loginpage() throws InterruptedException
  {
      //WebDriverManager.chromedriver().setup();

     WebDriverManager.chromedriver().driverVersion("114.0.5735").setup();

      
      //WebDriverManager.firefoxdriver().setup();
      
      // driver = new FirefoxDriver();

       driver = new ChromeDriver();
      
      driver.get("https://www.racanaa.energy/login");
      
      Thread.sleep(3000);          
	  
}
  @Test
  public static void testrun()
  {
      driver.quit();

  }
}
