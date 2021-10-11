package bookMyTrip.bookTickets.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import bookMyTrip.bookTickets.utils.Browser;

public class Base {
	public static WebDriver driver;

	@BeforeTest
	public static void invokeBrowser() throws InterruptedException {
		Browser.invokeBrowser();
	}

	@AfterTest
	public static void closeBrowser() {

		driver.quit();
	}

}
