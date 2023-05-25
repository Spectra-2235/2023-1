package Poms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
public class AmazonHome {

	
   public WebDriver driver;
	String searchBarId = "APjFqb";
	String FirstResult= "//h3[text()='Amazon.com.mx: Precios bajos - Envío rápido - Millones de ...']";
	String searchBarId2 = "twotabsearchtextbox";
	String secondResult="celulares";
	String Samsung="//*[@id=\'p_89/SAMSUNG']/span/a/div";
	String MenorCelular="//span[@class='a-offscreen']";
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

	 public void Menor() {
		  List<WebElement> priceElements = driver.findElements(By.xpath(MenorCelular));
	        double minPrice = Double.MAX_VALUE;
	        WebElement cheapestPhoneElement = null;
	        
	        for (WebElement priceElement : priceElements) {
	            String priceText = priceElement.getText().replaceAll("[^\\d.]", "");
	            if (!priceText.isEmpty()) {
	                double price = Double.parseDouble(priceText);
	                if (price < minPrice) {
	                    minPrice = price;
	                    cheapestPhoneElement = priceElement;
	                    
	                }
	            }
	        }
	        if (cheapestPhoneElement != null) {
	            System.out.println("El teléfono más barato es: " + cheapestPhoneElement.getText());
	        } else {
	            System.out.println("No se encontró ningún teléfono.");
	        }
	    
	 }
}
	 
	 
	 

	
	


	


