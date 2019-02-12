package org.springframework.beans.factory.support;

import org.springframework.beans.factory.BeanDefinitionStoreException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.core.AliasRegistry;

public interface BeanDefinitionRegistry_2 extends AliasRegistry {
    boolean isBeanNameInUse(String beanName);
}
