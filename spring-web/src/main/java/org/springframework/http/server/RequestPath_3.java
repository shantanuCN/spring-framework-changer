package org.springframework.http.server;

import java.net.URI;
import org.springframework.lang.Nullable;

public interface RequestPath_3 extends PathContainer {
    static RequestPath parse(URI uri, @Nullable String contextPath) {
        return new DefaultRequestPath(uri, contextPath);
    }
}
