package exercise5Base;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import exercise5Pages.CruiseHomePage;
import io.github.bonigarcia.wdm.WebDriverManager;

/*Exercise 5
Cruises discount is displayed
Precondition : The user is not logged in.

Steps:
1. Go to Cruises page.
2. In the Going to drop down select “Europe”
3. In the “Departure month” dropdown select a month. Do the Search
4. Verify the Filter information selected before appears in the refine results section below each
dropdown.
5. In the “Cruise Length” filter, select “10-14 nights” (Verify this information is displayed below
the dropdown).
6. Verify that result page shows cruises with and without discounts
7. Select the cruise option with more discount, pressing the show dates button first
8. Validate that cruise information is displayed for the selected one*/

public class CruiseBaseClass {
	
	//attributes
	protected static WebDriver driver;
	protected CruiseHomePage cruiseHomePage;
	
	
	public CruiseBaseClass() {
		PageFactory.initElements(driver,this);
	}//end constructor
	
	
	@BeforeTest
	public void setup() {
		Scanner entrada= new Scanner(System.in);
		System.out.println("Choose a browser, please:");
		System.out.println("1-Chrome");
		System.out.println("2-FirFox");
		System.out.println("3-Edge");
		int option= entrada.nextInt();
		switch (option) { 
		 case 1:WebDriverManager.chromedriver().setup();
		     driver=new ChromeDriver();
			 break; 
		 case 2:WebDriverManager.firefoxdriver().setup();
		     driver= new FirefoxDriver();
			 break;	 
		 case 3:WebDriverManager.edgedriver().setup();
			 driver= new EdgeDriver();
			 break;
		 }//end switch
		
		driver.manage().window().maximize();
		driver.get("https://www.travelocity.com/");
		cruiseHomePage= new CruiseHomePage();
	}//end setup
	
	

	//constructor
	
    
/*	@AfterTest
	public void tearDown() {
		driver.close();
	}// end tearDown*/
	
}//end BaseClass
