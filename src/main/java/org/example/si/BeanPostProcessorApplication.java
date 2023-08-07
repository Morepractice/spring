package org.example.si;

import org.example.si.beanPostProcessor.Dog;
import org.example.si.beanPostProcessor.beanFactory.Egg;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 22139
 */
public class BeanPostProcessorApplication {
    public static void main(String[] args) {
        /*var context = new AnnotationConfigApplicationContext("org.example.si.beanPostProcessor");*/

        /*var context = new ClassPathXmlApplicationContext("processor/processor.xml");
        var dog = context.getBean(Dog.class);

        System.out.println(dog);*/

        var context = new AnnotationConfigApplicationContext("org.example.si.beanPostProcessor.beanFactory");
        var egg = context.getBean(Egg.class);
        System.out.println(egg);
    }
}
