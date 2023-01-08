package Clarusway.UmitPractise;

import Clarusway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoqaHomePage {


    public DemoqaHomePage() {
        PageFactory.initElements(Driver.getDriver(), this);


    }

    @FindBy(id = "userName")
    public WebElement userName;

    @FindBy(id = "userEmail")
    public WebElement email;

    @FindBy(id ="currentAddress")
    public WebElement CurrentAddress;

    @FindBy(id ="permanentAddress")
    public WebElement permanentAddress;

   @FindBy(css = "button.btn")
    public WebElement button;
}
