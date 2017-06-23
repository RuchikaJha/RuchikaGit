import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Google {

	private WebDriver driver;
	private String baseURL;
	
	public Google(WebDriver driver)
	{
		this.driver = driver;
		baseURL="https://www.google.com/";
		driver.get(baseURL);
		System.out.println(driver.getTitle());
		if(!driver.getTitle().equals("Google")) {
			throw new WrongPageException("Incorrect Page for Google Home Page for Temperature Converter");
		}
	}

	public TemperatureConverterPage goToTemperatureConversionPage(){
		
		driver.findElement(By.id("lst-ib")).clear();
		driver.findElement(By.id("lst-ib")).sendKeys("from farenheit to celcius");
		driver.findElement(By.id("fZl")).click();
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));
		return new TemperatureConverterPage(driver);
	
	
	}

}
