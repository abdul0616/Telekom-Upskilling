package Objects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WindowsOperations {
	
	WebDriver driver;
	
	public WindowsOperations(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
//	By tablebutto = By.cssSelector("a[href='https://practice-automation.com/tables/']");

    By tablebutton = By.xpath("(//div[contains(@class,\"is-style-shadow\")])[3]");
	
	public void AccessWindow() {
		
		driver.navigate().to("https://practice-automation.com/window-operations/");

		
	}
	
	
	public void NewTab() {
		
		WebElement tabButton = driver.findElement(By.xpath("(//button[contains(@class, \"custom_btn\")])[1]")); 
		tabButton.click();
		
		
		String originalHandle = driver.getWindowHandle();
//		System.out.println(driver.getWindowHandles());
//		System.out.println(originalHandle);
//		
		for(String handle1: driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
			
			
		}
		String url = driver.getCurrentUrl();
		
//		WebElement search = driver.findElement(By.id("search-form-664ad9b252b1a"));
		Assert.assertEquals(url, "https://automatenow.io/");
//			System.out.println(search.getText());
		driver.switchTo().window(originalHandle);
		
		
	}
	
	
	public void ReplaceWindow() {
		WebElement tabButton = driver.findElement(By.xpath("(//button[contains(@class, \"custom_btn\")])[2]")); 
		tabButton.click();
		
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://automatenow.io/");
		driver.navigate().back();
		
	}
	
	public void NewWindow() {
		
		WebElement tabButton = driver.findElement(By.xpath("(//button[contains(@class, \"custom_btn\")])[3]")); 
		tabButton.click();
		String originalHandle = driver.getWindowHandle();
//		System.out.println(driver.getWindowHandles());
//		System.out.println(originalHandle);
		
		for(String handle1: driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
			
			
		}
		String url = driver.getCurrentUrl();
		
//		WebElement search = driver.findElement(By.id("search-form-664ad9b252b1a"));
		Assert.assertEquals(url, "https://automatenow.io/");
		driver.close();
//			System.out.println(search.getText());
		driver.switchTo().window(originalHandle);
		
		
	}

}
