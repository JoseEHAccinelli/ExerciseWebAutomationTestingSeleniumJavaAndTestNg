package exercise5Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import exercise5Base.CruiseBaseClass;

public class CruisePricePage extends CruiseBaseClass {
	
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[3]/div[5]/section/div[1]/div/div/div/div[2]/div/fieldset/ul/li[3]/button")
	private WebElement priceBtn;
	
	public CruisePricePage() {
		super();
	}//end constructor
	
	
	public WebElement getPriceBtn() {
		return priceBtn;
	}//end get

	//This method will return object of CruisePricePage class as we are landing on 
		//CruisePricePage using this method
		   public CruiseInquirePage clicKOnrpriceBtn () {
			priceBtn.click();
			return new CruiseInquirePage();	
		}//end clickOnSearchBtn


}//end CruisePricePage class
