package com.qiuran.service;

import org.springframework.stereotype.Component;

@Component
public class WelcomeService {
    public String retrieveWelcomeMessage() {
        return "Welcome Message";
    }
}