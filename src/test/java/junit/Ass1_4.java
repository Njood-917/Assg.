package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;

public class Ass1_4 extends Tests{
    //Go to URL: https://the-internet.herokuapp.com/windows
    //Verify the text: “Opening a new window”
    //Verify the title of the page is “The Internet”
    //Click on the “Click Here” button
    //Verify the new window title is “New Window”
    //Go back to the previous window and then verify the title: “The Internet”

    @Test
    public void test01(){
        driver.navigate().to("https://the-internet.herokuapp.com/windows");
        //Verify the text: “Opening a new window”
        By header = By.tagName("h3");
        String openingWindowText = driver.findElement(header).getText();
        Assertions.assertEquals(openingWindowText, "Opening a new window");
        //Verify the title of the page is “The Internet”
        String titlePage =  driver.getTitle();
        Assertions.assertEquals(titlePage,"The Internet");
        //Click on the “Click Here” button
        driver.findElement(By.linkText("Click Here")).click();
        //Verify the new window title is “New Window”
        List<String> strWH = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(strWH.get(1));
        String newWindowTitle = driver.getTitle();
        Assertions.assertEquals(newWindowTitle,"New Window");
        //Go back to the previous window and then verify the title: “The Internet”
        driver.close();
       driver.switchTo().window(strWH.get(0));
         titlePage =  driver.getTitle();
        Assertions.assertEquals(titlePage,"The Internet");







    }
}
