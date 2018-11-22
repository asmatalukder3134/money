package allFeatures;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.LoadableComponent;
@FindBy(xpath="")
 
public  class lessthan extends LoadableComponent<lessthan> {
	ChromeDriver dr;
	lessthan(ChromeDriver dr){
		this.dr=dr;
	}
	public void abc() {
		dr.findElement(By.xpath(""));
	}
	
	public addtocart clickAddToCart() {
		Shared.clickElement(dr, By.xpath(".//*[@id='cart-d']"));
		return new addtocart(dr);
	}


	@Override
	protected void load() {
	dr.getCurrentUrl().equals("");
		
	}


	@Override
	protected void isLoaded() throws Error {
		dr .navigate().to("");
		
	}

}
