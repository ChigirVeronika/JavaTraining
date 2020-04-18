package com.veranika.chyhir.jmx;

import org.apache.log4j.Logger;

public class Cat implements CatMBean {

    private static final Logger LOG = Logger.getLogger(Cat.class);

    private int age;
    private String name;

    public Cat() {
    }

    public Cat(String name) {
        this.name = name;
    }

    public void meow() {
        LOG.info(name + " meows");
    }

    public void eat() {
        LOG.info(name + " eats");
    }

    public void sleep() {
        LOG.info(name + " sleeps");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
