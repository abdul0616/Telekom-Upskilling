package Objects;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Modals {
	
	WebDriver driver;
	
	By simpleModal = By.id("simpleModal");
	By simple_btn = By.xpath("(//button[contains(@class,\"pum-close\")])[2]");
	By form_btn = By.xpath("//button[contains(@class, \"pum-close\")][1]");
	By formModal = By.id("formModal");
	By name = By.id("g1051-name");
	By email= By.id("g1051-email");
	By message = By.id("contact-form-comment-g1051-message");
	By sub_btn = By.className("pushbutton-wide");
	
	
	public Modals(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void AccessModals() {
		driver.navigate().to("https://practice-automation.com/modals/");
		WebElement header = driver.findElement(By.cssSelector("[itemprop = \"headline\"]"));
		Assert.assertEquals(header.getText(), "Modals");
		
	}
	

	
//	public void close() {
//		driver.findElement(Close_btn).click();
//		
//	}
//	
	
	public void SimpleModal() {
		
		try {
			driver.findElement(simpleModal).click();
			Thread.sleep(2000);
			Assert.assertEquals(driver.findElement(By.id("pum_popup_title_1318")).getText(), "Simple Modal");
			driver.findElement(simple_btn).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		assert.assertEquals(driver.findElement(By.id("pum_popup_title_1318")).getText(), "Simple Modal");
		
	}
	
	public void formModal() {
		try {
			Thread.sleep(200);
			driver.findElement(formModal).click();
			driver.findElement(name).sendKeys("userOne");
			driver.findElement(email).sendKeys("UserOne@gmail.com");
			driver.findElement(message).sendKeys("lorem is the nw tin");
			driver.findElement(form_btn).click();
//			close();
//			driver.findElement(sub_btn).click();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}
	
	
	
	

	
	

}
