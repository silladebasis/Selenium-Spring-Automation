package org.springboot.Selenium.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springboot.Selenium.annotations.LazyConfiguration;
import org.springboot.Selenium.annotations.ThreadScopeBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.*;

@Configuration
public class DriverManager {
    //@Primary // use this annotation to inject the bean uniquely whenever there are multiple beans
    @ThreadScopeBean
    @ConditionalOnProperty(name = "browserName",havingValue = "chrome")
    //@ConditionalOnMissingBean
    public WebDriver chromeDriver(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }
    @ThreadScopeBean
    @ConditionalOnProperty(name = "browserName",havingValue = "firefox")
    public WebDriver firefoxDriver(){
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

}
