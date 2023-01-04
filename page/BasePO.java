package avaliacao.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Classe base para a criação das nova PageObjects.
 * Todas as pages deven ser herdadas desta classe.
 */
public abstract class BasePO {
   /**Driver base que será usado pelas pages */
    protected WebDriver driver;

    /**
     * Contrutor base para a criação da fabrica de elementos(pageFactory).
     * @param driver -- Driver da pagina atual.
     */
    protected BasePO(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
