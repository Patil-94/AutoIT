package com.bridgelabz.selenium.pages;

import com.bridgelabz.selenium.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.IOException;


public class UploadProfile extends Base {

    @FindBy(xpath ="//*[name()='path' and contains(@d,'M25.825 12')]")
    WebElement clickOnHome;

    @FindBy(xpath ="//span[contains(text(),'Photo/Video')]")
    WebElement clickOnPhotoBtn;


    public UploadProfile(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
    }

    public void uploadTO_Profile() throws InterruptedException, IOException {
        Thread.sleep(5000);
        clickOnHome.click();
        Thread.sleep(5000);
        clickOnPhotoBtn.click();
        Thread.sleep(5000);
        autoIt();
        Thread.sleep(4000);
    }

    private void autoIt() throws IOException {
        Runtime.getRuntime().exec("C:\\Users\\sachin\\Documents\\AutoItScript\\Auto1.exe");
    }
}
