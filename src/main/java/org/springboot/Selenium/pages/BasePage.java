package org.springboot.Selenium.pages;

import jakarta.annotation.PostConstruct;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BasePage {
    @Autowired
    protected WebDriver driver; // Spring will give the driver instance
    @Autowired
    protected WebDriverWait wait;
    @PostConstruct
    public void init(){
        PageFactory.initElements(this.driver,this);
    }
    public abstract boolean isLoaded();
}
