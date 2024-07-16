package Objects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;

public class Popups {
	
	WebDriver driver;
	
	public Popups(WebDriver driver) {
		this.driver = driver;
	}
	
	

	By Popbutton = By.xpath("//a[contains(text(), \"Popups\")]");
	
	
	public void Accesspop() {
		
		driver.navigate().to("https://practice-automation.com/popups");
		
		
	}
	
	By confirm_btn = By.id("confirm");
	
	public void confirmPop() {
		
		driver.findElement(confirm_btn).click();
		driver.switchTo().alert().dismiss();
		driver.findElement(By.id("confirmResult")).getText();
		Assert.assertEquals(driver.findElement(By.id("confirmResult")).getText(), "Cancel it is!");
		
		
	}
	
	By alert_btn = By.id("alert");
	
	public void AlertPop() {
		driver.findElement(alert_btn).click();
		driver.switchTo().alert().accept();
		
	}
	
	By prompt_btn = By.id("prompt");
	By promptResult = By.id("promptResult");
	
	public void PromptPop() {
		driver.findElement(prompt_btn).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("UserOne");
		alert.accept();
		Assert.assertEquals(driver.findElement(By.id("promptResult")).getText(), "Nice to meet you, UserOne!");
		
		
	}
	
	

}
