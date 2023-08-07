package org.example.si.beanPostProcessor;

import org.springframework.stereotype.Component;

/**
 * @author 22139
 */
public class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
