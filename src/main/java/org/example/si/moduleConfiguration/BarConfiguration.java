package org.example.si.moduleConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {
    @Bean
    public Bar bar001(){
        return new Bar();
    }
}
