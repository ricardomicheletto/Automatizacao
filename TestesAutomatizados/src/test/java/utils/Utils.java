package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Utils {

	// Cria o driver
	public static WebDriver driver;

	// Cria o método para criar o driver
	public static void acessarSistema()
	{
		//Informa em qual local está o arquivo do driver
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		//Declara que a variável vai receber um objeto
		driver = new ChromeDriver();
		//Ao abrir o navegador, exibe em tela cheia
		driver.manage().window().maximize();
		//Declara uma espera implicita de 5 segundos para carregar a pagina por completo
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Indica qual a página que será acessada
		driver.get("https://twinke-osondemand.orangehrm.com/symfony/web/index.php/auth/login");
	}

	// <T> T é uma variável genérica
	public static <T> T Na (Class <T> classe)
		{
			return PageFactory.initElements(driver, classe);
		}
}
