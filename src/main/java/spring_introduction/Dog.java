package spring_introduction;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Dog implements Pet {


    Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

    @PostConstruct
    public void init() {
        System.out.println("Create method init");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Create method destroy");
    }
}


