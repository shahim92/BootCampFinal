package TestAmazonHomePage;

import Amazon.HomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAmazonHome extends CommonAPI {

    HomePage home;
    String url = "https://www.amazon.com/";

@BeforeClass
public void init(){
    home = PageFactory.initElements(driver,HomePage.class);
    driver.get(url);
}

    @AfterMethod
    public void getback(){
    driver.get(url);
    }

    @Test
    public void clickOnOrders (){
        home.setOrders();
        sleepFor(5);
    }
    @Test
    public void clickOnTryPrime (){
    home.setTryPrime();
    }
    @Test
    public void clickOnSignInButton(){
    home.setSignInButton();
    }
    @Test
    public void SignInTest(){
    home.goToSingInPage("email.com", "password");
    }
    @Test
    public void clickOnSearch(){
    home.goToSearch("apple watch");
    sleepFor(5);
    }


    @Test
    public void clickOnDeals(){
    home.setDeals();
    sleepFor(5);
    }


}
