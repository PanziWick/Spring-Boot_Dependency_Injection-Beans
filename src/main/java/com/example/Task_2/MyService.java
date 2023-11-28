package com.example.Task_2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    @Value("${Task_2.title}")

    private  String appTitle;
    public String getAppTitle() {
        return appTitle;
    }
    public String getWelcomeMessage() {
        return "Welcome to " + MyAppConfig.getTitle();
    }
}
