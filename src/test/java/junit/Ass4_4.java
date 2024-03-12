package junit;

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
        driver.get("https://www.amazon.com/");
        // create an instance of robot Class
        Robot robot = new Robot();
        // scroll down By Mouse
        robot.mouseWheel(4); //by 4 units

        wait.until(f->{
            driver.findElement(By.id("navBackToTop")).click();
            return true;

        });

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.querySelector('.nav-logo-base.nav-sprite').click();");

        Actions actions = new Actions(driver);
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));

            actions.moveToElement(searchBox).sendKeys("ClarusWay").build().perform();

        }
    }

