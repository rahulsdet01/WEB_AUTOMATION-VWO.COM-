package Tests.vwoTests;

import com.thetestingacademy.Base.CommonToAllTest;
import com.thetestingacademy.Pages.PageObjecModel.LoginPage_POM;
import com.thetestingacademy.driver.DriverManager;
import com.thetestingacademy.utilis.PropertyReader;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVWOLogin_POM extends CommonToAllTest {


    @Test
    public void testLoginNegativeVWO(){
        LoginPage_POM loginPagePom = new LoginPage_POM(DriverManager.getDriver());
        String error_msg_text = loginPagePom.loginToVWOInvalidCreds(PropertyReader.readKey("invalid_username"),PropertyReader.readKey("invalid_password") );
        Assert.assertEquals(error_msg_text,PropertyReader.readKey("error_message"));
    }


}
