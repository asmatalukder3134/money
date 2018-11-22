package allFeatures;

import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
ChromeDriver dr;
	public void openBrowser(String browser) {
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\shapl\\Downloads\\chromedriver_win32\\chromedriver.exe");
			dr=new ChromeDriver();
		}
	}
public void nevigateToUrl() {
	dr.get("https://www.costco.com");
}
	
	
	
	
}
