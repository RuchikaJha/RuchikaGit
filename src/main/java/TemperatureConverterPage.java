import static org.junit.Assert.*;

import java.io.ObjectInputStream.GetField;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import junit.framework.Assert;

public class TemperatureConverterPage {

	private WebDriver driver;
	public TemperatureConverterPage(WebDriver driver)
	{
		this.driver = driver;
		System.out.println(driver.getTitle());
		if(!driver.getTitle().equals("from farenheit to celcius")) {
			throw new WrongPageException("Incorrect Page for Google Home Page for Temperature Converter");
		}
	}
	
	public void inputFahrenheit (double valueoffahrenheit) {
		String s = Double.toString(valueoffahrenheit);
		driver.findElement(By.id("_Aif")).clear();
		driver.findElement(By.id("_Aif")).sendKeys(s);
	}

	public String actualResult() {

		String valueofCelcius = driver.findElement(By.xpath("//*[@id='_Cif']/input")).getAttribute("value");
		System.out.println(valueofCelcius);
		return valueofCelcius;
		
	}
	
}

