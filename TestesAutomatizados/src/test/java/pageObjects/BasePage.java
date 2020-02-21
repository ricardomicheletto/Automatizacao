package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BasePage {
	
	@FindBy(id = "menu_admin_viewAdminModule")
	public WebElement abaAdmin;

}
