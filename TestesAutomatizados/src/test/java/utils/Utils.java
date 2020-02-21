package utils;

import java.util.concurrent.TimeUnit;

import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

public class Utils {

	// Cria o driver
	public static WebDriver driver;

	// Cria o m�todo para criar o driver
	public static void acessarSistema()
	{
		//Informa em qual local est� o arquivo do driver
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
		//Declara que a vari�vel vai receber um objeto
		driver = new ChromeDriver();
		//Ao abrir o navegador, exibe em tela cheia
		driver.manage().window().maximize();
		//Declara uma espera implicita de 5 segundos para carregar a pagina por completo
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//Indica qual a p�gina que ser� acessada
		driver.get("https://twinke-osondemand.orangehrm.com/symfony/web/index.php/auth/login");
	}

	// <T> T � uma vari�vel gen�rica
	public static <T> T Na (Class <T> classe)
		{
			return PageFactory.initElements(driver, classe);
		}

		public static void capturarTela(Scenario scenario)
		{
			final byte [] screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image.png");
		}
}
