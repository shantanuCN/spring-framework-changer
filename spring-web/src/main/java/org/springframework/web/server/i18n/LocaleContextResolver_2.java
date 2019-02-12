package org.springframework.web.server.i18n;

import org.springframework.context.i18n.LocaleContext;
import org.springframework.lang.Nullable;
import org.springframework.web.server.ServerWebExchange;

public interface LocaleContextResolver_2 {
    void setLocaleContext(ServerWebExchange exchange, @Nullable LocaleContext localeContext);
}
