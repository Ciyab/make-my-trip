package bookMyTrip.bookTickets.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import bookMyTrip.bookTickets.base.Base;
import bookMyTrip.bookTickets.utils.CommonMethods;
/**
 * 
 * @author Bonciya
 *
 */
public class BusBookingPage extends Base{
	public static String BusSeat="(//a[@class='sc-jKJlTe bPClQZ'])[1]";
	public static String PickUp="(//li[@class='sc-cMljjf hISbyd'])[1]";
	public static String Drop="(//span[@class='makeFlex font12 column blackText'])[21]";
	public static String SeatNo="(//img[@class='seat-icon'])[3]";
	public static String BookSeat="//div[@class='cta-book-seats font16 capText makeFlex hrtlCenter vrtlCenter active']";
	public static String BusBooking="//span[@class='latoBlack font22 appendBottom6']";
	/**
	 * This method does operations in the busbooking page
	 * @throws Exception
	 */
	
public static void busBooking() throws Exception
{
	CommonMethods.validatePage("xpath", BusBooking,"BusBooking");
	CommonMethods.scroll_less();
	CommonMethods.findAndClick("xpath", BusSeat,"SelectSeat");
	CommonMethods.findAndClick("xpath", PickUp,"PickUp");
	CommonMethods.findAndClick("xpath",Drop,"Drop");
	CommonMethods.findAndClick("xpath", SeatNo, "SeatNo");
	CommonMethods.findAndClick("xpath",BookSeat,"BookSeat");
}
}
