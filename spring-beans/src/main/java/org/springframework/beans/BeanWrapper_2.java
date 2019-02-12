package org.springframework.beans;

import java.beans.PropertyDescriptor;

public interface BeanWrapper_2 extends ConfigurablePropertyAccessor {
    Object getWrappedInstance();

    Class<?> getWrappedClass();

    PropertyDescriptor[] getPropertyDescriptors();

    PropertyDescriptor getPropertyDescriptor(String propertyName) throws InvalidPropertyException;
}
