package org.springframework.beans.factory.config;

import java.util.Set;
import org.springframework.beans.BeansException;
import org.springframework.beans.TypeConverter;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.lang.Nullable;

public interface AutowireCapableBeanFactory_4 extends BeanFactory {
    void autowireBean(Object existingBean) throws BeansException;
}
