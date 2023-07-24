package org.example.si.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SmsSenderListener implements ApplicationListener<RegisterEvent> {
    @Override
    public void onApplicationEvent(RegisterEvent event) {
        System.out.println("发送短信");
    }
}
