package org.example.si.beanDefinitionRegistry;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author 22139
 */
@Configuration
@Import(PersonRegistrar.class)
public class BeanDefinitionConfiguration {
}
