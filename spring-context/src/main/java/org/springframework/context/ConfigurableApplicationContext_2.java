package org.springframework.context;

import java.io.Closeable;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ProtocolResolver;
import org.springframework.lang.Nullable;

public interface ConfigurableApplicationContext_2 extends ApplicationContext, Lifecycle, Closeable {
    void setId(String id);

    void setParent(@Nullable ApplicationContext parent);

    void setEnvironment(ConfigurableEnvironment environment);

    void addApplicationListener(ApplicationListener<?> listener);

    void refresh() throws BeansException, IllegalStateException;

    @Override
    void close();

    boolean isActive();
}
