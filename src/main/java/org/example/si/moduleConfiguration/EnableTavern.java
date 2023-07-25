package org.example.si.moduleConfiguration;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author 22139
 */
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import({BartenderConfiguration.class, BarImportSelector.class, WaiterRegistrar.class})
public @interface EnableTavern {
}
