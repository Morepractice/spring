package org.example.si.environment;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author 22139
 */
@Configuration
@ComponentScan("org.example.si.environment")
@PropertySource("propertysource/jdbc.properties")
public class EnvironmentConfiguration {
}
