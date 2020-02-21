package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastrarUsuarioPage {

	// Elementos
	@FindBy(id = "systemUser_employeeName_empName")
	public WebElement campoEmployer;
	
	@FindBy(id = "systemUser_userName")
	public WebElement campoUserName;
	
	@FindBy(id = "systemUser_password")
	public WebElement campoPassword;
	
	@FindBy(id = "systemUser_confirmPassword")
	public WebElement campoConfirmarPassword;
	
	@FindBy(id = "btnSave")
	public WebElement botaoSalvar;
	
	public void informarCampoEmployerName(String employerName)
	{
		campoEmployer.sendKeys(employerName);
	}
	
	public void informarCampoUsername(String username)
	{
		campoUserName.sendKeys(username);
	}
	
	public void informarCampoPassword(String senha)
	{
		campoPassword.sendKeys(senha);
	}
	
	public void informarCampoConfirmarPassword(String senha)
	{
		campoConfirmarPassword.sendKeys(senha);
	}
	
	public void acionarBotaoSalvar()
	{
		botaoSalvar.click();
	}

}
