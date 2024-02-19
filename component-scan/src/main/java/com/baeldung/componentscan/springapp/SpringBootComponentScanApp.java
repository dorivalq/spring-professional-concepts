package com.baeldung.componentscan.springapp;

import com.baeldung.componentscan.springapp.animals.Cat;
import com.baeldung.componentscan.springapp.config.AnimalsConfig;
import com.baeldung.componentscan.springapp.config.Forest;
import com.baeldung.componentscan.springapp.flowers.Rose;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@ComponentScan(basePackages = "com.baeldung.componentscan.springapp.config" )
//@Import(AnimalsConfig.class)
//@ComponentScan(basePackages = {"com.baeldung.componentscan.springapp.animals","com.baeldung.componentscan.springapp.flowers"})
//@ComponentScan(basePackages = "com.baeldung.componentscan.springapp.animals,com.baeldung.componentscan.springapp.flowers")
//@ComponentScan(basePackages = "com.baeldung.componentscan.springapp.animals com.baeldung.componentscan.springapp.flowers")
//@ComponentScan(basePackages = "com.baeldung.componentscan.springapp.animals;com.baeldung.componentscan.springapp.flowers")
//@ComponentScan(excludeFilters = @ComponentScan.Filter(type=FilterType.REGEX, pattern = "com\\.baeldung\\.componentscan\\.springapp\\.flowers\\..*"))
//@ComponentScan(excludeFilters = @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = {Rose.class}))
public class SpringBootComponentScanApp {
    private static ApplicationContext applicationContext;

    @Bean
    public ExampleBean exampleBean() {
        return new ExampleBean();
    }

    private static Cat cat;
    private static Rose rose;
    private static Forest forest;

    public static void main(String[] args) {
        applicationContext =
          new AnnotationConfigApplicationContext(SpringBootComponentScanApp.class);
        checkBeansPresence(
                "cat", "dog", "rose", "exampleBean", "springBootComponentScanApp");
        cat = applicationContext.getBean(Cat.class);
        rose = applicationContext.getBean(Rose.class);
        forest = applicationContext.getBean(Forest.class);
        new SpringBootComponentScanApp().execute();
    }

    private static void checkBeansPresence(String... beans) {
        for (String beanName : beans) {
            System.out.println("Is " + beanName + " in ApplicationContext: " +
                    applicationContext.containsBean(beanName));
        }
    }

    private void execute() {
        System.out.println("Bean cat= " + cat.talk());
        System.out.println("Bean rose= " + rose.talk());
        System.out.println("Bean rose= " + forest.talk());
    }
}