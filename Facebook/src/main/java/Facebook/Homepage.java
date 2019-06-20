package Facebook;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Homepage extends CommonAPI {
    @FindBy (xpath = "//*[@id=\"login_form\"]/table/tbody/tr[3]/td[2]/div/a")
    WebElement forgotAccount;
    @FindBy(name = "firstname")
    WebElement firstName;
    @FindBy(name = "lastname")
    WebElement lastName;
    @FindBy(name = "reg_email__")
    WebElement email;
    @FindBy(name = "reg_passwd__")
    WebElement password;
    @FindBy(name = "sex")
    WebElement Gender;
    @FindBy(xpath = "//*[@id=\"month\"]")
    WebElement MonthButton;
    @FindBy(xpath = "//*[@id=\"day\"]")
    WebElement DayButton;
    @FindBy(xpath = "//*[@id=\"year\"]")
    WebElement YearButton;
    @FindBy(name = "websubmit")
    WebElement SignUp;

    public void clickforgetAccount(){
        forgotAccount.click();
    }

    public void setSignUp(String Firstname, String Lastname, String Email, String Password) {
        firstName.sendKeys(Firstname);
        lastName.sendKeys(Lastname);
        email.sendKeys(Email);
        password.sendKeys(Password);
        Select sell = new Select(MonthButton);
        sell.selectByIndex(5);
        Select sell2 = new Select(DayButton);
        sell2.selectByIndex(1);
        Select sell3 = new Select(YearButton);
        sell3.selectByIndex(6);
        Gender.click();
        SignUp.click();
        sleepFor(5);

    }





    }

