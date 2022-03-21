package exercise5TestCases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import exercise5Base.CruiseBaseClass;
import exercise5Pages.CruiseInquirePage;
import exercise5Pages.CruisePricePage;

public class CruisePricePageTest extends CruiseBaseClass{
	
private	CruisePricePage cruisePricePage;
private	CruiseInquirePage cruiseIncuirePage;
private WebDriverWait wait;

    @Test(priority=5,description="Verifying the price election")
	public void chosenCruisePriceTest() {
    wait= new WebDriverWait(driver,10);	
    CruisePricePage cruisePricePage= new CruisePricePage();
    wait.until(ExpectedConditions.visibilityOf(cruisePricePage.getPriceBtn()));
	cruiseIncuirePage =cruisePricePage.clicKOnrpriceBtn();
	String actualURL=driver.getCurrentUrl();
	String expectedURL="https://www.travelocity.com/Cruise-Search?adultCount=2&destination=europe&earliest-departure-date=2022-02-25&latest-departure-date=2022-03-15&max-length=14&min-length=10&sort-by=price";
    //System.out.println("URL real2 "+actualURL);
	Assert.assertEquals(actualURL, expectedURL);
   }//end searchButtonTest
	
    /*Currently, there are not the options to do items 6,7 and 8, but
	 * I will go to click "Price"
	 * and the web page will display all the options available. We must click
	 * the first option(the first Cruise)in "Inquire"button of the cheaper cruise
	 * , that it is the cheaper option*/

}//end CruisePricePageTest

