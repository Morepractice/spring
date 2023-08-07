package org.example.si.beanPostProcessor;


import org.springframework.stereotype.Component;

/**
 * @author 22139
 */
@Component
public class Cat extends Animal{

    @Override
    public String toString() {
        return "Cat{} " + super.toString();
    }
}
