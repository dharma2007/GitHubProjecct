package adactinLogin;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends LibGlobal{

	
	@FindBy(id="username")
	private WebElement txtUserName;
	
	@FindBy(id="password")
	private WebElement txtPassword;
	
	@FindBy(id="login")
	private WebElement btnLogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
	public void login(String userName, String Password) {
		type(getTxtUserName(), userName);
		type(getTxtPassword(), Password);
		click(getBtnLogin());
		
	}
	
	public static void main(String[] args) {
		LibGlobal l = new LibGlobal();
		l.getDriver();
		LoginPage lp = new LoginPage();
		lp.login("Dharma007", "dharma");
}
}
 











