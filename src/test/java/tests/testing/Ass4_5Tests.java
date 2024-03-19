package tests.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

//Open the site: http://opencart.abstracta.us/index.php?route=account/login
//Login with that credentials
//Email: clarusway@gmail.com
//Password: 123456789
//Using the Search function do it with Data Provider for Mac, iPad and Samsung.
public class Ass4_5Tests extends Tests{

    @Test(dataProvider = "searchQuery")
    public void searchFunctionWithDataProvider(String searchInput){
        driver.navigate().to("http://opencart.abstracta.us/index.php?route=account/login");
        By email= By.id("input-email");
        By password = By.id("input-password");
        By loginButton = By.xpath("//input[@type='submit']");

        driver.findElement(email).sendKeys("clarusway@gmail.com");
        driver.findElement(password).sendKeys("123456789");
        driver.findElement(loginButton).click();

        By searchBox= By.name("search");
        driver.findElement(searchBox).sendKeys(searchInput + Keys.ENTER);

    }
    @DataProvider(name = "searchQuery")

    public static Object[][] searchFromProvider() {

        // The number of times data is repeated, test will be executed the same no. of times
        // Here it will execute two times

        return new Object[][] {{"Mac"}, {"iPad"}, {"Samsung"} , {"Huawei"}};

    }

}
