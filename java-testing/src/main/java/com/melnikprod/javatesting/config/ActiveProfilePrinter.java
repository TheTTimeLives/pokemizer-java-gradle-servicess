package com.melnikprod.javatesting.config;

import org.springframework.context.ApplicationListener;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.env.Profiles;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;

public class ActiveProfilePrinter implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {
    @Override
    public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
        ConfigurableEnvironment environment = event.getEnvironment();
        for (String profile : environment.getActiveProfiles()) {
            System.out.println("Currently active profile: " + profile);
        }
    }
}
