package bookMyTrip.bookTickets.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import bookMyTrip.bookTickets.utils.Browser;

/**
 * 
 * @author Bonciya 
 *
 */
public class Base {
	public static WebDriver driver;

	@BeforeClass
	public static void invokeBrowser() throws InterruptedException {
		Browser.invokeBrowser();
	}

	@AfterClass
	public static void closeBrowser() {

		driver.quit();
	}

}
