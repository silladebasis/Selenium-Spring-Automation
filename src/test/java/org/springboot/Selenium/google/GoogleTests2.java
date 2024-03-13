package org.springboot.Selenium.google;


import org.springboot.Selenium.annotations.LazyAutowired;
import org.springboot.Selenium.pages.google.GooglePage;
import org.springboot.Selenium.util.ScreenshotUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class GoogleTests2 extends SpringTestNgTest{
    @LazyAutowired
    private GooglePage googlePage;
    @LazyAutowired
    private ScreenshotUtil screenshotUtil;
    @Test
    public void test_google() throws IOException {
        googlePage.navigateTo();
        Assert.assertTrue(googlePage.isLoaded());
        googlePage.getSearchComponent().search("Cucumber");
        Assert.assertTrue(googlePage.getSearchResult().isLoaded());
        Assert.assertTrue(googlePage.getSearchResult().getResultsCount()>2);
        screenshotUtil.takeScreenshot("googleTest2");
        googlePage.closeApp();
    }

}
