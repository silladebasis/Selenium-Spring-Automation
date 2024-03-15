package org.springboot.Selenium.flights;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
//@PropertySource("languages/flight_sp.properties")
@PropertySource("languages/${app.locale}.properties")
public class FlightAppDetails {
    @Value("${flights.app.url}")
    private String url;
    @Value("${flights.app.labels}")
    private List<String> labels;

    public String getUrl() {
        return url;
    }

    public List<String> getLabels() {
        return labels;
    }
}
