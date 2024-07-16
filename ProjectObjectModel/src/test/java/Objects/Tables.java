package Objects;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Tables {
	
	WebDriver driver;
	
	public Tables(WebDriver driver) {
		
		this.driver = driver;
		
	}
	
//	By tablebutto = By.cssSelector("a[href='https://practice-automation.com/tables/']");

//	By tablebutton - By.Xpath("(//div[contains(@class,\"is-style-shadow\")])[3]");
	
	By tablebutton = By.xpath("(//div[contains(@class,\"is-style-shadow\")])[3]");
//	By price = By.xpath("//td[text() = \"Laptop\"]/following-sibling::td");
	By next = By.xpath("//a[@id = 'tablepress-1_next' ]");
	By search = By.cssSelector("input[type =\"search\"]");
	By rows = By.xpath("//tr[contains(@class , 'row' )]");
	
	
	
	
	public void AccessTable() {
		
		driver.navigate().to("https://practice-automation.com/tables/");

		
		
	}
	
	public void ItemPrice() {
		WebElement price = driver.findElement(By.xpath("//td[text() =  \"Laptop\" ]/following-sibling::td"));
		Assert.assertEquals(price.getText(), "$1200.00");
		
		
	}
	
	public void paginate() {
		try {
			Thread.sleep(2000);
			driver.findElement(next).click();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
	
	public void searchAndAdd(String country) {
		WebElement result = driver.findElement(By.xpath("//td[text() =  '2' ]/following-sibling::td"));
		driver.findElement(search).sendKeys(country);
		Assert.assertEquals(result.getText(), country);
		driver.findElement(search).clear();
//		driver.findElement(search).click();
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
	}

}
