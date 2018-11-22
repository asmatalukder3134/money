package allFeatures;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

public class Step1 {
ChromeDriver dr; 
	Step1(ChromeDriver dr){
		this.dr=dr;
	} 
	public void sabmaOver() {
		Shared.mouseOverAction(dr, By.xpath(".//*[@id='navigation-dropdown']"));
		Shared.mouseOverAction(dr, By.xpath(".//*[@id='primary-category-container']/li[1]"));
	}
	public Tvs clickOnTvs() {
		Shared.clickElement(dr, By.xpath(".//*[@id='navigation-flyout-container']/div[1]/ul[1]/li/a"));
	return new Tvs(dr);
	}

}
