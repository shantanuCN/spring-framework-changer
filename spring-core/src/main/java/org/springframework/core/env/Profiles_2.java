package org.springframework.core.env;

import java.util.function.Predicate;

public interface Profiles_2 {
    static Profiles of(String... profiles) {
        return ProfilesParser.parse(profiles);
    }
}
