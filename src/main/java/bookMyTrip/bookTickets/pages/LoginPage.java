package bookMyTrip.bookTickets.pages;

import bookMyTrip.bookTickets.base.Base;
import bookMyTrip.bookTickets.utils.CommonMethods;

public class LoginPage extends Base{
	public static String Login="//div[@class='page-section sticky-scroll topSection appendBottom40']";
	public static String loginOption="//div[@class='login__card makeFlex hrtlCenter cursorPointer appendBottom10']";
	public static String userName="//input[@id='username']";
	public static String Continue1="//button[@class='capText font16']";
	public static String password="//input[@id='password']";
	public static String LoginButton="//button[@class='capText font16']";
	public static String popup1="//span[@class='crossIcon popupSprite popupCrossIcon']";
	
	public static void loginPage0() throws Exception	
	{
		CommonMethods.validatePage("xpath", Login, "Login");
		CommonMethods.findAndClick("xpath",loginOption, "loginOption");
		CommonMethods.findAndClick("xpath", userName,"Username" );
		CommonMethods.findAndSetValue("xpath", userName,"bonciyakuruvila@gmail.com", "Username");
		CommonMethods.findAndClick("xpath", Continue1, "Continue1");
		CommonMethods.findAndClick("xpath",password,"password" );
		CommonMethods.findAndSetValue("xpath", password,"Test@12345","password");
		CommonMethods.findAndClick("xpath",LoginButton,"LoginButton");
		CommonMethods.findAndClick("xpath",popup1,"popup1");
	}
	
}
