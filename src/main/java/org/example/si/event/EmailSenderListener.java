package org.example.si.event;

import org.springframework.context.event.EventListener;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
public class EmailSenderListener{
    @EventListener
    @Order(0)
    public void onRegister(RegisterEvent event) {
        System.out.println("发送邮件");
    }
}
