package com.demoProject.StepDefinitions;

import com.demoProject.pages.LoginPage;
import com.demoProject.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class UnsuccessfulLoginTest {

    LoginPage loginPage = new LoginPage();

    @Test
    public void unsuccessfulLoginTest(){
        Driver.getDriver().get("http://localhost:7080/login");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        loginPage.username.sendKeys("123");
        loginPage.password.sendKeys("123");
        loginPage.loginButton.click();

        Assert.assertTrue(Driver.getDriver().getPageSource().contains("Your username is invalid!"));

        Driver.getDriver().close();
    }
}
