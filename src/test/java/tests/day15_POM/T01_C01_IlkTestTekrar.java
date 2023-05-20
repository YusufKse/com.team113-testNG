package tests.day15_POM;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class T01_C01_IlkTestTekrar {

    @Test
    public void amazonTest(){

        // amazon anasayfaya git
        Driver.getDriver().get("https://www.amazon.com");
        // Nutella arat
        // Arama kutusunun locate 'i pages package'ında Amazontest class'ında
        AmazonPage amazonPage =new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        // sonucların nutella icerdigini test et
        String expectedIcerik ="Nutella";
        String actualIcerik = amazonPage.aramaSonucuElementi.getText();
        Assert.assertTrue(actualIcerik.contains(expectedIcerik));
        // sayfayı kapat
        Driver.closeDriver();



    }
}
