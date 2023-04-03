package Pages;

import BaseObjects.BasePage;
import org.openqa.selenium.By;



public class HomePage extends BasePage {

    private By localization = By.id("translation-btn");

    private By country = By.id("country-name");




    private final String egypt = "egypt";
    private final String emarites = "emarites";

    private final String algeria = "algeria";

    private final String djibouti = "djibouti";

    private final String chad = "chad";

    private final String iraq = "iraq";

    private final String jordan = "jordan";

    private final String lebanon = "lebanon";

    private final String morocco = "morocco";

    private final String oman = "oman";

    private final String tunisia = "tunisia";

    private final String yemen = "yemen";

    private final String palestine = "palestine";
    private By egypt_country = By.id("eg-contry-lable");

    private By emarites_country = By.id("ae-contry-lable");

    private By algeria_country = By.id("dz-contry-lable");

    private By djibouti_country = By.id("dj-contry-lable");

    private By chad_country = By.id("td-contry-lable");

    private By iraq_country = By.id("iq-contry-lable");

    private By jordan_country = By.id("jo-contry-lable");

    private By lebanon_country = By.id("le-contry-lable");

    private By morocco_country = By.id("ma-contry-lable");

    private By oman_country = By.id("om-contry-lable");

    private By tunisia_country = By.id("tn-contry-lable");

    private By yemen_country = By.id("ye-contry-lable");

    private By palestine_country = By.id("ps-contry-lable");


    public void clickOnLocalzation() {
        click(localization);
    }

    public void clickOnCountrypopUp() {
        click(country);
    }

    public void selectCountry(String text) {

        switch (text.toLowerCase().trim()) {
            case egypt ->{
                click(egypt_country);
            }

            case emarites ->{
                click(emarites_country);
            }

            case algeria ->{
                click(algeria_country);
            }

            case djibouti ->{
                click(djibouti_country);
            }

            case chad ->{
                click(chad_country);
            }

            case iraq ->{
                click(iraq_country);
            }

            case jordan ->{
                click(jordan_country);
            }

            case lebanon ->{
                click(lebanon_country);
            }

            case morocco ->{
                click(morocco_country);
            }

            case oman ->{
                click(oman_country);
            }

            case tunisia ->{
                click(tunisia_country);
            }

            case yemen ->{
                click(yemen_country);
            }

            case palestine ->{
                click(palestine_country);
            }

        }
    }
}
