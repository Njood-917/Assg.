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
        SoftAssert softAssert = new SoftAssert();
        driver.get("https://practicetestautomation.com/practice-test-login/");
         driver.findElement(By.id("username")).sendKeys("student");
         driver.findElement(By.id("password")).sendKeys("incorrectPassword");
         driver.findElement(By.id("submit")).click();
        String actualErrorMessage = driver.findElement(By.id("error")).getText();
        softAssert.assertEquals(actualErrorMessage, "Your password is invalid!");

        softAssert.assertAll();


    }
}
