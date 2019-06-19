package CitiBank;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CitiBankHomePage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"creditcards\"]")
    WebElement creditCards;

    public void setCreditCards (){
        creditCards.click();
    }
}
