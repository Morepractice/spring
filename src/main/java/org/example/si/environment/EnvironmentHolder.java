package org.example.si.environment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author 22139
 */
@Component
public class EnvironmentHolder implements EnvironmentAware {
    private Environment environment;

    public Environment getEnvironment() {
        return environment;
    }

    public void printEnvironmentMessage() {
        System.out.println(Arrays.toString(this.environment.getDefaultProfiles()));
        System.out.println(this.environment.getProperty("jdbc.url"));
    }

    @Override
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }
}
