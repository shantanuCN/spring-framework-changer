package org.springframework.web.server;

import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import reactor.core.publisher.Mono;
import org.springframework.lang.Nullable;
import org.springframework.util.Assert;

public interface WebSession_2 {
    Map<String, Object> getAttributes();

    @SuppressWarnings("unchecked")
    @Nullable
    default <T> T getAttribute(String name) {
        return (T) getAttributes().get(name);
    }

    @SuppressWarnings("unchecked")
    default <T> T getRequiredAttribute(String name) {
        T value = getAttribute(name);
        Assert.notNull(value, () -> "Required attribute '" + name + "' is missing.");
        return value;
    }

    @SuppressWarnings("unchecked")
    default <T> T getAttributeOrDefault(String name, T defaultValue) {
        return (T) getAttributes().getOrDefault(name, defaultValue);
    }
}
