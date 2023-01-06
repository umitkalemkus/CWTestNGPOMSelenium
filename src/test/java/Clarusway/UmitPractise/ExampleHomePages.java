package Clarusway.UmitPractise;

import Clarusway.utilities.Driver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExampleHomePages {

    public ExampleHomePages() {

        PageFactory.initElements(Driver.getDriver(), this);

        DemoPages dm = new DemoPages();
        dm.search.sendKeys("apple");

    }








}
