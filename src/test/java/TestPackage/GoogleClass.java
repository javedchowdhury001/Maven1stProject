package TestPackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class GoogleClass extends MyUltilityClass {
	
  @Test
  public void Google() {
	  Driver.get("https://www.google.com/");
	  Driver.findElement(By.xpath("// input[@title='Search']")).sendKeys("Hello");
	  
	  
  }
}
