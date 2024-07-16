package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Iframes {
	
	WebDriver driver;
	
	public Iframes(WebDriver driver) {
		this.driver = driver;
	}
	
	


	
	
	public void AccessIframe() {
		
		driver.navigate().to("https://practice-automation.com/iframes");
		WebElement header = driver.findElement(By.cssSelector("[itemprop = \"headline\"]"));
//		driver.manage().window().maximize();
		Assert.assertEquals(header.getText(), "Iframes");
					
	}
	
	By login_btn = By.xpath("//button[contains(text(), \"Login\")]");
	
	By docu_btn = By.xpath("(//span[contains(text(), \"Documentation\")])");
	
	By docu_link = By.cssSelector("[href=\"/documentation\"]");
	
	public void frameImplementation(int frame) {
		
			if (frame == 0) {
				driver.switchTo().frame(frame);
				driver.findElement(login_btn).click();
			} else if (frame == 1) {
				driver.switchTo().frame(frame);
				driver.findElement(docu_link).click();
			}else {
				System.out.println("no page");
			}
		

	
		
	}
	
	public void frameTwoImplementaion() {
		driver.findElement(docu_btn).click();
	
		
	}
	
//	By firstFrame= By.id("frame2");
	
	public void frame1() {
		try {
			WebElement firstFrame = driver.findElement(By.id("frame2"));
			driver.switchTo().frame(firstFrame);
			Thread.sleep(2000);
//			frameOneImplementation();
			driver.switchTo().defaultContent();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	
	public void frame2() {
		try {
			WebElement secondFrame = driver.findElement(By.id("frame1"));
			driver.switchTo().frame(secondFrame);
			Thread.sleep(2000);
			frameTwoImplementaion();
			driver.switchTo().defaultContent();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
