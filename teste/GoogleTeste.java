package avaliacao.teste;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;
import avaliacao.page.GooglePO;

public class GoogleTeste extends BaseTeste{
    

    private static GooglePO googlePage;

    
    @BeforeClass
    public static void prepararTestes(){
        googlePage = new GooglePO(driver);
    }

    @Test
    public void TC001_001_deveSerPossivelPesquisarNoGoogleOTextoConcertTechnologiesEPressionarEnter(){
        googlePage.pesquisar("concert technologies");

       String resultado = googlePage.obterResultadoDaPesquisa();

       assertTrue(resultado, resultado.contains("resultados"));
    }

    @Test
    public void TC001_001devePesquisarNoGoogleOTextoConcertTechnologiesEClicarBotaoPesquisaGoogle(){
       googlePage.pesquisar("concert technologies");
       googlePage.clicarBotaoPesquisaGoogle();

       String resultado = googlePage.obterResultadoDaPesquisa();

       assertTrue(resultado, resultado.contains("resultados"));
    }
}
