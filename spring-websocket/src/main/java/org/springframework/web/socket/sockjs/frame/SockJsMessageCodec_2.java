package org.springframework.web.socket.sockjs.frame;

import java.io.IOException;
import java.io.InputStream;
import org.springframework.lang.Nullable;

public interface SockJsMessageCodec_2 {
    @Nullable
    String[] decodeInputStream(InputStream content) throws IOException;
}
