package tests.day15_POM;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C01_PagesIlkTest {

    @Test
    public void amazonTest(){
        // amazon a git
        Driver.getDriver().get("https://www.amazon.com");
        // Nutella arat
        AmazonPage amazonPage = new AmazonPage();
        amazonPage.aramaKutusu.sendKeys("Nutella"+ Keys.ENTER);
        // sonucların Nutella icerdigini test edin
        String expectedIcerik ="Nutella";
        String actualAramaSonucSayisi = amazonPage.aramaSonucuElementi.getText();
        Assert.assertTrue(actualAramaSonucSayisi.contains(expectedIcerik));
        // sayfayı kapatın
        Driver.closeDriver();
    }
}
