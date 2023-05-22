package tests.day16_POM_Assertions;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class C03_SoftAssertion {

    @Test
    public void cokluAssertion(){

        int sayi = 36;



        Assert.assertTrue(sayi % 2 == 0); // sayı cift mi
        Assert.assertTrue(sayi > 100); // sayi 100 den buyuk mu
        Assert.assertTrue(sayi < 1000); // sayın 1000 den kucuk mu
        Assert.assertFalse((sayi & 3) == 0); // sayinin 3 ile
                                                     // bolunemedigini test edin

    }

    @Test
    public void softAssertionTesti(){
        int sayi = 36;


        SoftAssert softAssert =new SoftAssert();

        softAssert.assertTrue(sayi % 2 == 0); // sayı cift mi

        softAssert.assertTrue(sayi > 100); // sayi 100 den buyuk mu

        softAssert.assertTrue(sayi < 1000); // sayın 1000 den kucuk mu

        softAssert.assertFalse((sayi & 3) == 0); // sayinin 3 ile
                                                        // bolunemedigini test edin

        softAssert.assertAll();
    }
}
