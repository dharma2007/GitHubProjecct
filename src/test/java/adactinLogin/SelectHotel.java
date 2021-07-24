package adactinLogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SelectHotel extends LibGlobal{
	
	@FindBy(id="radiobutton_0")
	private WebElement RadioBtn;	
	
	@FindBy(id="continue")
	private WebElement btnSearch1;

	public WebElement getRadioBtn() {
		return RadioBtn;
	}

	public WebElement getBtnSearch1() {
		return btnSearch1;
	}

	public void selectHotel() {
		click(getRadioBtn());
		click(getBtnSearch1());
	
}

}

