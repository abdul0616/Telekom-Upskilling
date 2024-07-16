package Objects;


import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;



public class Formpage {
	
	WebDriver driver;
	
	public Formpage(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
	
	
	
	By navhome = By.xpath("//a[text()= \"Home\"]");
	
	By Formbutton = By.xpath("//a[contains(text(), \"Form Fields\")]");
	
	public void Navback() {
		driver.findElement(navhome).click();
	}

//	WebElement title = (WebElement) By.cssSelector("h1[itemprop=\"headline\"]");
//	String title_text = title.getText();
	
	
	By name = By.id("name");
	By drink1 = By.id("drink1");
	By drink2 = By.id("drink2");
	By drink3 = By.id("drink3");
	
	By color = By.id("color4");
	
	
//	WebElement siblings = driver.findElement(By.id("siblings"));
	
	By email = By.id("email");
	By message = By.id("message");
	By button = By.xpath("//button[@data-cy = \"submit-btn\"]");
	By sub_btn = By.cssSelector("[data-cy = \"submit-btn\"]");
	By su_btn = By.cssSelector("[style = \"background-color:#00aaef\"]");
	
	
	
	


	
	
	
	
	public void accessForm() {
		
		driver.findElement(Formbutton).click();
		WebElement header = driver.findElement(By.cssSelector("[itemprop = \"headline\"]"));
		Assert.assertEquals(header.getText(), "Form Fields");
//		assert.assertEquals(title_text, "form");
	

		
	}
	
	

	public void FillForm() {
		try {
			driver.findElement(name).sendKeys("UserONe");
			
			driver.findElement(drink1).click();
			driver.findElement(drink2).click();
			driver.findElement(drink3).click();
			
//			Select option = new Select(siblings);
//			option.selectByVisibleText("Yes");
//			
			driver.findElement(email).sendKeys("Userone@gmail.com");
			driver.findElement(message).sendKeys("Lorem Ipsum is simply dummy text of the printing and "
					+ "typesetting industry. Lorem Ipsum has been the industry's standard dummy text "
					+ "ever since the 1500s, when an unknown printer took a galley of type and scrambled it"
					+ " to make a type specimen book. It has survived not only five centuries, but also the "
					+ "leap into electronic "
					+ "typesetting, remaining essentially unchanged. It was popularised in the 1960s with the "
					+ "release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop "
					+ "publishing software like "
					+ "Aldus PageMaker including versions of Lorem Ipsum");
			Thread.sleep(2000);
//			driver.findElement(su_btn).click();

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

}


//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("btn")));
//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//wait.until(ExpectedConditions.elementToBeClickable(element));
//((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
