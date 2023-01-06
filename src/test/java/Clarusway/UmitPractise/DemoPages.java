package Clarusway.UmitPractise;

import Clarusway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class DemoPages {

    @Test
    public void testName() {

         Driver.getDriver().get("https://www.amazon.com/");

    }

    @FindBy (id ="twotabsearchtextbox")
      public WebElement search;




}
