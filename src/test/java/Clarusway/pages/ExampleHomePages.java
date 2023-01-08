package Clarusway.pages;

import Clarusway.test.DemoPages;
import Clarusway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExampleHomePages {



    public ExampleHomePages() throws InterruptedException {

        PageFactory.initElements(Driver.getDriver(), this);






    }

    @FindBy(id="//div[starts-with(text(), 'Accept all')]")
    public WebElement cookies;

    @FindBy(id="twotabsearchtextbox")
    public WebElement search;









}
