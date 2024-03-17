package tests.testing;

import org.testng.annotations.Test;

/*
Go to https://testpages.eviltester.com/styled/apps/notes/simplenotes.html
Add 10 notes using data provider with excel
Run it with 3 different browsers using XML file
Run it parallel with 3 threads
 */
public class Ass2_5 extends Tests{
    @Test
    public void test01(){
        driver.get("https://testpages.eviltester.com/styled/apps/notes/simplenotes.html");

    }
}
