package org.springboot.Selenium.Misc;

import org.springboot.Selenium.google.SpringTestNgTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.Properties;

public class PropsTest extends SpringTestNgTest {
    @Autowired
    ResourceLoader loader;
    @Test
    public void readValuesFromProperties() throws IOException {
        Properties properties = PropertiesLoaderUtils.loadProperties(loader.getResource("data.properties"));
        System.out.println(properties.getProperty("username"));
    }
}
