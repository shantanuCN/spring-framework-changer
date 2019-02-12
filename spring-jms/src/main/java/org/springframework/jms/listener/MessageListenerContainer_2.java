package org.springframework.jms.listener;

import org.springframework.context.SmartLifecycle;
import org.springframework.jms.support.QosSettings;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.destination.DestinationResolver;
import org.springframework.lang.Nullable;

public interface MessageListenerContainer_2 extends SmartLifecycle {
    void setupMessageListener(Object messageListener);
}
