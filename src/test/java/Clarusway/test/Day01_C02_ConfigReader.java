package Clarusway.test;

import Clarusway.utilities.ConfigReader;
import Clarusway.utilities.Driver;
import org.testng.annotations.Test;

public class Day01_C02_ConfigReader {
    @Test
    public void readConfig() throws InterruptedException {





        Driver.getDriver().get(ConfigReader.getProperty("google_url"));


        Thread.sleep(6000);

        Driver.closeDriver();

    }





}
