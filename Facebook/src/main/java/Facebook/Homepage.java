package Facebook;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Homepage extends CommonAPI {
    @FindBy (xpath = "//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a")
    WebElement forgotAccount;
    @FindBy(xpath = "//*[@id=\"u_0_r\"]")
    WebElement firstName;
    @FindBy(xpath = "//*[@id=\"u_0_t\"]")
    WebElement lastName;
    @FindBy(xpath = "//*[@id=\"u_0_w\"]")
    WebElement Email;
    @FindBy (xpath = "//*[@id=\"u_0_13\"]")
    WebElement Password;
    @FindBy(xpath = "//*[@id=\"u_0_9\"]")
    WebElement Gender;
    @FindBy(xpath = "//*[@id=\"month\"]")
    WebElement MonthButton;
    @FindBy(xpath = "//*[@id=\"day\"]")
    WebElement DayButton;
    @FindBy(xpath = "//*[@id=\"year\"]")
    WebElement YearButton;
    @FindBy(xpath = "//*[@id=\"u_0_1b\"]")
    WebElement SignUp;

    public void clickforgetAccount(){
        forgotAccount.click();
    }

    public void setSignUp(String firstname, String lastname, String email, String password){
        firstName.sendKeys(firstname);
        lastName.sendKeys(lastname,Keys.ENTER);
        Email.sendKeys(email,Keys.ENTER);
        Password.sendKeys(password,Keys.ENTER);
        Select sell = new Select(MonthButton);
        sell.selectByIndex(5);
        Select sell2 = new Select(DayButton);
        sell2.selectByIndex(1);
        Select sell3 = new Select(YearButton);
        sell3.selectByIndex(6);
        SignUp.click();





    }
}

