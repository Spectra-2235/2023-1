package Scripts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Poms.AmazonHome;

public class Sesion5 {

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
			AmazonHome gp = new AmazonHome(driver);
					Thread.sleep(3000);
					gp.typeOnSearchBar("Amazon");
					Thread.sleep(1000);
					gp.clickFirstResult();
					gp.typeOnSearchBar2("Celulares");
					Thread.sleep(1000);
					gp.clickSamsung();
					Thread.sleep(1000);
					gp.clickmenoramayor();
					Thread.sleep(1000);
					gp.click2();
					Thread.sleep(1000);
					gp.android();
					Thread.sleep(1000);
					gp.menor();
					
		}
		
		@After
		public void teardown() {
			
			driver.quit();
		}
		
	}

