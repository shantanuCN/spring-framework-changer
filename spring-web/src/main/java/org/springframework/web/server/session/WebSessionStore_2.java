package org.springframework.web.server.session;

import reactor.core.publisher.Mono;
import org.springframework.web.server.WebSession;

public interface WebSessionStore_2 {
    Mono<WebSession> updateLastAccessTime(WebSession webSession);
}
