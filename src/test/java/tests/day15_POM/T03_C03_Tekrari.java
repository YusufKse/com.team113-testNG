package tests.day15_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;

public class T03_C03_Tekrari {

    @Test
    public void QualitydemyNegatifLoginTesti(){

        // quality demy anasayfaya gidin
        Driver.getDriver().get("https://www.qualitydemy.com");
        QualitydemyPage qualitydemyPage =new QualitydemyPage();

        // login ilk login linkine tıklayın
        qualitydemyPage.ilkLoginLinki.click();

        // kullanıcı adı selenium
        qualitydemyPage.emailKutusu.sendKeys("selenium");

        // password kutusuna heyecandir yazin
        qualitydemyPage.passwordKutusu.sendKeys("heyecandir");

        // login butonuna tıklayın
        qualitydemyPage.loginButonu.click();

        // giris yapılamadıgını test edin
        Assert.assertTrue(qualitydemyPage.emailKutusu.isEnabled());

        // sayfayı kapatın
        Driver.closeDriver();

    }
}
