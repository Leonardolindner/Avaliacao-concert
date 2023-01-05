package avaliacao.teste;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

import avaliacao.page.ConcertPO;
import avaliacao.page.GooglePO;

public class GoogleTeste extends BaseTeste{
    

    private static GooglePO googlePage;
    private static ConcertPO concertPage;

    
    @BeforeClass
    public static void prepararTestes(){
        googlePage = new GooglePO(driver);
    }

    @Test
    public void TC001_001_deveSerPossivelPesquisarNoGoogleOTextoConcertTechnologiesEPressionarEnter(){
        googlePage.pesquisar("concert technologies");

       String resultado = googlePage.obterResultadoPesquisa();

       assertTrue(resultado, resultado.contains("resultados"));
    }

    @Test
    public void TC001_002devePesquisarNoGoogleOTextoConcertTechnologiesEClicarNoBotaoPesquisaGoogle(){
       googlePage.pesquisar("concert technologies");
       googlePage.clicarBotaoPesquisaGoogle();

       String resultado = googlePage.obterResultadoPesquisa();

       assertTrue(resultado, resultado.contains("resultados"));
    }

    @Test
    public void TC001_003devePesquisarNoGoogleOTextoConcertTechnologiesEClicarBotaoEstouComSorte(){
       googlePage.pesquisar("concert technologies");
       googlePage.clicarBotaoEstouComSorte();

       String resultado = concertPage.obterTextoTitle();

       assertTrue(resultado, resultado.contains("Concert"));
       
    }
}
