package exercise5Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import exercise5Base.CruiseBaseClass;

public class CruiseHomePage extends CruiseBaseClass {
	
   @FindBy(xpath="/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/figure/div[3]/div/div/ul/li[6]/a/span")
   private WebElement cruiseBtn;
	
	@FindBy(id="cruise-destination")
    private WebElement dropDown;
	
	@FindBy(xpath="//*[@id=\"cruise-destination\"]/optgroup[1]/option[5]")
    private WebElement destination;
	

	@FindBy(id="d1-btn")
    private WebElement departsAsEarly;
	
	@FindBy(id="d2-btn")
    private WebElement departsAsLate;
	
	//25 de Febrero
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/figure/div[3]/div/div/div/div[6]/div/form/div[2]/div[3]/div/div/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/table/tbody/tr[4]/td[6]/button")
 	private WebElement chosenDayDepartsAsEarly;
	//15 de Marzo
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/figure/div[3]/div/div/div/div[6]/div/form/div[2]/div[3]/div/div/div[2]/div/div[2]/div/div[2]/div[2]/div[2]/table/tbody/tr[3]/td[3]/button")
    private WebElement chosenDayDepartsAsLate;
	
	@FindBy(xpath="//*[@id=\"wizard-cruise-pwa-1\"]/div[2]/div[3]/div/div/div[1]/div/div[2]/div/div[3]/button")
	private WebElement doneBtn1;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div/div[1]/div[2]/div[1]/div[2]/div/figure/div[3]/div/div/div/div[6]/div/form/div[2]/div[3]/div/div/div[2]/div/div[2]/div/div[3]/button")
	private WebElement doneBtn2;
	
	@FindBy(xpath="//button[@ class='uitk-button uitk-button-large uitk-button-fullWidth uitk-button-has-text uitk-button-primary']")
	private WebElement searchBtn;
	
	
	//constructor
	 public CruiseHomePage(){
		super();
	}//end constructor
	 
	 
	//some getters  
	 
	 public WebElement getDestination() {
		 return destination;
	 }//end getter
	 public WebElement getDropDown() {
		 return dropDown;
	 }// end getter
	 
	 public WebElement getDepartsAsEarly() {
		 return departsAsEarly;
	 }// end getter
	 
	 public WebElement getDepartsAsLate() {
		 return departsAsLate;
	 }// end getter
	 
	 public WebElement getSearchBtn() {
		 return searchBtn;
	 }// end get
	 
	 public WebElement getCruiseBtn() {
		 return cruiseBtn;
		 
	 }//end get
	 
	 public WebElement getChosenDayDepartAsEarly () {
		 return chosenDayDepartsAsEarly;
	 }//end get
	 
	 public WebElement getChosenDayDepartAsLate() {
		 return chosenDayDepartsAsLate;
	 }//end get
	 
	 public WebElement getDoneBtn1() {
			return doneBtn1;
		}// end getDoneBtn1
	 
		public WebElement getDoneBtn2() {
			return doneBtn2;
		}//end getDoneBtn2
		
	 // CruiseHomePage methods
	public void clickOnCruiseBtn() {
		cruiseBtn.click();
	}//end clickOnCruiseBtn
	
	public void clickGoingToSelect() {
		dropDown.click();
	}//end goingToSelect
	
	
	public void selectDestination() {
		Select select= new Select(dropDown);
		select.selectByVisibleText("Europe");
	}//end SelectDestination
	
	public void clickOnDepartsAsEarly() {
		departsAsEarly.click();
	}// end clickOnDepartAsEarly
	
    public void clickOnChosenDayDepartsAsEarly() {
		chosenDayDepartsAsEarly.click();
	}//end clickOnChosenDayDepartsAsEarly
	
	public void clickOnDepartsAsLate() {
		departsAsLate.click();
	}// end clickOnDepartAsLate
	
	public void clickOnChosenDayDepartsAsLate() {
		chosenDayDepartsAsLate.click();
	}//end clickOnChosenDayDepartsAsLate
	
	public void clickOnDoneBtn1() {
		doneBtn1.click();
	}// end clickOnDoneBtn
	
	public void clickOnDoneBtn2() {
		doneBtn2.click();
	}//end clickOnDoneb
	
	
	
	//This method will return object of CruiseLenght class as we are landing on 
	//CruiseLength using this method
	   public CruiseLengthPage clickOnSearchBtn() {
		searchBtn.click();
		return new CruiseLengthPage();	
	}//end clickOnSearchBtn
	   
}//end CruiseHomePage
