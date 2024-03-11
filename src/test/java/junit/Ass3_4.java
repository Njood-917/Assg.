package junit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/*
( This task should be managed with keyboard actions )
// go to https://www.google.com/
// search for "Scroll Methods" by using an Actions object
 */
public class Ass3_4 extends Tests{
    @Test
    public void keyboardAction(){
        driver.navigate().to("https://www.google.com/");
        WebElement searchInput = driver.findElement(By.xpath("//*[@id=\"APjFqb\"]"));
       Actions actions =  new Actions(driver);
       actions.sendKeys(searchInput ,"Scroll Methods" ).sendKeys(Keys.ENTER).perform();

    }
}
