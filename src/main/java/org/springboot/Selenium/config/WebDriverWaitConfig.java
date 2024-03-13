package org.springboot.Selenium.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springboot.Selenium.annotations.LazyConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.time.Duration;

@Configuration
public class WebDriverWaitConfig {
    @Value("${timeout:30}")
    private int timeOut;
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public WebDriverWait waitFor(WebDriver driver){
        return new WebDriverWait(driver, Duration.ofSeconds(timeOut));
    }
}
