package org.example.si.beanPostProcessor;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author 22139
 */
public class Dog extends Animal implements InitializingBean {
    @Override
    public String toString() {
        return "Dog{} " + super.toString();
    }

    public void initMethod() {
        System.out.println("initMethod");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("postConstruct");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("initializingBean");
    }
}
