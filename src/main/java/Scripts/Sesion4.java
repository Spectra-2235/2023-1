package Scripts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Poms.GooglePage;
import Poms.TAP;

public class Sesion4 {

	
	private WebDriver driver;
	
	@Before
	public void setUp() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		driver = new ChromeDriver(options);
		
		
		}
	
	@Test
	public void test() throws InterruptedException {
		driver.get("https:/www.google.com");
		GooglePage gp = new GooglePage(driver);
		TAP tap = new TAP(driver);
		Thread.sleep(3000);
		//Busqueda en google
		gp.typeOnSearchBar("automation Testing practice");
		//Click en primer resultado
		tap.clickentrar();
		//Selecciona DOC file
		String value = tap.selectCheckBoxByValue("3");
		System.out.println(value);
		Thread.sleep(1000);
		//
		String value2 = tap.selectCheckBoxByText("Medium");
		Thread.sleep(1000);
		String value3 = tap.SelectCheckboxbyoption("2");
		
		
	}
	@After
	public void teardown() {
		
		driver.quit();
	}

}