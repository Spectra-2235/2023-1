package Scripts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Poms.GooglePage;

public class Sesion1 {
	private WebDriver driver; 

	@Before
	public void setUp() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver(options);	}
	
	@Test
	public void test() throws InterruptedException {
		driver.get("https:/www.google.com");
		GooglePage gp = new GooglePage(driver);
				Thread.sleep(3000);
				gp.typeOnSearchBar("Pokemon");
				Thread.sleep(1000);
				//gp.printFirstResult();
				//gp.clickFirstResult();
				gp.clickSResult();
				gp.printSResult();
	}
	
	@After
	public void teardown() {
		
		driver.quit();
	}
}