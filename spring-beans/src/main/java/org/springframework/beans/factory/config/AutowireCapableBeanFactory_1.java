package org.springframework.beans.factory.config;

import java.util.Set;
import org.springframework.beans.BeansException;
import org.springframework.beans.TypeConverter;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.lang.Nullable;

public interface AutowireCapableBeanFactory_1 extends BeanFactory {
    <T> T createBean(Class<T> beanClass) throws BeansException;

    Object configureBean(Object existingBean, String beanName) throws BeansException;

    Object createBean(Class<?> beanClass, int autowireMode, boolean dependencyCheck) throws BeansException;

    Object autowire(Class<?> beanClass, int autowireMode, boolean dependencyCheck) throws BeansException;

    void autowireBeanProperties(Object existingBean, int autowireMode, boolean dependencyCheck) throws BeansException;

    void applyBeanPropertyValues(Object existingBean, String beanName) throws BeansException;

    Object initializeBean(Object existingBean, String beanName) throws BeansException;

    void destroyBean(Object existingBean);
}
