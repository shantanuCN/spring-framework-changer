package org.springframework.beans.factory;

public interface SmartFactoryBean_2<T> extends FactoryBean<T> {
    default boolean isPrototype() {
        return false;
    }
}
