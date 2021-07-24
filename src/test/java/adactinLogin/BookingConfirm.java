package adactinLogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookingConfirm {
	
	@FindBy(id="order_no")
	private WebElement OrderNo;

	public WebElement getOrderNo() {
		return OrderNo;
	}

}
