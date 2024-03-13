package org.springboot.Selenium.annotations;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
@Lazy
public @interface Page {
}
