package org.example.si;

import org.example.si.moduleConfiguration.Boss;
import org.example.si.moduleConfiguration.TavernConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

public class ImportApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext cxt = new AnnotationConfigApplicationContext();
        /*cxt.getEnvironment().addActiveProfile("city");*/
        cxt.register(TavernConfiguration.class);
        cxt.refresh();

        Stream.of(cxt.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
