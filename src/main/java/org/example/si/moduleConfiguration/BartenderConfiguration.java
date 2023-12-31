package org.example.si.moduleConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("city")
public class BartenderConfiguration {
    @Bean
    public Bartender bartender1(){
        return new Bartender("001");
    }

    @Bean
    public Bartender bartender2(){
        return new Bartender("002");
    }
}
