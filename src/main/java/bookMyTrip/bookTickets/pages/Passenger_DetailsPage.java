package bookMyTrip.bookTickets.pages;

import bookMyTrip.bookTickets.base.Base;
import bookMyTrip.bookTickets.utils.CommonMethods;
/**
 * 
 * @author Bonciya
 *
 */
public class Passenger_DetailsPage extends Base {
	public static String PassengerName="//input[@id='fname']";
	public static String PassengerAge="//input[@id='age']";
	public static String PassengerGender="//div[@class='GenderDropDownContainer']";
	public static String PassengerGenderValue="(//li[@class=' removeOutline'])[2]";
	public static String PassengerPhoneNo="//input[@id='mobileNumber']";
	public static String SecureTrip="(//span[@class='sc-iyvyFf RZwmp'])[2]";
	public static String BookNow="//a[@class='paymentBtn whiteText latoBold font16 capText']";
	public static String PassengerDetails ="//span[@class='latoBlack']";
	/**
	 * This method is used to fill the details in passenger details page
	 * @throws Exception
	 */
	
	public static void passengerDetails() throws Exception
	{
		CommonMethods.validatePage("xpath", PassengerDetails," PassengerDetails");
		CommonMethods.findAndClick("xpath", PassengerName,"PassengerName");
		CommonMethods.findAndSetValue("xpath", PassengerName,"Testin","PassengerNameValue");
		CommonMethods.findAndClick("xpath", PassengerAge,"PassengerAge");
		CommonMethods.findAndSetValue("xpath", PassengerAge,"27","PassengerAgeValue");
		CommonMethods.findAndClick("xpath",PassengerGender,"PassengerGender");
    	CommonMethods.findAndClick("xpath",PassengerGenderValue,"PassengerGenderValue");
    	CommonMethods.findAndClick("xpath",PassengerPhoneNo,"PassengerPhoneNo");
    	CommonMethods.findAndSetValue("xpath",PassengerPhoneNo,"7027231212","PassengerPhoneNo");
    	CommonMethods.findAndClick("xpath",SecureTrip,"SecureTrip");
    	CommonMethods.findAndClick("xpath",BookNow,"BookNow");
}
}
