package org.springboot.Selenium.pages.google;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springboot.Selenium.annotations.Page;
import org.springboot.Selenium.pages.BasePage;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class SearchResult extends BasePage {
    @FindBy(css = "div.g")
    private List<WebElement>results;
    public int getResultsCount(){
        return results.size();
    }
    @Override
    public boolean isLoaded() {
        return wait.until((d) -> !results.isEmpty());
    }
}
