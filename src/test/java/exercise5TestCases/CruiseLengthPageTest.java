package exercise5TestCases;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import exercise5Base.CruiseBaseClass;
import exercise5Pages.CruiseLengthPage;
import exercise5Pages.CruisePricePage;

public class CruiseLengthPageTest extends CruiseBaseClass {
	
	private CruisePricePage cruisePricePage;
    private CruiseLengthPage cruiseLengthPage;
    private WebDriverWait wait;
	
	    @Test(priority=4,description="Verifying the election 10-14 nights")
		public void chosenCruiselengthTest(){
	    wait= new WebDriverWait(driver,30);
	    CruiseLengthPage cruiseLengthPage= new CruiseLengthPage();
	    wait.until(ExpectedConditions.visibilityOf(cruiseLengthPage.getCruiseLengthInput()));
		cruisePricePage=cruiseLengthPage.clicKOnCruiseLengthInput();
		String expectedURL="https://www.travelocity.com/Cruise-Search?adultCount=2&destination=europe&earliest-departure-date=2022-02-25&latest-departure-date=2022-03-15&max-length=14&min-length=10";
	    String actualURL=driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);
	   }//end searchButtonTest

}//end CruiseLengthTest
