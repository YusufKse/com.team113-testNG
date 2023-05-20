package tests.day15_POM;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.QualitydemyPage;
import utilities.Driver;

public class T02_C02_Tekrari {

    @Test
    public void test01(){

        // qualitydemy anasayfaya git
        Driver.getDriver().get("https://www.qualitydemy.com");
        QualitydemyPage qualitydemyPage = new QualitydemyPage();

        // login linkine tıklayın
        qualitydemyPage.ilkLoginLinki.click();

        // gecerli username ve passwordu ilgili kutulara girin
        qualitydemyPage.emailKutusu.sendKeys("anevzatcelik@gmail.com");
        qualitydemyPage.passwordKutusu.sendKeys("Nevzat152032");

        //log in butonuna basın
        qualitydemyPage.loginButonu.click();

        // basarılı olarak giris yapıldıgını test edin
        Assert.assertTrue(qualitydemyPage.basariliGirisKontrolElementi.isDisplayed());
        // sayfayı kapatın
        Driver.closeDriver();





    }
}
