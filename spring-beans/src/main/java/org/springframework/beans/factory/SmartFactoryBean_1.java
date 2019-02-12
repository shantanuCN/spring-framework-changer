package org.springframework.beans.factory;

public interface SmartFactoryBean_1<T> extends FactoryBean<T> {
    default boolean isEagerInit() {
        return false;
    }
}
