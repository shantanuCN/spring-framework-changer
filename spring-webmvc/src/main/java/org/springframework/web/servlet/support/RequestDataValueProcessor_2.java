package org.springframework.web.servlet.support;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.lang.Nullable;

public interface RequestDataValueProcessor_2 {
    String processUrl(HttpServletRequest request, String url);
}
