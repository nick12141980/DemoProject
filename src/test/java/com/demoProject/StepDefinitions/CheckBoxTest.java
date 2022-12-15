package com.demoProject.StepDefinitions;

import com.demoProject.pages.CheckBoxPage;
import com.demoProject.utilities.Driver;
import org.junit.Assert;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

public class CheckBoxTest {

    CheckBoxPage checkBoxPage = new CheckBoxPage();

    @Test
    public void checkBoxTest() throws InterruptedException {
        Driver.getDriver().get("http://localhost:7080/checkboxes");
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        checkBoxPage.checkBox1.click();
        //Assert.assertTrue(checkBoxPage.checkBox1.isSelected());
        Thread.sleep(2000);
        Assert.assertTrue(checkBoxPage.checkBox2.isSelected());
        checkBoxPage.checkBox2.click();
        Assert.assertFalse(checkBoxPage.checkBox2.isSelected());
        Thread.sleep(2000);

        Driver.getDriver().close();
    }
}
