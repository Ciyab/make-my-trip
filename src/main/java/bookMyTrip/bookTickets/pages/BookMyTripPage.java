package bookMyTrip.bookTickets.pages;

import bookMyTrip.bookTickets.base.Base;
import bookMyTrip.bookTickets.utils.CommonMethods;
/**
 * 
 * @author Bonciya
 *
 */
public class BookMyTripPage extends Base {
	public static String fromCity="//label[@class='lbl_input makeFlex column latoBold']";
	public static String fromCitySearch="(//span[@class='sr_city blackText'])[3]";
	public static String toCitySearch="(//span[@class='sr_city blackText'])[7]";
	public static String Date="(//div[@class='DayPicker-Day'])[2]";
	public static String SearchButton1="//button[@id='search_button']";
	public static String Bookmytrip="//label[@class='lbl_input makeFlex column latoBold']";
	
	/**
	 * This method does operations in bookmytrip page
	 * @throws Exception
	 */
	public static void book1() throws Exception	
	{
		CommonMethods.validatePage("xpath", Bookmytrip," Bookmytrip");
		CommonMethods.findAndClick("xpath", fromCity,"FromCity");
		CommonMethods.findAndClick("xpath", fromCitySearch,"fromCitySearch");
		CommonMethods.findAndClick("xpath",toCitySearch,"toCitySearch");
		CommonMethods.findAndClick("xpath",Date,"Date");
		CommonMethods.findAndClick("xpath",SearchButton1,"SearchButton1");
		Thread.sleep(1000);
	}
}