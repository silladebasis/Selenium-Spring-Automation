package org.springboot.Selenium.pages.google;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springboot.Selenium.annotations.Page;
import org.springboot.Selenium.pages.BasePage;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class SearchComponent extends BasePage {
    @FindBy(name = "q")
    private WebElement searchBox;
    @FindBy(name = "btnK")
    private List<WebElement> searchBtn;

    public void search(String text){
        searchBox.sendKeys(text);
        searchBox.sendKeys(Keys.TAB);
        searchBtn.stream().filter(e -> e.isDisplayed() && e.isEnabled()).findFirst().ifPresent(WebElement::click);
    }

    @Override
    public boolean isLoaded() {
        return wait.until((d) -> searchBox.isDisplayed());
    }
}
