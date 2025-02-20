package com.thetestingacademy.Pages.PageFactory;

import com.thetestingacademy.Base.CommonToAllPage;
import com.thetestingacademy.utilis.PropertyReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.thetestingacademy.driver.DriverManager.driver;

public class LoginPage_PF extends CommonToAllPage {
    public LoginPage_PF(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "login-username")
    private WebElement username;

    @FindBy(id = "login-password")
    private WebElement password;

    @FindBy(id = "js-login-btn")
    private WebElement signButton;

    @FindBy(css = "#js-notification-box-msg")
    private WebElement error_message;


    
    // Page Actions
    public String loginToVWOInvalidCreds() {

        enterInput(username, PropertyReader.readKey("invalid_username"));
        enterInput(password,PropertyReader.readKey("invalid_password"));
        clickElement(signButton);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return error_message.getText();

    }


}
