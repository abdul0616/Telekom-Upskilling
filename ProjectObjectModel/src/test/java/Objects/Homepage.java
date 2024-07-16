package Objects;

import org.openqa.selenium.WebDriver;

public class Homepage {
	WebDriver driver ;
	
	public Homepage(WebDriver driver){
		this.driver = driver;
	}
	
	public void accessHome() throws InterruptedException {
		driver.get("https://practice-automation.com/");
		
	}

}
