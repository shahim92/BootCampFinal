package Amazon;

import base.CommonAPI;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class HomePage extends CommonAPI {

    @FindBy(xpath = "//*[@id=\"nav-orders\"]")
    WebElement Orders;
    @FindBy(xpath = "//*[@id=\"nav-link-prime\"]")
    WebElement TryPrime;
    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]")
    WebElement SignInButton;
    @FindBy(xpath = "//*[@id=\"ap_email\"]")
    WebElement email;
    @FindBy(xpath = "//*[@id=\"ap_password\"]")
    WebElement password;
    @FindBy(xpath = "//*[@id=\"nav-link-accountList\"]")
    WebElement SignIn;
    @FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
    WebElement search;
    @FindBy(xpath = "//*[@id=\"nav-xshop\"]/a[1]")
    WebElement deals;

    public void setOrders (){
        Orders.click();
    }

    public void setTryPrime(){
        TryPrime.click();
     }

     public void setSignInButton(){

        SignInButton.click();
     }

     public void goToSingInPage(String username, String pass){
         SignIn.click();
        email.sendKeys(username);
        password.sendKeys(pass, Keys.ENTER);
        sleepFor(5);
    }
    public void goToSearch(String watches){
        search.sendKeys(watches);

    }
    public void setDeals(){
        deals.click();
    }




}
