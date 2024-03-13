package org.springboot.Selenium.pages.google;

import org.openqa.selenium.WebDriver;
import org.springboot.Selenium.annotations.Page;
import org.springboot.Selenium.pages.BasePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class GooglePage extends BasePage {
    @Autowired
    private SearchComponent searchComponent;
    @Autowired
    private SearchResult searchResult;
    @Value("${app.URL}")
    private String url;
    public SearchComponent getSearchComponent() {
        return searchComponent;
    }
    public SearchResult getSearchResult() {
        return searchResult;
    }
    public void navigateTo(){
        this.driver.get(url);
    }
    @Override
    public boolean isLoaded() {
        return searchComponent.isLoaded();
    }
    public void closeApp(){
        this.driver.quit();
    }
}
