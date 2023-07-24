package org.example.si;

import org.example.si.event.RegisterService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Event {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("org.example.si.event");
        var service = context.getBean(RegisterService.class);
        service.register("sihua");
    }
}
