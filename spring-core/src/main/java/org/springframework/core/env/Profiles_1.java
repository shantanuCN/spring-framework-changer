package org.springframework.core.env;

import java.util.function.Predicate;

public interface Profiles_1 {
    boolean matches(Predicate<String> activeProfiles);
}
