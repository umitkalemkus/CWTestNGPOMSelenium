package Clarusway.test;

import Clarusway.pages.ExampleHomePages;
import Clarusway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class DemoPages {

    @Test
    public void testName() throws InterruptedException {

         Driver.getDriver().get("https://www.amazon.com/");
        ChromeOptions op = new ChromeOptions();
//disable notification parameter
        op.addArguments("disable-popup-blocking");
        ExampleHomePages hm = new ExampleHomePages();
        hm.search.sendKeys("Tester Book");




    }

 /*   @FindBy(xpath = "//button[starts-with(text(),'Tüm Çerezlere İzin Ver')]")
    public WebElement cookies;*/


}
