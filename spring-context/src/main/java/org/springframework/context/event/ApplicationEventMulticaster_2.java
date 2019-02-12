package org.springframework.context.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.core.ResolvableType;
import org.springframework.lang.Nullable;

public interface ApplicationEventMulticaster_2 {
    void removeApplicationListener(ApplicationListener<?> listener);

    void removeApplicationListenerBean(String listenerBeanName);
}
