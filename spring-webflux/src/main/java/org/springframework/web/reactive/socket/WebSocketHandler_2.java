package org.springframework.web.reactive.socket;

import java.util.Collections;
import java.util.List;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Mono;

public interface WebSocketHandler_2 {
    default List<String> getSubProtocols() {
        return Collections.emptyList();
    }
}
