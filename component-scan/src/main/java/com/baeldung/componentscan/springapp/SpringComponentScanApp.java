//package com.baeldung.componentscan.springapp;
//
//import com.baeldung.componentscan.springapp.animals.Cat;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//@ComponentScan(basePackages = "com.baeldung.componentscan.springapp.animals")
//public class SpringComponentScanApp {
//    private static ApplicationContext applicationContext;
//
//    @Bean
//    public ExampleBean exampleBean() {
//        return new ExampleBean();
//    }
//
//    private static Cat cat;
//
//    public static void main(String[] args) {
//        applicationContext =
//          new AnnotationConfigApplicationContext(SpringComponentScanApp.class);
//
//        for (String beanName : applicationContext.getBeanDefinitionNames()) {
//            System.out.println(beanName);
//        }
//
//        cat = applicationContext.getBean(Cat.class);
//       new SpringComponentScanApp().execute();
//    }
//
//    private void execute() {
//        System.out.println("Bean cat= " + cat.talk());
//    }
//}