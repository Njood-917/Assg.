package junit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

/*
Go to URL: http://demo.guru99.com/test/drag_drop.html
Drag and drop the BANK button to the Account section in DEBIT SIDE
Drag and drop the SALES button to the Account section in CREDIT SIDE
Drag and drop the 5000 button to the Amount section in DEBIT SIDE
Drag and drop the second 5000 button to the Amount section in CREDIT SIDE
Verify the visibility of Perfect text.
*/
public class Ass2_4 extends Tests{
@Test
    public void dragAndDrop(){
    driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
    //Drag and drop the BANK button to the Account section in DEBIT SIDE
    dragAndDrops("//a[contains(.,\" BANK \")]" ,"//ol[@id=\"bank\"]" );
//Drag and drop the SALES button to the Account section in CREDIT SIDE
    dragAndDrops("//a[contains(.,\" SALES \")]" , "//ol[@id=\"loan\"]");
    //Drag and drop the 5000 button to the Amount section in DEBIT SIDE
    dragAndDrops("//a[contains(.,\" 5000 \")]" , "//ol[@id=\"amt7\"]");
    //Drag and drop the second 5000 button to the Amount section in CREDIT SIDE
    dragAndDrops("//a[contains(.,\" 5000 \")]" , "//ol[@id=\"amt8\"]");

    WebElement perfectText = driver.findElement(By.xpath("//div[@id='bal3']/strong"));
    Assertions.assertTrue(perfectText.isDisplayed());


}
public void dragAndDrops(String x , String y){
    WebElement draggable = driver.findElement(By.xpath(x));
    WebElement droppable = driver.findElement(By.xpath(y));
    new Actions(driver).dragAndDrop(draggable , droppable).perform();
}
}
