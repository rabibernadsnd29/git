package org.junit;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SampleJunit {
	public static WebDriver driver;
	@BeforeClass
	public static void BrowserConfig() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\elcot\\eclipse-workspace\\Framework\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test
	public void tc0() {
		driver.findElement(By.id("username")).sendKeys("hariprasad2904");
		driver.findElement(By.id("password")).sendKeys("8zjVVB7zynWJeiPlco");
		driver.findElement(By.id("login")).click();
		WebElement selectLocation = driver.findElement(By.id("location"));
		Select s1 = new Select(selectLocation);
		s1.selectByVisibleText("Sydney");
		WebElement selectHotels = driver.findElement(By.id("hotels"));
		Select s2 = new Select(selectHotels);
		s2.selectByVisibleText("Hotel Creek");
		WebElement findElement3 = driver.findElement(By.id("room_type"));
		Select s6= new Select(findElement3);
		s6.selectByVisibleText("Double");
		driver.findElement(By.id("Submit")).click();
		driver.findElement(By.xpath("//input[@id='radiobutton_0']")).click();
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("first_name")).sendKeys("Hari");
		driver.findElement(By.id("last_name")).sendKeys("Prasad");
		driver.findElement(By.id("address")).sendKeys("chennai");
		driver.findElement(By.id("cc_num")).sendKeys("9999999999999998");
		WebElement selectCardType = driver.findElement(By.id("cc_type"));
		Select s3 = new Select(selectCardType);
		s3.selectByVisibleText("American Express");
		WebElement findElement = driver.findElement(By.id("cc_exp_month"));
		Select s4 = new Select(findElement);
		s4.selectByVisibleText("March");
		WebElement findElement2 = driver.findElement(By.id("cc_exp_year"));
		Select s5 = new Select(findElement2);
		s5.selectByVisibleText("2022");
		driver.findElement(By.id("cc_cvv")).sendKeys("3434");
		driver.findElement(By.id("book_now")).click();
	}
	@AfterClass
	public static void BrowserClose() {
		driver.close();
	}

}
