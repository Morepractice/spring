package org.example.si.beanPostProcessor.beanFactory;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

/**
 * @author 22139
 */
@Component
public class Hen implements FactoryBean<Egg> {
    @Override
    public Egg getObject() throws Exception {
        return new Egg();
    }

    @Override
    public Class<?> getObjectType() {
        return Egg.class;
    }
}
