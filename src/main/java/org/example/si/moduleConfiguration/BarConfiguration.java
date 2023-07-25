package org.example.si.moduleConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BarConfiguration {
//    @Conditional({ExistBossCondition.class})
    @OnBeanConditional(Boss.class)
    @Bean
    public Bar bar001(){
        return new Bar();
    }
}
