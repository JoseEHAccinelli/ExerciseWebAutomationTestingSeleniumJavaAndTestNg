package exercise5Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import exercise5Base.CruiseBaseClass;

public class CruiseLengthPage extends CruiseBaseClass {
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[3]/div[5]/aside/div/div/fieldset[2]/div/div/div/form/div/div[3]/div/label/input")
	private WebElement cruiseLengthInput;
	
	public WebElement getCruiseLengthInput() {
		return cruiseLengthInput;
	}// end get

	 public CruiseLengthPage(){
		super();
	}//end constructor
	 
  
   
   public void clickOnCruiseLengthInput() {
	   cruiseLengthInput.click();
   }// end method
   
	//This method will return object of CruisePricePage class as we are landing on 
		//CruisePricePage using this method
		   public CruisePricePage clicKOnCruiseLengthInput () {
			cruiseLengthInput.click();
			return new CruisePricePage();	
		}//end clickOnSearchBtn

}//end CruiseLength
