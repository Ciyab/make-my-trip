package bookMyTrip.bookTickets.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import bookMyTrip.bookTickets.base.Base;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser extends Base{
	public static void configBrowser(String browser) {

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else {
			System.err.println("please enter correct browser");
		}
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	public static void launchUrl(String url) {
		driver.get(url);

	}
	public static void invokeBrowser() throws InterruptedException {
		configBrowser("chrome");
		launchUrl("https://www.makemytrip.com/bus-tickets/");
		Thread.sleep(2000);
	}
}
