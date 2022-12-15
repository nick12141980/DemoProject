package com.demoProject.pages;

import com.demoProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage {

    public CheckBoxPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//form[@id='checkboxes'])[1]")
    public WebElement checkBox1;

    @FindBy(xpath = "(//form[@id='checkboxes'])[1]//following::input[2]")
    public WebElement checkBox2;

}
