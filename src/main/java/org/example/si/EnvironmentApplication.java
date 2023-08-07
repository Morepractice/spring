package org.example.si;

import org.example.si.environment.EnvironmentHolder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * @author 22139
 */
public class EnvironmentApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.example.si.environment");
        var environmentHolder = context.getBean(EnvironmentHolder.class);
        environmentHolder.printEnvironmentMessage();
        System.out.println(Arrays.toString(context.getBeanDefinitionNames()));
    }
}
