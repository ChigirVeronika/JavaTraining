package com.veranika.chyhir.springcontext;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;
import org.springframework.context.support.GenericApplicationContext;

public class PropertyFileApplicationContext extends GenericApplicationContext {

    private static final Logger LOG = Logger.getLogger(PropertyFileApplicationContext.class);

    public PropertyFileApplicationContext(String fileName) {
        PropertiesBeanDefinitionReader reader = new PropertiesBeanDefinitionReader(this);
        int i = reader.loadBeanDefinitions(fileName);
        LOG.info("found " + i + " beans");
        refresh();
    }
}
