package com.veranika.chyhir.springcontext;

import com.veranika.chyhir.jmx.Cat;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PropertyFileApplicationContextTest {

    @Test
    public void test() {
        PropertyFileApplicationContext context = new PropertyFileApplicationContext("spring.properties");
        Cat cat1 = context.getBean("cat1", Cat.class);
        assertEquals(5, cat1.getAge());
        assertEquals("Pink", cat1.getName());
        cat1.sleep();

        Cat cat2 = context.getBean("cat2", Cat.class);
        assertEquals(8, cat2.getAge());
        assertEquals("Black", cat2.getName());
        cat2.eat();
    }

}