package pages;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import util.Properties;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @Before
    public WebDriver setup(String id) throws Exception {
        System.setProperty(Properties.TIPO_DRIVER, Properties.CHROME_DRIVER_PATH);
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-infobars");
//        options.addArguments("--start-maximized");
//        options.addArguments("--incognito");
//
//        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//        //capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
//        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
//
//        driver = new ChromeDriver(capabilities);
//        driver.navigate().to(Properties.URL_ROOT_DEV + id);
//        return driver;


        ChromeOptions options = new ChromeOptions();

        options.addArguments("disable-infobars");
        options.addArguments("--start-maximized");
        options.addArguments("--incognito");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver = new ChromeDriver(capabilities);
        //driver.manage().window().maximize();
        driver.navigate().to(Properties.URL_ROOT_DEV + id);

        return driver;
    }

   /* // Link Ahorros
    @FindBy(xpath = Properties.LNK_AHORROS_XPATH)
    public WebElement xpathLnkAhorros;


    public void clickLnkAhorros() {
        xpathLnkAhorros.click();
    }

    // Link Creditos
    @FindBy(xpath = Properties.LNK_CREDITOS_XPATH)
    public WebElement xpathLnkCreditos;


    public void clickLnkCreditos() {
        xpathLnkCreditos.click();
    }*/
}
