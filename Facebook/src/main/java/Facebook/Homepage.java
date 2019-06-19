package Facebook;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends CommonAPI {
    @FindBy (xpath = "//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a")
    WebElement forgotAccount;
    @FindBy(xpath = "//*[@id=\"u_0_r\"]")
    WebElement firstName;

    public void clickforgetAccount(){
        forgotAccount.click();
    }

    public void
}

