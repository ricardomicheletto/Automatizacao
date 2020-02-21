package stepsDefinitions;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import pageObjects.TelaInicialPage;

import static org.junit.Assert.assertEquals;
import static utils.Utils.*;

public class TestandoActionSteps {

//    @Quando("mover o mouse para a aba PIM")
//    public void moverOMouseParaAAbaPIM() {
//        Na(TelaInicialPage.class).moverMouseParaAbaPim();
//    }
//
//    @Quando("mover o mouse para o menu Configuration")
//    public void moverOMouseParaOMenuConfiguration() {
//        Na(TelaInicialPage.class).moverMouseParaMenuConfiguration();
//    }
//
//    @Quando("mover o mouse para o menu Custom field")
//    public void moverOMouseParaOMenuCustomField() {
//        Na(TelaInicialPage.class).moverMouseParaMenuField();
//    }

    @Quando("acionar o submenu customField")
    public void acionarOSubmenuCustomField() throws InterruptedException {
        Na(TelaInicialPage.class).acessarMenuCustomField();
    }

    @Entao("o sistema apresenta a tela customField")
    public void oSistemaApresentaATelaCustomField() {
        assertEquals("Add Custom Field", driver.findElement(By.id("heading")).getText());
    }
}
