package org.springframework.beans.factory.support;

import org.springframework.beans.factory.config.BeanPostProcessor;

public interface MergedBeanDefinitionPostProcessor_2 extends BeanPostProcessor {
    default void resetBeanDefinition(String beanName) {
    }
}
