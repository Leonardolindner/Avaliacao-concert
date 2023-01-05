package avaliacao.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO  extends BasePO {

    @FindBy(name = "q")
    public WebElement inputPesquisa;
    
    @FindBy(id = "result-stats")
    public WebElement divResultadoPesquisa;

    @FindBy(css = "body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.FPdoLc.lJ9FBc > center > input.gNO89b")
    public WebElement botaoPesquisaGoogle;

    @FindBy(css = "body > div.L3eUgb > div.o3j99.ikrT4e.om7nvf > form > div:nth-child(1) > div.A8SBwf > div.FPdoLc.lJ9FBc > center > input.RNmpXc")
    public WebElement botaoEstouComSorte;
    /**
     * Construtor  para a criação da página do google.
     * @param driver -- Driver da página  do google.
     */
    public GooglePO(WebDriver driver) {
        super(driver);
    }
    public void pesquisar(String texto){
        inputPesquisa.clear();
        inputPesquisa.sendKeys(texto);
    }
    /**
     * Metodo que ira efetuar uma pesquisa no google baseando no texto informado e concluindo com enter.
     * @param texto Texto a ser pesquisado.
     */
    public void pesquisarEClickEnter(String texto){
        inputPesquisa.clear();
        inputPesquisa.sendKeys(texto + Keys.ENTER);
    }
    /**
     * Método que retorna o resultado aproximado da pesquisa.
     * @return retorna o resultado da pesquisa.
     */
    public String obterResultadoPesquisa(){
        return divResultadoPesquisa.getText();
    }

    public void clicarBotaoPesquisaGoogle(){
        botaoPesquisaGoogle.click();
    }

    public void clicarBotaoEstouComSorte(){
        botaoEstouComSorte.click();
    }



    
}
