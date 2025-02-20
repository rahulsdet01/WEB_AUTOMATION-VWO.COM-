package Tests.vwoTests;

import com.thetestingacademy.Base.CommonToAllTest;
import com.thetestingacademy.Pages.PageFactory.LoginPage_PF;

import com.thetestingacademy.driver.DriverManager;
import com.thetestingacademy.utilis.PropertyReader;
import org.openqa.selenium.WebDriver;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVWOLogin_PF extends CommonToAllTest {

    @Test
    public void testLoginNegativeVWO(){
        WebDriver driver = DriverManager.getDriver();
        driver.get(PropertyReader.readKey("url"));
        LoginPage_PF loginPage_PF = new LoginPage_PF(driver);
        String error_msg = loginPage_PF.loginToVWOInvalidCreds();
        Assert.assertEquals(error_msg, PropertyReader.readKey("error_message"));

    }
}

