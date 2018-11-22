package allFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Shared { 
	  ChromeDriver dr;
Shared(ChromeDriver dr){
this.dr=dr;
}
	public static  void clickElement(ChromeDriver dr,By by) {
		dr.findElement(by).click();
	}
public static void mouseOverAction(ChromeDriver dr,By by) {
	Actions ac = new Actions(dr);
	ac.moveToElement(dr.findElement(by)).build().perform();
}
public static void dropDown(ChromeDriver dr,By e) {
	Select s=new Select(dr.findElement(e));
	s.selectByVisibleText("");
}
	

	
	
}
