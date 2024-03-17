package tests.testing;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.config.Configurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.FileReader;
import java.time.Duration;


public abstract class Tests {
    protected WebDriver driver;
    protected Wait<WebDriver> wait;
    protected static Logger logger;

    @BeforeClass
    public static void beforeClass() {
        Configurator.initialize(null, "src/main/resources/properties/log4j2.properties");
        logger = LogManager.getLogger(tests.testing.Tests.class.getName());
        logger = LogManager.getLogger(tests.junit.Tests.class.getName());
//    testData =  (JSONObject) new JSONParser().parse( new FileReader("src/test/resources/testData/testData.json", StandardCharsets.UTF_8) );
    }

    @BeforeMethod
    public void beforeMethod() {

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("start-maximized");
        driver = new ChromeDriver(chromeOptions);


        wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    }

    @AfterMethod
    public void afterMethod() {

        driver.quit();
    }
}