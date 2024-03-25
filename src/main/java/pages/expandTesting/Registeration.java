package pages.expandTesting;

import engine.ActionsBot;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registeration extends Pages{

private final String url = "https://ecommerce-playground.lambdatest.io/index.php?route=account/register";

 private final By fNameTextArea = By.id("input-firstname");
 private final By LNameTextArea = By.id("input-lastname");
 private final By emailTextArea = By.id("input-email");
 private final By telephoneTextArea = By.id("input-telephone");
 private final By passwordTextArea = By.id("input-password");
 private final By confirmPasswordTextArea = By.id("input-confirm");

 private final By agreeCheckbox = By.name("agree");
 private final By submitButton = By.cssSelector("input[type='submit']");


    public Registeration(WebDriver driver, ActionsBot bot) {
        super(driver, bot);
    }

    public Registeration goTo(){
        bot.navigate(url);
        return this;
    }
    public Secure successfulLogin(String FName, String LName, String EMail, String Tele, String Password, String CMPassword){
        registeration(FName, LName, EMail, Tele, Password, CMPassword );
        return new Secure(driver,bot);
    }


    private void registeration (String FName , String LName , String EMail ,String Tele , String Password , String CMPassword  ){
        bot.type(fNameTextArea , FName);
        bot.type(LNameTextArea , LName);
        bot.type(emailTextArea , EMail);
        bot.type(telephoneTextArea , Tele);
        bot.type(passwordTextArea , Password);
        bot.type(confirmPasswordTextArea , CMPassword);
        bot.click(agreeCheckbox);
        bot.click(submitButton);

    }
}
