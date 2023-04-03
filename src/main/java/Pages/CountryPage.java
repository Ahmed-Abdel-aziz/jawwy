package Pages;

import BaseObjects.BasePage;
import org.openqa.selenium.By;

public class CountryPage extends BasePage {


    private By lite_package = By.id("name-lite");
    private By classic_package = By.id("name-classic");
    private  By premium_package = By.id("name-premium");

    private By lite_price = By.xpath("//div[@id='currency-lite']/b");
    private By lite_currency = By.xpath("//div[@id='currency-lite']/i");
    private By classic_price = By.xpath("//div[@id='currency-classic']/b");
    private By classic_currency = By.xpath("//div[@id='currency-classic']/i");
    private By premium_price = By.xpath("//div[@id='currency-premium']/b");
    private By premium_currency = By.xpath("//div[@id='currency-premium']/i");


    public String litePackage() {
        return getText(lite_package);
    }

    public String classicPackage() {
        return getText(classic_package);
    }

    public String premiumPackage() {
        return getText(premium_package);
    }

    public String litePrice() {
        return getText(lite_price);
    }

    public String classicPrice() {
        return getText(classic_price);
    }

    public String premiumPrice() {
        return getText(premium_price);
    }

    public String liteCurrency() {
        return getText(lite_currency);
    }

    public String classicCurrency() {
        return getText(classic_currency);
    }

    public String premiumCurrency() {
        return getText(premium_currency);
    }


}
