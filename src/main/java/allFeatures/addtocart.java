package allFeatures;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class addtocart {
	ChromeDriver dr;
	addtocart(ChromeDriver dr){
		this.dr=dr;
	}
public void clickContinueshop() {
	Shared.clickElement(dr, By.xpath(".//*[@id='ShopCartForm']/div[4]/div/input"));
}
}
