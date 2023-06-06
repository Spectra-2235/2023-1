package Poms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TAP {
	WebDriver driver;
	String alertButtonXpath = "//button[text()='Click Me']";
	String filexXpath = "//select[@name='files']";
	String speedXpath = "//select[@name='speed']";
	String selectXpath="//select[@name='number']";
	String botonwiki="//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[1]/a/img";
	String ATP="//*[@id=\"rso\"]/div[1]/div/div/div[1]/div/a/h3";
public TAP(WebDriver driver) {
	
	super();
	this.driver = driver;

}

public void clickentrar() {
	
	WebElement button = this.driver.findElement(By.xpath(this.ATP));
	button.click();
	
}
public void clickAlertButton() {
	
	WebElement button = this.driver.findElement(By.xpath(this.alertButtonXpath));
	button.click();
}

public void acceptAlert() {
	
	this.driver.switchTo().alert().accept();
}

public String selectCheckBoxByValue(String option) {
	String value ="";
	Select cb = new Select(this.driver.findElement (By.xpath(filexXpath)));
	List<WebElement> options = cb.getOptions();
	
	cb.selectByValue(option);
	return value;
}
 
public String selectCheckBoxByText(String option) {
	String value = "";
	Select cb = new Select(this.driver.findElement(By.xpath(speedXpath)));
	cb.selectByVisibleText(option);
	return value;
}
public String SelectCheckboxbyoption(String option) {
	String value ="";
	Select cb = new Select(this.driver.findElement(By.xpath(selectXpath)));
	cb.selectByVisibleText(option);
	return value;
}
	
public String selectCheckBoxByIndex(int option) {
	String value="";
	Select cb=new Select(this.driver.findElement(By.xpath(speedXpath)));
	
	return value;
}

public void clickWikipediaIcon() {
	WebElement wiki = this.driver.findElement(By.xpath(this.botonwiki));
	wiki.click();
	
}
}
