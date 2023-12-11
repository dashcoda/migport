package com.migport.service;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class GreetingResourceService {

    public String greeting(String name) {
        return "hello " + name + "!!";
    }
}
