package TestCNNHomePage;

import CNN.CNNHomePage;
import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCNNHome extends CommonAPI {
    CNNHomePage home;
    String url = "https://www.cnn.com/";

    @BeforeClass
    public void init(){
        home = PageFactory.initElements(driver,CNNHomePage.class);
        driver.get(url);
    }
    @AfterClass
    public void getback (){
        driver.get(url);
    }
    @Test (enabled = true)
    public void clickOnEntertainment (){
        home.setEntertainment();
        sleepFor(5);
        driver.get(url);
    }
}
