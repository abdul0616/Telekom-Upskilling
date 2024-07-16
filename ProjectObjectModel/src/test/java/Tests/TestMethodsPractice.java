package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



import Objects.Formpage;
import Objects.Iframes;
import Objects.Modals;
import Objects.Popups;
import Objects.Sliders;
import Objects.Calenders;
import Objects.FileDownload;
import Objects.FileUpload;
import Objects.Tables;
import Objects.WindowsOperations;

public class TestMethodsPractice {
	
	WebDriver driver ;
	
	@BeforeTest
	public void beforeTest() {
		
		driver = new ChromeDriver();
		
		
		driver.get("https://practice-automation.com/");
		driver.manage().window().maximize();
	}
	
	
//	
	public void Navback() {
	Formpage navback = new Formpage(driver);
	navback.Navback();
}
	
	@Test(priority = 0)
	public void Accessform() {
		Formpage form = new Formpage(driver);
		form.accessForm();
		form.FillForm();
		Navback();
		
	}
//	
////	POP UPS
//	
	@Test(priority = 1)
	public void Popups() {
		Popups pop = new Popups(driver);
		pop.Accesspop();
		pop.AlertPop();
		pop.confirmPop();
		pop.PromptPop();
		Navback();
		
	
	}
//	
//	
//	
//////Calenders
   @Test(priority = 2)
   public void Calenders() {
	Calenders cal = new Calenders(driver);
	
	try {
		cal.AccessCalender();
		Thread.sleep(2000);
	cal.clickCalender();
	
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	Navback();
	
}
////	
////
////	
////	
////	//TABLES
	@Test(priority = 3)
	public void AccessTable() {
		Tables table = new Tables(driver);
		table.AccessTable();
//		table.ItemPrice();
//		table.paginate();
		table.searchAndAdd("China");
		
		
		
		Navback();
		
	}
////	
////	
//	
    @Test(priority = 4)
	public void AccessModal() {
		Modals modal = new Modals(driver);
		modal.AccessModals();
		modal.SimpleModal();
		modal.formModal();
		Navback();
	}
//	
//	
//	
	@Test(priority = 5)
	public void AccessSlider() {
		Sliders slider = new Sliders(driver);
		slider.AccessSliders();
		slider.Sliding();
		Navback();
	}
//	
//	
//	
	@Test(priority = 6)
	public void AccessWindow() {
		WindowsOperations window = new WindowsOperations(driver);
		window.AccessWindow();
		window.NewTab();
		window.ReplaceWindow();
		window.NewWindow();
		Navback();
	}
	
//	
//	
	@Test(priority = 7)
	public void AccessIframe() {
		Iframes iframe = new Iframes(driver);
		iframe.AccessIframe();
		iframe.frameImplementation(0);
//		iframe.frame1();
//		iframe.frame2();
		Navback();
	}
//	
	@Test(priority = 8)
	public void Downloads() {
		FileDownload download = new FileDownload(driver);
		download.DownloadPage();
		download.Download();
		Navback();
	}
//	
//	
	@Test(priority = 9)
	public void Uploads() {
		FileUpload upload = new FileUpload(driver);
		upload.UploadPage();
		upload.Upload();
		Navback();
	}

//	
//
//
//	
//	
//	


		
//   }
		
	}
	



