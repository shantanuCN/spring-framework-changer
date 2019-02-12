package org.springframework.jdbc.core.simple;

import java.util.Map;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.KeyHolder;

public interface SimpleJdbcInsertOperations_2 {
    KeyHolder executeAndReturnKeyHolder(Map<String, ?> args);

    KeyHolder executeAndReturnKeyHolder(SqlParameterSource parameterSource);
}
