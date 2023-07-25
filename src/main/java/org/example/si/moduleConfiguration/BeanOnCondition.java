package org.example.si.moduleConfiguration;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Objects;

/**
 * @author 22139
 */
public class BeanOnCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        var map = metadata.getAnnotationAttributes(OnBeanConditional.class.getName());

        assert map != null;
        String[] beanNames = (String[])map.get("beanNames");
        for (var beanName :
                beanNames) {
            if(!Objects.requireNonNull(context.getBeanFactory()).containsBean(beanName)){
                return false;
            };
        }

        var classes = (Class<?> [])map.get("value");
        for (var value :
                classes) {
            if (!Objects.requireNonNull(context.getBeanFactory()).containsBean(value.getName())) {
                return false;
            }
        }

        return true;
    }
}
