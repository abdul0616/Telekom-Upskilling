package Objects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calenders {
	
WebDriver driver;
	
	public Calenders(WebDriver driver) {
		
		this.driver = driver;
	
		
		
	}
	
	
	
	By Calenderbutton = By.xpath("//a[contains(text(), \"Calendars\")]");
	By Submit_btn = By.cssSelector("[type= 'submit']");
	String dte = "2024-09-05";
	
	
	public void AccessCalender() {
		
		driver.navigate().to("https://practice-automation.com/calendars/");
		
	
	}
	
	
	
	public void clickCalender() {
		WebElement calInput = driver.findElement(By.id("g1065-selectorenteradate"));
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		WebElement dateValue = driver.findElement(By.xpath("//h4[contains(@id, 'contact-form')]"));
		//div[contains(@class,\"field-value\")]
		
		calInput.sendKeys(dte);
		driver.findElement(Submit_btn).click();
//		System.out.println(dateValue.getText());
//		Assert.assertEquals(dateValue.getText(), dte);
		
		
	}

}
