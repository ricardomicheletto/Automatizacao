package stepsDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pageObjects.LoginPage;

import static utils.Utils.*;

public class Hooks {
	
	//Qualquer c�digo deste bloco � executado antes de qualquer teste
	
	@Before()
	public void setUp()
	{
		acessarSistema();
		Na(LoginPage.class).realizarLogin("Admin", "@wwZu@@STR26");
	}
	
	//Order crescente
	@Before(value="@login")
	public void funcionalidadeLogin()
	{
		acessarSistema();
	}
	
	//Qualquer c�digo deste bloco � executado depois de todos os testes
	//Order decrescente
	@After
	public void tearDown()
	{
		//driver.quit();
	}
}
