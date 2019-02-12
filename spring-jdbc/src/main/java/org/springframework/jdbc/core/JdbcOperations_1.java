package org.springframework.jdbc.core;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.lang.Nullable;

public interface JdbcOperations_1 {
    int[] batchUpdate(String... sql) throws DataAccessException;

    int[] batchUpdate(String sql, BatchPreparedStatementSetter pss) throws DataAccessException;

    int[] batchUpdate(String sql, List<Object[]> batchArgs) throws DataAccessException;

    int[] batchUpdate(String sql, List<Object[]> batchArgs, int[] argTypes) throws DataAccessException;

    <T> int[][] batchUpdate(String sql, Collection<T> batchArgs, int batchSize,
            ParameterizedPreparedStatementSetter<T> pss) throws DataAccessException;
}
