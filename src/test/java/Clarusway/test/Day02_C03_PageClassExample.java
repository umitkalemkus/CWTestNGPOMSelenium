package Clarusway.test;

import Clarusway.pages.HtmlGoodiesHOMEPage;
import Clarusway.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Day02_C03_PageClassExample {
    /*Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    Fill in capitals by country.
*/
    @Test
    public void test() {
        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        HtmlGoodiesHOMEPage hp=new HtmlGoodiesHOMEPage();

        Actions actions =new Actions(Driver.getDriver());
        actions
                .dragAndDrop(hp.copenhag, hp.denmark)
                .dragAndDrop(hp.seoul, hp.sKorea)
                .dragAndDrop(hp.washington,hp.us)
                .dragAndDrop(hp.rome, hp.italy)
                .dragAndDrop(hp.madrid, hp.spain)
                .dragAndDrop(hp.oslo,hp.norway)
                .dragAndDrop(hp.stockholm,hp.sweden)
                .perform();


    }
}
