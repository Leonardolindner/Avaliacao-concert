package avaliacao.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ConcertPO extends BasePO {


    @FindBy(css = "head > title")
    public WebElement tagTitleConcert;

    public ConcertPO(WebDriver driver) {
        super(driver);
    }
    
    public String obterTextoTitle(){
        return tagTitleConcert.getText();
    }
}
