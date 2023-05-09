package testcase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pageObject.LoginPageObj;

public class Logintc {
	WebDriver d;
  @Test
  public void login() {
	  
	  System.setProperty("webdriver.chrome.driver", "D:\\Driver\\chromedriver112\\chromedriver.exe");
	  d=new ChromeDriver();
	  d.manage().window().maximize();
		
	   d.get("https://opensource-demo.orangehrmlive.com/");
	   
	  
	   d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   
	   // Page Factory
	   PageFactory.initElements(d, LoginPageObj.class);
	   
	   LoginPageObj.user.sendKeys("Admin");
	   LoginPageObj.pswd.sendKeys("admin123");
	   LoginPageObj.submit.click();
	   
	   /*
	    // Page obj model
	   LoginPageObj.user(d).sendKeys("Admin");
	   LoginPageObj.pswd(d).sendKeys("admin123");
	   LoginPageObj.submit(d).click();
	   */
	   
	   /*
	   d.findElement(By.name("username")).sendKeys("Admin");
	   d.findElement(By.name("password")).sendKeys("admin123");
	   d.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  
	  */
  }
}
