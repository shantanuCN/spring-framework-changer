/*
 * Copyright 2002-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.jms.listener;

import org.springframework.context.SmartLifecycle;
import org.springframework.jms.listener.MessageListenerContainer_2;
import org.springframework.jms.listener.MessageListenerContainer_1;
import org.springframework.jms.support.QosSettings;
import org.springframework.jms.support.converter.MessageConverter;
import org.springframework.jms.support.destination.DestinationResolver;
import org.springframework.lang.Nullable;

/**
 * Internal abstraction used by the framework representing a message
 * listener container. Not meant to be implemented externally with
 * support for both JMS and JCA style containers.
 *
 * @author Stephane Nicoll
 * @since 4.1
 */
public interface MessageListenerContainer extends SmartLifecycle, MessageListenerContainer_2, MessageListenerContainer_1 {

	/**
	 * Return whether the Publish/Subscribe domain ({@link javax.jms.Topic Topics}) is used.
	 * Otherwise, the Point-to-Point domain ({@link javax.jms.Queue Queues}) is used.
	 */
	boolean isPubSubDomain();

}
