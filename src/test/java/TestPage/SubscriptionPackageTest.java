package TestPage;

import BaseTest.TestBase;
import Pages.CountryPage;
import Pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;



public class SubscriptionPackageTest extends TestBase {

    HomePage home = new HomePage();
    CountryPage country = new CountryPage();


    @Test
    public void validateTheSubsriptionPakcage_egypt(){

        home.clickOnLocalzation();
        home.clickOnCountrypopUp();
        home.selectCountry("egypt");

        Assert.assertEquals(country.litePackage(),"LITE","validate on lite package");
        Assert.assertTrue(country.litePrice().contains("0.25"),"validate on lite price");
        Assert.assertTrue(country.liteCurrency().contains("USD"),"validate on lite currency");

        Assert.assertEquals(country.classicPackage(),"CLASSIC","validate on classic package");
        Assert.assertTrue(country.classicPrice().contains("0.5"),"validate on classic price");
        Assert.assertTrue(country.classicCurrency().contains("USD"),"validate on  classic currency");

        Assert.assertEquals(country.premiumPackage(),"PREMIUM","validate on  premium package");
        Assert.assertTrue(country.premiumPrice().contains("1"),"validate on  premium price");
        Assert.assertTrue(country.premiumCurrency().contains("USD"),"validate on  premium currency");

    }

    @Test(dependsOnMethods = "validateTheSubsriptionPakcage_egypt")
    public void validateTheSubsriptionPakcage_uae(){

        home.clickOnLocalzation();
        home.clickOnCountrypopUp();
        home.selectCountry("emarites");

        Assert.assertEquals(country.litePackage(),"LITE","validate on lite package");
        Assert.assertTrue(country.litePrice().contains("5.4"),"validate on lite price");
        Assert.assertTrue(country.liteCurrency().contains("USD"),"validate on lite currency");

        Assert.assertEquals(country.classicPackage(),"CLASSIC","validate on classic package");
        Assert.assertTrue(country.classicPrice().contains("10.9"),"validate on classic price");
        Assert.assertTrue(country.classicCurrency().contains("USD"),"validate on  classic currency");

        Assert.assertEquals(country.premiumPackage(),"PREMIUM","validate on  premium package");
        Assert.assertTrue(country.premiumPrice().contains("16.3"),"validate on  premium price");
        Assert.assertTrue(country.premiumCurrency().contains("USD"),"validate on  premium currency");

    }



}
