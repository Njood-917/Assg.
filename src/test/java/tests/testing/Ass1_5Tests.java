package tests.testing;


import org.testng.annotations.Test;

/*
    Create tests that depend on each other
    Create beforeClass and set up settings.
    By creating interdependent tests;
    First go to Facebook.
    Then go to Google depending on Facebook,
    Then go to Amazon depending on Google
    Close the driver.
     */
public class Ass1_5Tests extends Tests{

    @Test
    public void test01(){
        driver.get("https://www.facebook.com/");
        System.out.println("navigate to facebook");
    }
    @Test(dependsOnMethods = "test01")
    public void test02(){
        driver.get("https://www.google.com/");
        System.out.println("navigate to google");
    }
    @Test(dependsOnMethods = "test02")
    public void test03(){
        driver.get("https://www.amazon.com/");
        System.out.println("navigate to amazon");
    }
}
