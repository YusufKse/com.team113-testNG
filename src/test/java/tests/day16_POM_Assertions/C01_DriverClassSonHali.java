package tests.day16_POM_Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_DriverClassSonHali {

    // 3 tane test methodu olusturalım
    // 1. methoda'da amazona gidip ,url'in amazon icerdigini test edin
    @Test
    public void amazonTest(){
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        String expectedIcerik ="amazon";
        String actualIcerik =Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualIcerik.contains(expectedIcerik));

        Driver.closeDriver();
    }

    // 2. methoa'da wise'a gidip, title'ın Wise Quarter icerdigini test edin
    @Test
    public void wiseTest(){
        Driver.getDriver().get(ConfigReader.getProperty("wiseUrl"));
        String expectedIcerik = "Wise Quarter";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedIcerik));

        Driver.closeDriver();
    }

    // 3. method'da facebook' a gidip title'ın facebook icerdigini test edin

    @Test
    public void facebookTest(){
        Driver.getDriver().get(ConfigReader.getProperty("faceUrl"));
        String expectedIcerik = "Facebook";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedIcerik));

        Driver.closeDriver();

    }

}
