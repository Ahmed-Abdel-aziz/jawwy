package BaseTest;

import BaseObjects.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class TestBase {

    private WebDriver driver;

    BasePage basePage ;

    private final String url = "https://subscribe.jawwy.tv/";

    @BeforeClass
    public void openBrowser(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver =  new ChromeDriver(options);
        driver.manage().window().maximize();



    }

    @BeforeMethod
    public void loadApplication(){

        basePage = new BasePage();
        basePage.setDriver(driver);
        driver.get(url);


    }

    @AfterClass
    public void closeBrowser(){
        driver.close();

        driver.quit();

    }


}
