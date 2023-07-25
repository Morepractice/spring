package org.example.si.moduleConfiguration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@ComponentScan
public class Bartender {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bartender(String name) {
        this.name = name;
    }
}
