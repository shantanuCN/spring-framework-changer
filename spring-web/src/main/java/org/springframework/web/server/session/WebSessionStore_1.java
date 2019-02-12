package org.springframework.web.server.session;

import reactor.core.publisher.Mono;
import org.springframework.web.server.WebSession;

public interface WebSessionStore_1 {
    Mono<WebSession> createWebSession();

    Mono<WebSession> retrieveSession(String sessionId);

    Mono<Void> removeSession(String sessionId);
}
