package org.springframework.ui;

import java.util.Collection;
import java.util.Map;
import org.springframework.lang.Nullable;

public interface Model_2 {
    Model addAttribute(String attributeName, @Nullable Object attributeValue);

    Model addAttribute(Object attributeValue);

    Model addAllAttributes(Collection<?> attributeValues);

    Model addAllAttributes(Map<String, ?> attributes);
}
