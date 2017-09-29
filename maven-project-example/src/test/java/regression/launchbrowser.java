package regression;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class launchbrowser {
	@Test
	public void launch(){
		
		HtmlUnitDriver driver= new HtmlUnitDriver();
		driver.get("https://www.facebook.com/login/");
		
		System.out.println(driver.getTitle());
		
		
		driver.quit();
		
		
	}

}
