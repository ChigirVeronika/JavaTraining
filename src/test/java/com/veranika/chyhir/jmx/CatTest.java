package com.veranika.chyhir.jmx;

import org.apache.log4j.Logger;
import org.junit.Test;

import javax.management.MBeanServer;
import javax.management.ObjectName;
import java.lang.management.ManagementFactory;

public class CatTest {

    private static final Logger LOG = Logger.getLogger(CatTest.class);

    @Test
    public void testCat() {
        Cat cat = new Cat("Bunny");
        cat.meow();
    }

    @Test
    public void testMBean() throws Exception {
        Cat cat = new Cat("Sunny");
        MBeanServer platformMBeanServer = ManagementFactory.getPlatformMBeanServer();
        ObjectName objectName = new ObjectName("com.veranika.chyhir.jmx", "type", "Cat");

        platformMBeanServer.registerMBean(cat, objectName);

//        LOG.info("Waiting...");
//        Thread.sleep(Long.MAX_VALUE);
    }
}