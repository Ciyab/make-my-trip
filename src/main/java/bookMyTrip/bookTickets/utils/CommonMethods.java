package bookMyTrip.bookTickets.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import bookMyTrip.bookTickets.base.Base;

public class CommonMethods extends Base {
	
public static void findAndClick(String locator, String locatorValue,String log) throws Exception {
		
		WebElement element = null;
	
	WebDriverWait wait = new WebDriverWait(driver, 40);
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorValue))).isDisplayed();
	 try
	 {
	if (locator.equalsIgnoreCase("xpath")) {
		element = driver.findElement(By.xpath(locatorValue));
	} else if (locator.equalsIgnoreCase("id")) {
		element = driver.findElement(By.id(locatorValue));
	} 
	else
	{
		log="Selected locator is invalid";
	}
	wait.until(ExpectedConditions.elementToBeClickable(element));
	element.click();
	System.out.println(log+"  was clicked Successfully");
	}
	catch(Exception e)
	{
		System.err.println(log+"  wasn't clicked");
		System.out.println(e);
		throw new Exception();
		
	}
}
public static void findAndSetValue(String locator, String locatorValue, String val,String log) throws Exception {
	WebElement element = null;
	WebDriverWait wait = new WebDriverWait(driver, 40);
	try
	{
	if (locator.equalsIgnoreCase("xpath")) {
		element = driver.findElement(By.xpath(locatorValue));
	} else if (locator.equalsIgnoreCase("id")) {
		element = driver.findElement(By.id(locatorValue));
	}else
	{
		log="Selected locator is invalid";
	}
	wait.until(ExpectedConditions.elementToBeClickable(element));
	element.clear();
	element.sendKeys(val);
	System.out.println(val+"  was entered as "+log);
	
	}
	catch(Exception e)
	{
		System.err.println("value for"+ log + "  was not entered");	
		throw new Exception();
	}
}
public static void scroll_less()
{
	        JavascriptExecutor jse = (JavascriptExecutor)driver; jse.executeScript("scroll(0, 250)");
	}
public static void select(String value,String log) {
	try {
	WebElement gender =driver.findElement(By.xpath("//div[@class='GenderDropDownContainer']"));
	Select s = new Select(gender);
	s.selectByValue(value);
	System.out.println(log+"  was selected successfully");
	}
	catch(Exception e) {
		System.err.println(log+ "  was not selected ");
	}
}
public static void validatePage(String locator,String locatorValue,String log) throws Exception
{
WebElement element = null;

WebDriverWait wait = new WebDriverWait(driver, 40);
 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorValue))).isDisplayed();
 try
 {
if (locator.equalsIgnoreCase("xpath")) {
	element = driver.findElement(By.xpath(locatorValue));
} else if (locator.equalsIgnoreCase("id")) {
	element = driver.findElement(By.id(locatorValue));
} 
else
{
	log="Selected locator is invalid";
}

 System.out.println(log+"Page...................! ");
}
catch(Exception e)
{
	System.err.println("is not "+log+"page!!!!!!!!!!");
	System.out.println(e);
	throw new Exception();
	
}
}
}
