package org.springframework.jdbc.core;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.lang.Nullable;

public interface JdbcOperations_2 {
    @Nullable
    <T> T execute(ConnectionCallback<T> action) throws DataAccessException;

    @Nullable
    <T> T execute(StatementCallback<T> action) throws DataAccessException;

    void execute(String sql) throws DataAccessException;

    @Nullable
    <T> T query(String sql, ResultSetExtractor<T> rse) throws DataAccessException;

    void query(String sql, RowCallbackHandler rch) throws DataAccessException;

    <T> List<T> query(String sql, RowMapper<T> rowMapper) throws DataAccessException;

    int update(String sql) throws DataAccessException;

    @Nullable
    <T> T execute(PreparedStatementCreator psc, PreparedStatementCallback<T> action) throws DataAccessException;

    @Nullable
    <T> T execute(String sql, PreparedStatementCallback<T> action) throws DataAccessException;

    @Nullable
    <T> T query(PreparedStatementCreator psc, ResultSetExtractor<T> rse) throws DataAccessException;

    @Nullable
    <T> T query(String sql, @Nullable PreparedStatementSetter pss, ResultSetExtractor<T> rse)
            throws DataAccessException;

    @Nullable
    <T> T query(String sql, Object[] args, int[] argTypes, ResultSetExtractor<T> rse) throws DataAccessException;

    @Nullable
    <T> T query(String sql, Object[] args, ResultSetExtractor<T> rse) throws DataAccessException;

    @Nullable
    <T> T query(String sql, ResultSetExtractor<T> rse, @Nullable Object... args) throws DataAccessException;

    void query(PreparedStatementCreator psc, RowCallbackHandler rch) throws DataAccessException;

    void query(String sql, @Nullable PreparedStatementSetter pss, RowCallbackHandler rch) throws DataAccessException;

    void query(String sql, Object[] args, int[] argTypes, RowCallbackHandler rch) throws DataAccessException;

    void query(String sql, Object[] args, RowCallbackHandler rch) throws DataAccessException;

    void query(String sql, RowCallbackHandler rch, @Nullable Object... args) throws DataAccessException;

    <T> List<T> query(PreparedStatementCreator psc, RowMapper<T> rowMapper) throws DataAccessException;

    <T> List<T> query(String sql, @Nullable PreparedStatementSetter pss, RowMapper<T> rowMapper)
            throws DataAccessException;

    <T> List<T> query(String sql, Object[] args, int[] argTypes, RowMapper<T> rowMapper) throws DataAccessException;

    <T> List<T> query(String sql, Object[] args, RowMapper<T> rowMapper) throws DataAccessException;

    <T> List<T> query(String sql, RowMapper<T> rowMapper, @Nullable Object... args) throws DataAccessException;

    int update(PreparedStatementCreator psc) throws DataAccessException;

    int update(PreparedStatementCreator psc, KeyHolder generatedKeyHolder) throws DataAccessException;

    int update(String sql, @Nullable PreparedStatementSetter pss) throws DataAccessException;

    int update(String sql, Object[] args, int[] argTypes) throws DataAccessException;

    int update(String sql, @Nullable Object... args) throws DataAccessException;

    @Nullable
    <T> T execute(CallableStatementCreator csc, CallableStatementCallback<T> action) throws DataAccessException;

    @Nullable
    <T> T execute(String callString, CallableStatementCallback<T> action) throws DataAccessException;
}
