package org.springframework.web.servlet.support;

import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import org.springframework.lang.Nullable;

public interface RequestDataValueProcessor_1 {
    String processFormFieldValue(HttpServletRequest request, @Nullable String name, String value, String type);
}
