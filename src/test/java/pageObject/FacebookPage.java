package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.wdm.WebDriverManager;
import stepDefination.FacebookStepDef;

public class FacebookPage extends FacebookStepDef {

	public  static WebDriver localDriver;

	public FacebookPage(WebDriver remoteDriver) {

		localDriver=remoteDriver;
		PageFactory.initElements(remoteDriver,this);
	}

@FindBy (xpath="//button[@fdprocessedid='5hpllr']")
WebElement closePopup;
	
	
	
	


	public void launchUrl() throws Exception {
		WebDriverManager.chromedriver().setup();
		localDriver=new ChromeDriver();
		localDriver.get("https://www.flipkart.com/");

	}

	public  void login() throws Exception {
		localDriver.manage().window().maximize();
		
		String title=localDriver.getTitle();
		System.out.println("current title will be "+title);
		closePopup.click();
		
	}

	public void validation() {
		String title=localDriver.getTitle();
		System.out.println("current title will be "+title);
		localDriver.quit();
	}
}
