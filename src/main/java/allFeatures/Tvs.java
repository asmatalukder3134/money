package allFeatures;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tvs {
	ChromeDriver dr;
	Tvs(ChromeDriver dr){
		this.dr=dr;
	}
	public void clickOnCatagory() {
		Shared.clickElement( dr, By.xpath(".//*[@id='accordion-filter_heading-1']/p/a"));
		
	}
	public  lessthan clicklessthan() {
		
		Shared.clickElement(dr, By.xpath(".//*[@id='accordion-filter_collapse-2']/div/a[1]/label/span[1]"));
	return new lessthan(dr);
	}
	
	
}
