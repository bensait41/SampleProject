package com.global.UITests.pages;

import com.global.UITests.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class MainPage{
    public MainPage() {
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(tagName = "article")
    public List<WebElement> songsInPlaylist;

    @FindBy(xpath = "//div[@itemprop='name']")
    public List<WebElement> songNamesElements;

    public int getTheNumberOfSongsInPlaylist(){
           return songsInPlaylist.size();
    }










}
