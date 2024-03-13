package org.springboot.Selenium.google;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.testng.annotations.Test;

public class CrossBrowserTest extends SpringTestNgTest{
    @Autowired
    private ApplicationContext applicationContext;
    @Test
    public void crossBrowserTest(){
        WebDriver driverChrome = applicationContext.getBean("chromeDriver", WebDriver.class);
        driverChrome.get("https://www.google.com");

        WebDriver driverFirefox = applicationContext.getBean("chromeDriver", WebDriver.class);
        driverFirefox.get("https://www.yahoo.com");
    }
}
