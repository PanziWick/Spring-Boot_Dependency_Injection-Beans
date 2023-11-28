package com.example.Task_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class MyAppConfig {
    @Bean(name = "studentBean")
    public Student student(){
        return new Student("John");
    }
    @Autowired
    private static Environment environment;

    public MyAppConfig(Environment environment) {
        this.environment = environment;
    }  //constructor

    public static String getTitle() {
        return environment.getProperty("Task_2.title");
    }
}
