package TestPackage;


import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class MyUltilityClass {
 
 WebDriver Driver;

@BeforeTest
  public void beforeTest() {
 WebDriverManager.chromedriver().setup();
 Driver=new ChromeDriver();  
  }



@AfterTest
  public void afterTest() {
	  Driver.close();
	  Driver.quit();
  }

}
