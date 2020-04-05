package com.weborders.pages;

import com.weborders.utilities.ConfigurationReader;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractBasePage {

    @FindBy(id="ctl00_MainContent_username")
    private WebElement userName;

    @FindBy(id="ctl00_MainContent_password")
    private WebElement password;

    public void login(){
        // there is a order when you have object first super class call and
        //findBy annotations
        String usernameValue= ConfigurationReader.getProperty("username");
        String passwordValue=ConfigurationReader.getProperty("password");
        userName.sendKeys(usernameValue);
        password.sendKeys(passwordValue);
    }
  public void login(String usernameValue, String passwordValue){
        //login() ---> for valid credential automatically
      //login(String usernameValue, String passwordValue)
        //if sometimes we need to specific user the same action but it doesn't ask you
      //credentials first one like that second one ask you the credentials
        userName.sendKeys(usernameValue);
        password.sendKeys(passwordValue, Keys.ENTER);

  }
}
