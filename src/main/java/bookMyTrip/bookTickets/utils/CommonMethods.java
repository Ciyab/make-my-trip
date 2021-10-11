package bookMyTrip.bookTickets.utils;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import bookMyTrip.bookTickets.base.Base;

/**
 * 
 * @author Bonciya
 *
 */
public class CommonMethods extends Base {
/**
 * This method is used to click
 * @param locator
 * @param locatorValue
 * @param log
 * @throws Exception
 */
	public static void findAndClick(String locator, String locatorValue, String log) throws Exception {

		WebElement element = null;

		WebDriverWait wait = new WebDriverWait(driver, 40);

		try {
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorValue))).isDisplayed();
			if (locator.equalsIgnoreCase("xpath")) {
				element = driver.findElement(By.xpath(locatorValue));
			} else if (locator.equalsIgnoreCase("id")) {
				element = driver.findElement(By.id(locatorValue));
			} else {
				log = "Selected locator is invalid";
			}
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.click();
			System.out.println(log + "  was clicked Successfully");
		} catch (Exception e) {
			System.err.println(log + "  wasn't clicked");
			System.out.println(e);
			iTakeSnap();
			throw new Exception();

		}
	}
/**
 * This method is used to enter the value
 * @param locator
 * @param locatorValue
 * @param val
 * @param log
 * @throws Exception
 */
	public static void findAndSetValue(String locator, String locatorValue, String val, String log) throws Exception {
		WebElement element = null;
		WebDriverWait wait = new WebDriverWait(driver, 40);
		try {
			if (locator.equalsIgnoreCase("xpath")) {
				element = driver.findElement(By.xpath(locatorValue));
			} else if (locator.equalsIgnoreCase("id")) {
				element = driver.findElement(By.id(locatorValue));
			} else {
				log = "Selected locator is invalid";
			}
			wait.until(ExpectedConditions.elementToBeClickable(element));
			element.clear();
			element.sendKeys(val);
			System.out.println(val + "  was entered as " + log);

		} catch (Exception e) {
			System.err.println("value for" + log + "  was not entered");
			iTakeSnap();
			throw new Exception();
		}
	}

	public static void scroll_less() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scroll(0, 250)");
	}
/**
 * This method is used to validate each page
 * @param locator
 * @param locatorValue
 * @param log
 * @throws Exception
 */
	public static void validatePage(String locator, String locatorValue, String log) throws Exception {
		WebElement element = null;

		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorValue))).isDisplayed();
		try {
			if (locator.equalsIgnoreCase("xpath")) {
				element = driver.findElement(By.xpath(locatorValue));
			} else if (locator.equalsIgnoreCase("id")) {
				element = driver.findElement(By.id(locatorValue));
			} else {
				log = "Selected locator is invalid";
			}

			System.out.println(log + "Page...................! ");
		} catch (Exception e) {
			System.err.println("is not " + log + "page!!!!!!!!!!");
			System.out.println(e);
			iTakeSnap();
			throw new Exception();

		}
	}

	/**
	 * This method is used to take Screenshot
	 * 
	 * @return
	 */
	public static long iTakeSnap() {
		long number = (long) Math.floor(Math.random() * 900000000L) + 10000000L;
		try {
			FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),
					new File(System.getProperty("user.dir") + "/screenshot/" + number + ".jpg"));
		} catch (Exception e) {
			System.err.println(e);
			System.err.println("Kindly verify the screenshot");
		}
		return number;
	}
}
