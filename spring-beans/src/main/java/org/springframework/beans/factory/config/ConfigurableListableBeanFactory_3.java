package org.springframework.beans.factory.config;

import java.util.Iterator;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.ListableBeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.lang.Nullable;

public interface ConfigurableListableBeanFactory_3
        extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {
    void ignoreDependencyType(Class<?> type);
}
