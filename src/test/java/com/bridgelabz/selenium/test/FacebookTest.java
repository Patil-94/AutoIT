package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.Base;
import com.bridgelabz.selenium.pages.Login;
import com.bridgelabz.selenium.pages.UploadProfile;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class FacebookTest extends Base {
    /** test for Login Page
    and also check actual result and expected result */
    @Test
    public void loginTo_Application_with_valid_credentials() throws InterruptedException, IOException {

        //create object of Login Class
        Login login=new Login(driver);
        login.loginTo_Application();

        //validation
        String actualUrl= driver.getCurrentUrl();
        String expected="https://www.facebook.com/?sk=welcome";
        System.out.println(actualUrl);
        Assert.assertEquals(actualUrl,expected);
    }

    @Test
    public void uploadFile() throws InterruptedException, IOException {

        //create object of Login Class
        Login login=new Login(driver);
        login.loginTo_Application();

        UploadProfile uploadProfile =new UploadProfile(driver);
        uploadProfile.uploadTO_Profile();
    }
}
