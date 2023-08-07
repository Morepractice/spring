package org.example.si.beanDefinitionRegistry;

import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @author 22139
 */
public class PersonRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        registry.registerBeanDefinition("person",
                BeanDefinitionBuilder.genericBeanDefinition(Person.class)
                        .addPropertyValue("name", "张三")
                        .getBeanDefinition());
    }
}
