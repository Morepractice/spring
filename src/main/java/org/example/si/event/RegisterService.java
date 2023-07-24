package org.example.si.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

@Service
public class RegisterService implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void register(String username){
        System.out.println("注册成功s");
        applicationEventPublisher.publishEvent(new RegisterEvent(username));
    }
}
