package org.example.si.event;

import org.springframework.context.ApplicationEvent;

public class RegisterEvent extends ApplicationEvent {
    public RegisterEvent(Object source) {
        super(source);
    }
}
