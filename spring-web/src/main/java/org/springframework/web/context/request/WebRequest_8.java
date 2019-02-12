package org.springframework.web.context.request;

import java.security.Principal;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.springframework.lang.Nullable;

public interface WebRequest_8 extends RequestAttributes {
    @Nullable
    Principal getUserPrincipal();
}
