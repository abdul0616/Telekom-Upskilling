package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class FileDownload {
	
	WebDriver driver;
	
	public FileDownload(WebDriver driver) {
		this.driver = driver;
	}
	
	

	WebElement header = driver.findElement(By.cssSelector("[itemprop = \"headline\"]"));
	
	
	public void DownloadPage() {
		
		driver.navigate().to("https://practice-automation.com/file-download");
		Assert.assertEquals(header.getText(), "File Download");
		
	}
	
	By d_btn = By.cssSelector("[href=\"#\"]");
	
	public void Download() {
		driver.findElement(d_btn).click();
		
		
	}

}
