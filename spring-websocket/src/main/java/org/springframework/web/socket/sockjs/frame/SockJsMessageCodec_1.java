package org.springframework.web.socket.sockjs.frame;

import java.io.IOException;
import java.io.InputStream;
import org.springframework.lang.Nullable;

public interface SockJsMessageCodec_1 {
    String encode(String... messages);

    @Nullable
    String[] decode(String content) throws IOException;
}
