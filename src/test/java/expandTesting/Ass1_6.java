package expandTesting;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.expandTesting.Registeration;
import tests.testing.Tests;

public class Ass1_6 extends Tests {

    @Test

    public void test01(){

        String actualText = new Registeration(driver , bot).goTo()
                .successfulLogin((String)(testData.get("FName")),
                        (String) testData.get("LName"),
                        (String) testData.get("EMail"),
                        (String) testData.get("Tele"),
                        (String) testData.get("Password"),
                        (String) testData.get("CMPassword")).readSuccessfullMessage();

        Assert.assertEquals(actualText , testData.get("ExpectedSuccessMessage"));
        logger.info("Registration was successful as expected!");

    }

    @BeforeClass
    public void initializeTestDataReader(){
       testData = (JSONObject) testData.get("expandTesting");
    }
}
