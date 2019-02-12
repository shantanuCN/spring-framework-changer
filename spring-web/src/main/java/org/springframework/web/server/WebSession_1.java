package org.springframework.web.server;

import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import reactor.core.publisher.Mono;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;

public interface WebSession_1 {
    String getId();

    boolean isStarted();

    Mono<Void> save();

    boolean isExpired();
}
