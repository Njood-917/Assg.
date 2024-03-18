package tests.junit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import java.awt.*;

/*
   Go to Amazon
   Scroll to the bottom of the page using a robot
   Click on the "Back to top" web element
   Click on the Amazon logo at the bottom of the page (in the footer) using JavascriptExecutor
   Use Actions to type "ClarusWay" in the search box and perform the search
*/
public class Ass4_4 extends Tests {
    @Test
    public void robotTest() throws AWTException, InterruptedException {
        driver.get("https://www.amazon.com/stores/page/CDF3296F-98B9-4A3E-BCA2-4834A6E96166");
        // create an instance of robot Class
        Robot robot = new Robot();
        // scroll down By Mouse
        robot.mouseWheel(5);
        robot.delay(1000);//by 4 units

            driver.findElement(By.id("navBackToTop")).click();


        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement amazonLogo = driver.findElement(By.cssSelector(".nav-logo-base.nav-sprite"));
        js.executeScript("arguments[0].click();", amazonLogo);
        Actions actions = new Actions(driver);
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

            actions.moveToElement(searchBox).sendKeys("ClarusWay").build().perform();

        }
    }

