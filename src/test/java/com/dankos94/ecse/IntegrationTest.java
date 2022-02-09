package com.dankos94.ecse;

import com.dankos94.ecse.ECommerceSmartEntertainmentApp;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Base composite annotation for integration tests.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@SpringBootTest(classes = ECommerceSmartEntertainmentApp.class)
public @interface IntegrationTest {
}
