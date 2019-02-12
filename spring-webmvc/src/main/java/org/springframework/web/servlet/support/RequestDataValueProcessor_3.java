package org.springframework.web.servlet.support;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.lang.Nullable;

public interface RequestDataValueProcessor_3 {
    String processAction(HttpServletRequest request, String action, String httpMethod);

    @Nullable
    Map<String, String> getExtraHiddenFields(HttpServletRequest request);
}
