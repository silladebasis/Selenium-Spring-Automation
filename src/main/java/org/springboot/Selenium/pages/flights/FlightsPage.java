package org.springboot.Selenium.pages.flights;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springboot.Selenium.annotations.Page;
import org.springboot.Selenium.pages.BasePage;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Page
public class FlightsPage extends BasePage {
    @FindBy(css = "nav span")
    private List<WebElement> topMenuElements;
    @Override
    public boolean isLoaded() {
        return wait.until((driver) -> !topMenuElements.isEmpty());
    }
    public List<String> getMenuElementsLabel(){
        return topMenuElements.stream().map(WebElement::getText).map(String::trim).collect(Collectors.toList());
    }
    public void navigateTo(String url){
        driver.get(url);
        driver.manage().window().maximize();
    }
}
