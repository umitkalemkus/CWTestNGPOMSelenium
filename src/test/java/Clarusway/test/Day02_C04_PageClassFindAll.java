package Clarusway.test;

import Clarusway.pages.SauceDemoLoginPage;
import Clarusway.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day02_C04_PageClassFindAll {


    @Test
    public void test(){

        Driver.getDriver().get("https://www.saucedemo.com/");

        SauceDemoLoginPage lp = new SauceDemoLoginPage();

        Assert.assertEquals(3, lp.inputElements.size());
    }


}
