package runners;

import org.junit.runner.RunWith;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty","html:target/cucumber-report"},
		//Pasta que cont�m as features
		features = "src/test/resources/features",
		//Pacote que cont�m os stepDefinitions
		glue = "stepsDefinitions",
		//tags = "@loginSucesso",
		//tags = "@cadastrarUsuario",
		tags = "@dropdown",
		//Auxilia na cria��o dos passos, onde escreve de uma maneira melhor
		snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE,
		//Deixa a resposta do terminal de uma �nica cor
		monochrome = true,
		//N�o executa o teste, mas informa os passos atrav�s do terminal (padr�o false)
		dryRun = false
		)

public class RunnerTest {

}
