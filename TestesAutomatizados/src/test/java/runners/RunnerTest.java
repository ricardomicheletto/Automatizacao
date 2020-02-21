package runners;

import org.junit.runner.RunWith;

import io.cucumber.core.snippets.SnippetType;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty"},
		//Pasta que contém as features
		features = "src/test/resources/features",
		//Pacote que contém os stepDefinitions
		glue = "stepsDefinitions",
		//tags = "@loginSucesso",
		tags = "@cadastrarUsuario",
		//Auxilia na criação dos passos, onde escreve de uma maneira melhor
		snippets = io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE,
		//Deixa a resposta do terminal de uma única cor
		monochrome = true,
		//Não executa o teste, mas informa os passos através do terminal (padrão false)
		dryRun = false
		)

public class RunnerTest {

}
