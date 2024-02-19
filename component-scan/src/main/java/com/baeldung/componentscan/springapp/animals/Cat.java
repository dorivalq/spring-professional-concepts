package com.baeldung.componentscan.springapp.animals;

import org.springframework.stereotype.Component;

// ...
@Component
public class Cat {
    public String talk() {
        return "Meauuuu";
    }
}