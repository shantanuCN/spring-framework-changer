package org.springframework.jms.listener;

import org.springframework.context.SmartLifecycle;
import org.springframework.jms.support.QosSettings;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.destination.DestinationResolver;
import org.springframework.lang.Nullable;

public interface MessageListenerContainer_1 extends SmartLifecycle {
    @Nullable
    MessageConverter getMessageConverter();

    @Nullable
    DestinationResolver getDestinationResolver();

    boolean isReplyPubSubDomain();

    @Nullable
    QosSettings getReplyQosSettings();
}
