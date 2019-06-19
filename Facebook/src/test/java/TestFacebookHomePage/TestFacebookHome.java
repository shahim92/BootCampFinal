package TestFacebookHomePage;

import Facebook.Homepage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestFacebookHome extends CommonAPI {
    Homepage home;
    String url = "https://www.facebook.com/";

    @BeforeClass
    public void init(){
        home = PageFactory.initElements(driver,Homepage.class);
        driver.get(url);
    }
    @AfterMethod
    public void getback(){
        driver.get(url);
    }

    @Test (enabled = false)
    public void clickOnForgotAccount (){
        home.clickforgetAccount();
        sleepFor(5);
    }
}
