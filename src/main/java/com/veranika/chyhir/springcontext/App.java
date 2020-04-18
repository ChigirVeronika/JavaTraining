package com.veranika.chyhir.springcontext;

import com.veranika.chyhir.jmx.Cat;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    private static final Logger LOG = Logger.getLogger(App.class);

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Cat catPunny = (Cat) context.getBean("catPunny");
        LOG.info(catPunny.getName() + " " + catPunny.getAge());
    }
}
