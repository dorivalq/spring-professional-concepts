package com.baeldung.componentscan.springapp.config;

import com.baeldung.componentscan.springapp.animals.Cat;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;



@EnableAutoConfiguration
@ComponentScan(basePackages ={ "com.baeldung.componentscan.springapp.animals"
//        ,"com.baeldung.componentscan.springapp.flowers"
})
//@ComponentScan(excludeFilters = @ComponentScan.Filter(type= FilterType.ASSIGNABLE_TYPE, value = Cat.class))
// TODO: was not excluding when only importing on app.main
// TODO: when defined base package as this one, config moves to here
@Configuration
public class AnimalsConfig {

    @Bean
    public Forest forest(){
        return new Forest();
    }
}

