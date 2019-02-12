package org.springframework.jdbc.core.simple;

import java.util.Map;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;

public interface SimpleJdbcCallOperations_6 {
    SimpleJdbcCallOperations returningResultSet(String parameterName, RowMapper<?> rowMapper);
}
