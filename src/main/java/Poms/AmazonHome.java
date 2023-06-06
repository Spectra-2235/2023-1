package Poms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class AmazonHome {

	
   public WebDriver driver;
	String searchBarId = "APjFqb";
	String FirstResult= "//h3[text()='Amazon.com.mx: Precios bajos - Envío rápido - Millones de ...']";
	String searchBarId2 = "twotabsearchtextbox";
	String secondResult="celulares";
	String Samsung="//*[@id=\'p_89/SAMSUNG']/span/a/div";
	String menoramayor="//*[@id=\"search\"]/span/div/h1/div/div[2]/div/div/form/span";
	String menorMayor= "//*[@id=\"s-result-sort-select_1\"]";
	String android11="//*[@id=\"p_n_feature_twenty-two_browse-bin/36756470011\"]/span/a/div";
	String s="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div[2]/div[3]/div/a/span/span[2]/span[2]";
	String n="//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div[2]/div[1]/h2/a/span";
	public AmazonHome() {
		
		WebDriver driver;	
		
	}

	public AmazonHome(WebDriver driver) {
		super();
		this.driver=driver;
	}
	public void typeOnSearchBar(String value) {

		WebElement searchBar = driver.findElement(By.id(searchBarId));
		searchBar.sendKeys(value);
		searchBar.sendKeys(Keys.ENTER);
	}
	
	public void clickFirstResult() {
		WebElement fr=driver.findElement(By.xpath(FirstResult));
		fr.click();
	}
	public void printFirstResult() {
		WebElement fr=driver.findElement(By.xpath(FirstResult));
		System.out.print(fr.getText());
		
	}
	public void typeOnSearchBar2(String value) {

		WebElement searchBar = driver.findElement(By.id(searchBarId2));
		searchBar.sendKeys(value);
		searchBar.sendKeys(Keys.ENTER);
	}
	public void clicksecondResult() {
		WebElement fr=driver.findElement(By.xpath(secondResult));
		fr.click();
	}
	public void clickSamsung() {
		WebElement samsungButton = driver.findElement(By.xpath(Samsung));
		samsungButton.click();
	}

	
	public void clickmenoramayor() {
		WebElement fr=driver.findElement(By.xpath(menoramayor));
		fr.click();
		
	}
	public void click2() {
		WebElement r=driver.findElement(By.xpath(menorMayor));
		r.click();
	}
	
	 public void android() {
		 WebElement r=driver.findElement(By.xpath(android11));
			r.click();
	 }
	 
	public void menor() {
		WebElement r=driver.findElement(By.xpath(n));
		System.out.println(r.getText());
		WebElement fr=driver.findElement(By.xpath(s));
		System.out.print(fr.getText());
	}
	 
}
	 


	
	


	


