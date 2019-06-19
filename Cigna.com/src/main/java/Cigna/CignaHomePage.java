package Cigna;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CignaHomePage extends CommonAPI {
    @FindBy(xpath = "//*[@id=\"includes-content\"]/div[1]/div/div/div[1]/div/div[2]/ul/li[3]/a")
    WebElement Glossary;

    public void setGlossary (){
        Glossary.click();
    }

}
