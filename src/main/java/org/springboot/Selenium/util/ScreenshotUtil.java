package org.springboot.Selenium.util;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;

@Component @Lazy
public class ScreenshotUtil {
    @Autowired
    private WebDriver driver;
    @Value("${screenshot.path}")
    private Path path;
    public void takeScreenshot(String name) throws IOException {
        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileHandler.copy(src,path.resolve(name +".png").toFile());

    }
}
