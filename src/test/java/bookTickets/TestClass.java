package bookTickets;

import org.testng.annotations.Test;

import bookMyTrip.bookTickets.base.Base;
import bookMyTrip.bookTickets.pages.BookMyTripPage;
import bookMyTrip.bookTickets.pages.BusBookingPage;
import bookMyTrip.bookTickets.pages.LoginPage;
import bookMyTrip.bookTickets.pages.Passenger_DetailsPage;

/**
 * 
 * @author Bonciya
 * 
 *This class contains the test Scenario.....
 */
/**
 */
public class TestClass extends Base {
	@Test
	public void makeMyTrip() throws Exception {
		LoginPage.loginPage0();
		BookMyTripPage.book1();
		BusBookingPage.busBooking();
		Passenger_DetailsPage.passengerDetails();
	}

}
