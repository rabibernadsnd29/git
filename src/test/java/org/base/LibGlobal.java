package org.base;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LibGlobal {
public static WebDriver driver;
	
	public void getDriver() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\elcot\\eclipse-workspace\\BrowserLaunch\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
		public void getUrl(String url) {
			driver.get(url);
		}
		public void enterText(WebElement element,String data) {
			element.sendKeys(data);
		}
		public void btnClick(WebElement element) {
			element.click();
		}
		public void dropDown(WebElement ref,String name ) {
			Select s = new Select(ref);
			s.selectByVisibleText(name);
		}
		
}
