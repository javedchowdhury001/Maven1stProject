 package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.testng.Assert;

import org.testng.annotations.Test;



public class QaQuestion extends MyUltilityClass {

	
  @Test
  public void QaQuestionAutomation() {
	  Driver.get("http://www.qaquestions.org/");
	  Driver.findElement(By.linkText("Selenium Tutorials")).click();
	  Driver.findElement(By.linkText("Selenium Automation Testing Theories and IDE tutorials")).click();
       
	  for(String hh:Driver.getWindowHandles()) {
		  Driver.switchTo().window(hh);
	  }
	
	  WebElement wEl=Driver.findElement(By.xpath("//h1"));
	  String strHeader = wEl.getText();
	  System.out.println(strHeader);
	  Assert.assertEquals(strHeader, "Selenium Automation Testing Theories and IDE tutorials","Didn't Match");
  }

  
  
  
  }
	  
  
  
  


