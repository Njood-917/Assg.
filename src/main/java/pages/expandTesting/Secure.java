package pages.expandTesting;

import engine.ActionsBot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Secure extends Pages{
    private final By message = By.tagName("h1");

    public Secure(WebDriver driver, ActionsBot bot) {
        super(driver, bot);
    }
    public String  readSuccessfullMessage (){
        return bot.getText(message);
    }
}
