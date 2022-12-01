package com.demoProject.pages;

import com.demoProject.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public MainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="searchInput")
    public WebElement searchBox;

    @FindBy(xpath = "//i[@class='sprite svg-search-icon']")
    public WebElement searchButton;


}
