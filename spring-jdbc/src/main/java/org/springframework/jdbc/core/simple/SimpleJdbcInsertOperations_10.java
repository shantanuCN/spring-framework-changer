package org.springframework.jdbc.core.simple;

import java.util.Map;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.KeyHolder;

public interface SimpleJdbcInsertOperations_10 {
    int execute(Map<String, ?> args);

    int execute(SqlParameterSource parameterSource);
}
