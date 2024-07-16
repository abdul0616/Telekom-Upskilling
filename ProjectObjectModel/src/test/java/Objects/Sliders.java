package Objects;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Sliders {
	
WebDriver driver;
	
	public Sliders(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	
	
//	By Calenderbutton = By.xpath("//a[contains(text(), \"Calendars\")]");
	
	public void AccessSliders() {
		
		driver.navigate().to("https://practice-automation.com/slider/");
		
	
	}
	
//	By slide = By.id("slideMe");
	By side_value = By.id("value");
	
	public void Sliding() {
		try {
			Thread.sleep(2000);
			WebElement slide = driver.findElement(By.id("slideMe"));
			Actions action = new Actions(driver);
			action.moveToElement(slide, -290, 0).click().build().perform();
			Assert.assertEquals(driver.findElement(side_value).getText(), "29");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

}
