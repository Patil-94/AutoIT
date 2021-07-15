package com.bridgelabz.selenium.pages;
import com.bridgelabz.selenium.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends Base {

    /** Description - Using FindBy for locating elements */

    @FindBy(id = "email")
    WebElement userEmailID;

    @FindBy(name = "pass")
    WebElement userPassword;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginBtn;


    /** create a parameterized constuctor.
            initialization */

    public Login(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void loginTo_Application() throws InterruptedException {

        userEmailID.sendKeys("latikakhairnar10@gmail.com");
        Thread.sleep(500);
        userPassword.sendKeys("latika@123");
        Thread.sleep(500);
        loginBtn.click();
        Thread.sleep(2000);
    }

}
