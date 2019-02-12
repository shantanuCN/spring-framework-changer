package org.springframework.beans.factory.config;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.lang.Nullable;

public interface Scope_1 {
    @Nullable
    Object resolveContextualObject(String key);
}
