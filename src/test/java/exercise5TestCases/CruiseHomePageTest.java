package exercise5TestCases;


import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import exercise5Base.CruiseBaseClass;
import exercise5Pages.CruiseHomePage;
import exercise5Pages.CruiseLengthPage;

public class CruiseHomePageTest extends CruiseBaseClass {
	
private CruiseLengthPage cruiseLengthPage;
private WebDriverWait wait;	
	
	@Test(priority=1,description="Verifying Destination Cruise")
	public void DestinationCruiseTest()  {
	wait=new WebDriverWait(driver,10);
	//cruiseHomePage=new CruiseHomePage();
	wait.until(ExpectedConditions.visibilityOf(cruiseHomePage.getCruiseBtn()));	
	cruiseHomePage.clickOnCruiseBtn();
	wait.until(ExpectedConditions.visibilityOf(cruiseHomePage.getDropDown()));
	cruiseHomePage.clickGoingToSelect();
	wait.until(ExpectedConditions.visibilityOf(cruiseHomePage.getDestination()));
    cruiseHomePage.selectDestination();
	String expectedDestination="Europe";
    String actualDestination=cruiseHomePage.getDestination().getText();
    Assert.assertEquals(actualDestination, expectedDestination); 	
	 }//end verifyLogo
	
	@Test(priority=2,groups="Verifying departs as early as and departs as early as date")
	public void DepartsAsDateTest() {
		wait.until(ExpectedConditions.visibilityOf(cruiseHomePage.getDepartsAsEarly()));
		cruiseHomePage.clickOnDepartsAsEarly();
		wait.until(ExpectedConditions.visibilityOf(cruiseHomePage.getChosenDayDepartAsEarly()));
		cruiseHomePage.clickOnChosenDayDepartsAsEarly();
		String expectedDepartsAsEarlyAs="Feb 25, 2022 selected, current check in date.";
		String actualDepartsAsEarlyAs=cruiseHomePage.getChosenDayDepartAsEarly().getAttribute("aria-label");
		Assert.assertEquals(actualDepartsAsEarlyAs, expectedDepartsAsEarlyAs);
		wait.until(ExpectedConditions.visibilityOf(cruiseHomePage.getDoneBtn1()));
		cruiseHomePage.clickOnDoneBtn1();
        
		wait.until(ExpectedConditions.visibilityOf(cruiseHomePage.getDepartsAsLate()));
		cruiseHomePage.clickOnDepartsAsLate();
		wait.until(ExpectedConditions.visibilityOf(cruiseHomePage.getChosenDayDepartAsLate()));
		cruiseHomePage.clickOnChosenDayDepartsAsLate();
		String expectedDepartsAsLateAs="Mar 15, 2022 selected, current check out date.";
		String actualDepartsAsLateAs=cruiseHomePage.getChosenDayDepartAsLate().getAttribute("aria-label");
		Assert.assertEquals(actualDepartsAsLateAs, expectedDepartsAsLateAs);
		wait.until(ExpectedConditions.visibilityOf(cruiseHomePage.getDoneBtn2()));
		cruiseHomePage.clickOnDoneBtn2();
		
	}//end verifyDepartsAsDate
	
    @Test(priority=3,description="Verifying search button")
	public void searchButtonTest()  {
     wait= new WebDriverWait(driver,15);
     wait.until(ExpectedConditions.visibilityOf(cruiseHomePage.getSearchBtn()));
	 cruiseLengthPage=cruiseHomePage.clickOnSearchBtn();
	 String expectedURL="https://www.travelocity.com/Cruise-Search?destination=europe&adultCount=2&earliest-departure-date=2022-02-25&latest-departure-date=2022-03-15&d1=2022-02-25&d2=2022-03-15&cruise-line=";
     String actualURL=driver.getCurrentUrl();
	 Assert.assertEquals(actualURL, expectedURL);
     
	
	
	}// end searchButtonTest*/
	
	

	
	

}//endCruiseHomgePageTest
