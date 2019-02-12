package org.springframework.jdbc.core.simple;

import java.util.Map;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public interface SimpleJdbcCallOperations_2 {
    <T> T executeObject(Class<T> returnType, Object... args);

    <T> T executeObject(Class<T> returnType, Map<String, ?> args);

    <T> T executeObject(Class<T> returnType, SqlParameterSource args);
}
