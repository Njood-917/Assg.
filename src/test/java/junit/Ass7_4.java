package junit;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

// Go to amazon.com
// Take Full Page Screenshot.
// Take any spesific WebElement ScreenShot
public class Ass7_4 extends Tests{
    @Test
    public void screenShotTest() throws IOException {
        driver.navigate().to("https://www.amazon.com/");
        TakesScreenshot ss = (TakesScreenshot)driver;
        File ssFile = ss.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(ssFile , new File("C:\\Users\\nona5\\IdeaProjects\\Assignments\\test-output\\screenshots\\fullScreenShot.png"));
        System.out.println("Screenshot saved successfully.");
        WebElement amazonSS = driver.findElement(By.xpath("//*[@class=\"a-icon a-logo\"]"));
       File amazonImage =  amazonSS.getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(amazonImage , new File("C:\\Users\\nona5\\IdeaProjects\\Assignments\\test-output\\screenshots\\webElementSS.png"));

    }
}
