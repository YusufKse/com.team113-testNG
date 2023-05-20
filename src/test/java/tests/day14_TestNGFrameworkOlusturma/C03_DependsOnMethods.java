package tests.day14_TestNGFrameworkOlusturma;

import net.bytebuddy.build.Plugin;
import org.testng.Assert;
import org.testng.annotations.Test;

public class C03_DependsOnMethods {
 /*
        DependsOnmethods oncelik sirasina karismaz

        dependsOnMethods bir test method'un calismasini
        baska bir method'un calisip passed olmasina baglar

        baglanilan method calismaz veya calisr ama failed olursa
        baglanan method hic calismaz

        @Test notasyonu sayesinde her test bagımsız olarak calıstırılabilir

        Ancak bir test dependsOnMethods ile baska bir method'a baglanmıs ise
        tek basına calısmasi istendiginde, once baglı oldugu test method'unu calıstırır

     */


    @Test
    public void youtubeTesti(){
        System.out.println("Youtube");
        Assert.assertTrue(8==3); // failed
    }

    @Test(priority = 3)
    public void wiseTesti(){
        System.out.println("Wise Quarter");
    }

    @Test(dependsOnMethods = "youtubeTesti")
    public void amazonTesti(){ // priority yazilmazsa sifir degeri alir
        System.out.println("Amazon");
    }
}
