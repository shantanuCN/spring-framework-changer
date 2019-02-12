package org.springframework.web.reactive.socket;

import java.util.Map;
import java.util.function.Function;
import org.reactivestreams.Publisher;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.core.io.buffer.DataBufferFactory;

public interface WebSocketSession_2 {
    default Mono<Void> close() {
        return close(CloseStatus.NORMAL);
    }

    Mono<Void> close(CloseStatus status);
}
