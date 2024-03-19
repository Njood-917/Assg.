package tests.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

//Go to URL: http://crossbrowsertesting.github.io/
//Click to To-Do App
//Checking Box to do-4 and Checking Box to do-5
//If both clicks worked, then the following List should be have length 2.
//Assert that this is correct
//Assert that the to do we added is present in the list
//Archiving old todos
//If our archive link worked, then the following list should have length 4.
//Assert that this is true as well
//Doing Cross Browser Testing.
public class Ass5_5Tests extends Tests{
    @Test
    public void toDoApp(){
        bot.navigate("http://crossbrowsertesting.github.io/");
        By toDoLink = By.xpath("//a[@href=\"todo-app.html\"]");
        bot.click(toDoLink);

        By toDo4= By.name("todo-4");
        By toDo5 = By.name("todo-5");

        WebElement toDo4Element = driver.findElement(toDo4);
        WebElement toDo5Element = driver.findElement(toDo5);

        Assert.assertTrue( toDo4Element.isEnabled(),"To-Do 4 checkbox is enabled");
        Assert.assertTrue( toDo5Element.isEnabled(),"To-Do 5 checkbox is enabled");

        toDo4Element.click();
        toDo5Element.click();

        Assert.assertTrue(toDo4Element.isSelected(),"To-Do 4 checkbox is selected");
        Assert.assertTrue(toDo5Element.isSelected(),"To-Do 5 checkbox is selected");

        By toDoList = By.cssSelector(".done-true");
        int toDoListSize = driver.findElements(toDoList).size();
        Assert.assertEquals(toDoListSize,2);
//        Assert.assertTrue(driver.findElement(By.xpath("//label[text()='todo-4']")).isDisplayed(),"To-Do 4 is present in the list");
//        Assert.assertTrue(driver.findElement(By.xpath("//label[text()='todo-5']")).isDisplayed(),"To-Do 5 is present in the list");

        By archiveLink = By.xpath("//*[contains(text(), 'archive')]");
        bot.click(archiveLink);

        // Assert that the list has a length of 4 after archiving old todos
        By toDoLiatAfterArchiving = By.cssSelector(".done-false");
        int archivedListSize = driver.findElements(toDoLiatAfterArchiving).size();
        Assert.assertEquals(archivedListSize, 3, "List size is 3 after archiving old todos");


    }
}
