package mainmethod;

import org.openqa.selenium.WebDriver;

import com.businesscomponents.Selectoperations;
import com.drivermethod.Driverobjects;

public class Mainrunner {
		
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Driverobjects dos = new Driverobjects();
		WebDriver driver  = dos.initializeDriver();
		
		Selectoperations so = new Selectoperations();
		so.bookTicket(driver);
		
		
	}

}
