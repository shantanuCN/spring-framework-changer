package org.springframework.web.context.request;

import java.security.Principal;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.springframework.lang.Nullable;

public interface WebRequest_1 extends RequestAttributes {
    @Nullable
    String getHeader(String headerName);

    @Nullable
    String[] getHeaderValues(String headerName);

    Iterator<String> getHeaderNames();

    Map<String, String[]> getParameterMap();

    boolean checkNotModified(long lastModifiedTimestamp);

    boolean checkNotModified(String etag);

    boolean checkNotModified(@Nullable String etag, long lastModifiedTimestamp);

    String getDescription(boolean includeClientInfo);
}
