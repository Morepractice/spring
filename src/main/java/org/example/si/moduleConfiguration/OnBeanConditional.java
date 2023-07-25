package org.example.si.moduleConfiguration;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * @author 22139
 */
@Documented
@Conditional({BeanOnCondition.class})
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface OnBeanConditional {
    String[] beanNames() default {};

    Class<?>[] value() default {};
}
