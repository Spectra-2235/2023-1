package Poms;

import org.openqa.selenium.WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
public class GooglePage {

	WebDriver driver;
	String searchBarId = "APjFqb";
	String firstResult="//h3[text()='Nintendo - Wikipedia']";
	String searchBarId2 ="LC20lb MBeuO DKV0Md";
	String titulo="mw-page-title-main";
	String resultsClass = "//h3[@class='LC20lb MBeuO DKV0Md']";
	String resultsParagraphs = "//*[@id=\"mw-content-text\"]/div[1]/p";
	String Message = "//*[@id=\"demo\"]";
	String SResult="//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/a/h3";

	public GooglePage(WebDriver driver) {
		super();
		this.driver = driver;
	}



	public void typeOnSearchBar(String value) {

		WebElement searchBar = driver.findElement(By.id(searchBarId));
		searchBar.sendKeys(value);
		searchBar.sendKeys(Keys.ENTER);
	}
	
	public void clickFirstResult() {
		WebElement fr=driver.findElement(By.xpath(firstResult));
		fr.click();
	}
	
	
	public void printFirstResult() {
		WebElement fr=driver.findElement(By.xpath(firstResult));
		System.out.print(fr.getText());
		
	}
	
	public void clickSResult() {
		WebElement fr=driver.findElement(By.xpath(SResult));
		fr.click();
	}
	
	public void printSResult() {
		WebElement fr=driver.findElement(By.xpath(SResult));
		System.out.print(fr.getText());
		
	}
	
	public void clickSecondResult() {
		WebElement fr=driver.findElement(By.xpath(firstResult));
		fr.click();
	}
	
	public void printSecondResult() {
		WebElement searchBar2 = driver.findElement(By.className(titulo));
		System.out.print(searchBar2.getText());
	}

	public void printTitle() {
		System.out.println(driver.getTitle());
	}
	
	public void printResults() {
		List <WebElement> list = driver .findElements(By.xpath(resultsClass));
		for(WebElement element: list) {
			System.out.println(element.getText());
		}
	}
	
	public void printParagraphs() {
	    List<WebElement> list = driver.findElements(By.xpath(resultsParagraphs));
	    int counter = 0;
	    for (WebElement element : list) {
	        System.out.println(element.getText());
	        counter++;
	        if (counter >= 4) {
	            break;
	        }
	    }
	}

	public void clickResultById(int i) {
		WebElement fr = driver .findElement(By.xpath(Message));
		fr.click();
		
	}
	
	public void printMessage() {
		WebElement fr = driver .findElement(By.xpath(Message));
		System.out.println(fr.getText());
	}
}


