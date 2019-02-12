package org.springframework.jdbc.core.simple;

import java.util.Map;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.KeyHolder;

public interface SimpleJdbcInsertOperations_1 {
    @SuppressWarnings("unchecked")
    int[] executeBatch(Map<String, ?>... batch);

    int[] executeBatch(SqlParameterSource... batch);
}
