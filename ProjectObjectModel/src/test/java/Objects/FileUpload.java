package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class FileUpload {
	
	WebDriver driver;
	
	public FileUpload(WebDriver driver) {
		this.driver = driver;
	}
	
	

	By upload_btn = By.name("file-941");
	By uploading = By.cssSelector("input[value=\"Upload\"]");
	String fail = "One or more fields have an error. Please check and try again.";
	String success = "Thank you for your message. It has been sent.";
//	By fail_message = ;
	
	
	
	public void UploadPage() {
		
		driver.navigate().to("https://practice-automation.com/file-upload");
		
		
	}
	
	public void Upload() {
		WebElement Message_container = driver.findElement(By.xpath("//div[contains(@class,\"response-output\")]"));
		try {
			Thread.sleep(3000);
			driver.findElement(upload_btn).sendKeys("C:\\Users\\UsmanAbdul-matin\\Pictures\\Capture.png");
			driver.findElement(uploading).click();
			Thread.sleep(2000);
			Assert.assertEquals(Message_container.getText(), success);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
