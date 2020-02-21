package pageObjects;

import static utils.Utils.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	//Mapeamento usando PageFactory
	@FindBy(name = "txtUsername")
	private WebElement campoUsuario;
	
	@FindBy(name = "txtPassword")
	private WebElement campoSenha;
	
	@FindBy(name = "Submit")
	private WebElement botaoLogin;
	
//	Métodos utilizados para testar campo por campo
	public void informarCampoUsuario (String usuario)
	{
		//Só pode ser cirado dentro de um método
		//WebElement campoUsuario = driver.findElement(By.name("txtUsername"));
		//campoUsuario.sendKeys(usuario);
		
		//Primeiro método utilizado
		//driver.findElement(By.name("txtUsername")).sendKeys(usuario);
		
		campoUsuario.sendKeys(usuario);
	}
	
	public void informarCampoSenha (String senha)
	{
		//driver.findElement(By.name("txtPassword")).sendKeys(senha);
		
		campoSenha.sendKeys(senha);
	}
	
	public void acionarBotaoLogin ()
	{
		//driver.findElement(By.name("Submit")).click();
		
		botaoLogin.click();
	}
	
	//Método utilizado para otimizar testes
	public void realizarLogin(String usuario, String senha)
	{
		informarCampoUsuario (usuario);
		informarCampoSenha (senha);
		acionarBotaoLogin ();
	}
}
