package tests.testing;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/* go to "https://practicetestautomation.com/practice-test-login/"
enter username - "student"
enter password - "incorrectPassword"
and login
SOFT ASSERT the error message shown
SOFT ASSERT the error message is "Your password is invalid!" */
public class Ass3_5Tests extends Tests {
    @Test
    public void test01(){

        driver.get("https://practicetestautomation.com/practice-test-login/");
         driver.findElement(By.id("username")).sendKeys("student");
         driver.findElement(By.id("password")).sendKeys("incorrectPassword");
         driver.findElement(By.id("submit")).click();

         By errorMessage = By.id("error");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(driver.findElement(errorMessage).isDisplayed());
        softAssert.assertEquals(driver.findElement(errorMessage).getText(), "Your password is invalid!");

        softAssert.assertAll();


    }
}
