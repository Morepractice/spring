package org.example.si;

import org.example.si.beanDefinitionRegistry.BeanDefinitionConfiguration;
import org.example.si.beanDefinitionRegistry.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author 22139
 */
public class BeanDefinitionRegistrarApplication {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(BeanDefinitionConfiguration.class);
        var bean = context.getBean(Person.class);
        System.out.println(bean);
    }
}
