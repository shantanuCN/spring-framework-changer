/*
 * Copyright 2002-2018 the original author or authors.
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

package org.springframework.web.server;

import java.time.Duration;
import org.springframework.web.server.WebSession_1;
import java.time.Instant;
import org.springframework.web.server.WebSession_2;
import java.util.Map;

import reactor.core.publisher.Mono;

import org.springframework.lang.Nullable;
import org.springframework.util.Assert;

/**
 * Main contract for using a server-side session that provides access to session
 * attributes across HTTP requests.
 *
 * <p>The creation of a {@code WebSession} instance does not automatically start
 * a session thus causing the session id to be sent to the client (typically via
 * a cookie). A session starts implicitly when session attributes are added.
 * A session may also be created explicitly via {@link #start()}.
 *
 * @author Rossen Stoyanchev
 * @since 5.0
 */
public interface WebSession extends WebSession_2, WebSession_1 {

	/**
	 * Force the creation of a session causing the session id to be sent when
	 * {@link #save()} is called.
	 */
	void start();

	/**
	 * Generate a new id for the session and update the underlying session
	 * storage to reflect the new id. After a successful call {@link #getId()}
	 * reflects the new session id.
	 * @return completion notification (success or error)
	 */
	Mono<Void> changeSessionId();

	/**
	 * Invalidate the current session and clear session storage.
	 * @return completion notification (success or error)
	 */
	Mono<Void> invalidate();

	/**
	 * Return the time when the session was created.
	 */
	Instant getCreationTime();

	/**
	 * Return the last time of session access as a result of user activity such
	 * as an HTTP request. Together with {@link #getMaxIdleTime()
	 * maxIdleTimeInSeconds} this helps to determine when a session is
	 * {@link #isExpired() expired}.
	 */
	Instant getLastAccessTime();

	/**
	 * Configure the max amount of time that may elapse after the
	 * {@link #getLastAccessTime() lastAccessTime} before a session is considered
	 * expired. A negative value indicates the session should not expire.
	 */
	void setMaxIdleTime(Duration maxIdleTime);

	/**
	 * Return the maximum time after the {@link #getLastAccessTime()
	 * lastAccessTime} before a session expires. A negative time indicates the
	 * session doesn't expire.
	 */
	Duration getMaxIdleTime();

}
