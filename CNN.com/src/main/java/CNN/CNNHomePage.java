package CNN;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CNNHomePage extends CommonAPI {
    @FindBy (xpath = "//*[@id=\"nav\"]/div[2]/div[2]/a[7]")
    WebElement entertainment;

    public void setEntertainment(){
        entertainment.click();
    }
}
