package Clarusway.UmitPractise;

import Clarusway.utilities.Driver;
import org.testng.annotations.Test;

public class DemoqaTestPage {


    @Test
    public void test01() {

        Driver.getDriver().get("https://demoqa.com/text-box");
        DemoqaHomePage dm = new DemoqaHomePage();
        dm.userName.sendKeys("Umit");
        dm.email.sendKeys("dunya@clarusway.com");
        dm.CurrentAddress.sendKeys("Sahinbey mah");
        dm.permanentAddress.sendKeys("Mehmet akif bey");
         dm.button.click();



    }


}
