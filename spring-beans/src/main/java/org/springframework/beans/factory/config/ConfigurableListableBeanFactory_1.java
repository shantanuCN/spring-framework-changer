package org.springframework.beans.factory.config;

import java.util.Iterator;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.lang.Nullable;

public interface ConfigurableListableBeanFactory_1
        extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {
    BeanDefinition getBeanDefinition(String beanName) throws NoSuchBeanDefinitionException;

    void clearMetadataCache();
}
