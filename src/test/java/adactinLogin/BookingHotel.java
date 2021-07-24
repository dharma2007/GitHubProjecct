package adactinLogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingHotel extends LibGlobal {
	
	@FindBy(id="first_name")
	private WebElement FirtstName;
	
	@FindBy(id="last_name")
	private WebElement LastName;
	
	@FindBy(id="address")
	private WebElement BillingAddress;
	
	@FindBy(id="cc_num")
	private WebElement CreditCard;
	
	@FindBy(id="cc_type")
	private WebElement CCType;
	
	@FindBy(id="cc_exp_month")
	private WebElement ExpMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement ExpYear;
	
	@FindBy(id="cc_cvv")
	private WebElement CVV;
	
	@FindBy(id="book_now")
	private WebElement BookNow;
	
	public WebElement getFirtstName() {
		return FirtstName;
	}

	public WebElement getLastName() {
		return LastName;
	}

	public WebElement getBillingAddress() {
		return BillingAddress;
	}

	public WebElement getCreditCard() {
		return CreditCard;
	}

	public WebElement getCCType() {
		return CCType;
	}

	public WebElement getExpMonth() {
		return ExpMonth;
	}

	public WebElement getExpYear() {
		return ExpYear;
	}

	public WebElement getCVV() {
		return CVV;
	}

	public WebElement getBookNow() {
		return BookNow;
	}

public void Bookinghotel() {

}
	
}
