/*
 * Copyright 2002-2018 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.jdbc.core;

import java.util.Collection;
import org.springframework.jdbc.core.JdbcOperations_1;
import java.util.List;
import org.springframework.jdbc.core.JdbcOperations_2;
import java.util.Map;

import org.springframework.dao.DataAccessException;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.lang.Nullable;

/**
 * Interface specifying a basic set of JDBC operations.
 * Implemented by {@link JdbcTemplate}. Not often used directly, but a useful
 * option to enhance testability, as it can easily be mocked or stubbed.
 *
 * <p>Alternatively, the standard JDBC infrastructure can be mocked.
 * However, mocking this interface constitutes significantly less work.
 * As an alternative to a mock objects approach to testing data access code,
 * consider the powerful integration testing support provided in the
 * {@code org.springframework.test} package, shipped in
 * {@code spring-test.jar}.
 *
 * @author Rod Johnson
 * @author Juergen Hoeller
 * @see JdbcTemplate
 */
public interface JdbcOperations extends JdbcOperations_2, JdbcOperations_1 {

	//-------------------------------------------------------------------------
	// Methods dealing with a plain java.sql.Connection
	//-------------------------------------------------------------------------

	


	//-------------------------------------------------------------------------
	// Methods dealing with static SQL (java.sql.Statement)
	//-------------------------------------------------------------------------

	/**
	 * Execute a query given static SQL, mapping a single result row to a Java
	 * object via a RowMapper.
	 * <p>Uses a JDBC Statement, not a PreparedStatement. If you want to
	 * execute a static query with a PreparedStatement, use the overloaded
	 * {@link #queryForObject(String, RowMapper, Object...)} method with
	 * {@code null} as argument array.
	 * @param sql the SQL query to execute
	 * @param rowMapper object that will map one object per row
	 * @return the single mapped object (may be {@code null} if the given
	 * {@link RowMapper} returned {@code} null)
	 * @throws IncorrectResultSizeDataAccessException if the query does not
	 * return exactly one row
	 * @throws DataAccessException if there is any problem executing the query
	 * @see #queryForObject(String, Object[], RowMapper)
	 */
	@Nullable
	<T> T queryForObject(String sql, RowMapper<T> rowMapper) throws DataAccessException;

	/**
	 * Execute a query for a result object, given static SQL.
	 * <p>Uses a JDBC Statement, not a PreparedStatement. If you want to
	 * execute a static query with a PreparedStatement, use the overloaded
	 * {@link #queryForObject(String, Class, Object...)} method with
	 * {@code null} as argument array.
	 * <p>This method is useful for running static SQL with a known outcome.
	 * The query is expected to be a single row/single column query; the returned
	 * result will be directly mapped to the corresponding object type.
	 * @param sql the SQL query to execute
	 * @param requiredType the type that the result object is expected to match
	 * @return the result object of the required type, or {@code null} in case of SQL NULL
	 * @throws IncorrectResultSizeDataAccessException if the query does not return
	 * exactly one row, or does not return exactly one column in that row
	 * @throws DataAccessException if there is any problem executing the query
	 * @see #queryForObject(String, Object[], Class)
	 */
	@Nullable
	<T> T queryForObject(String sql, Class<T> requiredType) throws DataAccessException;

	/**
	 * Execute a query for a result Map, given static SQL.
	 * <p>Uses a JDBC Statement, not a PreparedStatement. If you want to
	 * execute a static query with a PreparedStatement, use the overloaded
	 * {@link #queryForMap(String, Object...)} method with {@code null}
	 * as argument array.
	 * <p>The query is expected to be a single row query; the result row will be
	 * mapped to a Map (one entry for each column, using the column name as the key).
	 * @param sql the SQL query to execute
	 * @return the result Map (one entry for each column, using the
	 * column name as the key)
	 * @throws IncorrectResultSizeDataAccessException if the query does not
	 * return exactly one row
	 * @throws DataAccessException if there is any problem executing the query
	 * @see #queryForMap(String, Object[])
	 * @see ColumnMapRowMapper
	 */
	Map<String, Object> queryForMap(String sql) throws DataAccessException;

	/**
	 * Execute a query for a result list, given static SQL.
	 * <p>Uses a JDBC Statement, not a PreparedStatement. If you want to
	 * execute a static query with a PreparedStatement, use the overloaded
	 * {@code queryForList} method with {@code null} as argument array.
	 * <p>The results will be mapped to a List (one entry for each row) of
	 * result objects, each of them matching the specified element type.
	 * @param sql the SQL query to execute
	 * @param elementType the required type of element in the result list
	 * (for example, {@code Integer.class})
	 * @return a List of objects that match the specified element type
	 * @throws DataAccessException if there is any problem executing the query
	 * @see #queryForList(String, Object[], Class)
	 * @see SingleColumnRowMapper
	 */
	<T> List<T> queryForList(String sql, Class<T> elementType) throws DataAccessException;

	/**
	 * Execute a query for a result list, given static SQL.
	 * <p>Uses a JDBC Statement, not a PreparedStatement. If you want to
	 * execute a static query with a PreparedStatement, use the overloaded
	 * {@code queryForList} method with {@code null} as argument array.
	 * <p>The results will be mapped to a List (one entry for each row) of
	 * Maps (one entry for each column using the column name as the key).
	 * Each element in the list will be of the form returned by this interface's
	 * queryForMap() methods.
	 * @param sql the SQL query to execute
	 * @return an List that contains a Map per row
	 * @throws DataAccessException if there is any problem executing the query
	 * @see #queryForList(String, Object[])
	 */
	List<Map<String, Object>> queryForList(String sql) throws DataAccessException;

	/**
	 * Execute a query for a SqlRowSet, given static SQL.
	 * <p>Uses a JDBC Statement, not a PreparedStatement. If you want to
	 * execute a static query with a PreparedStatement, use the overloaded
	 * {@code queryForRowSet} method with {@code null} as argument array.
	 * <p>The results will be mapped to an SqlRowSet which holds the data in a
	 * disconnected fashion. This wrapper will translate any SQLExceptions thrown.
	 * <p>Note that, for the default implementation, JDBC RowSet support needs to
	 * be available at runtime: by default, Sun's {@code com.sun.rowset.CachedRowSetImpl}
	 * class is used, which is part of JDK 1.5+ and also available separately as part of
	 * Sun's JDBC RowSet Implementations download (rowset.jar).
	 * @param sql the SQL query to execute
	 * @return a SqlRowSet representation (possibly a wrapper around a
	 * {@code javax.sql.rowset.CachedRowSet})
	 * @throws DataAccessException if there is any problem executing the query
	 * @see #queryForRowSet(String, Object[])
	 * @see SqlRowSetResultSetExtractor
	 * @see javax.sql.rowset.CachedRowSet
	 */
	SqlRowSet queryForRowSet(String sql) throws DataAccessException;

	


	//-------------------------------------------------------------------------
	// Methods dealing with prepared statements
	//-------------------------------------------------------------------------

	/**
	 * Query given SQL to create a prepared statement from SQL and a list
	 * of arguments to bind to the query, mapping a single result row to a
	 * Java object via a RowMapper.
	 * @param sql the SQL query to execute
	 * @param args arguments to bind to the query
	 * (leaving it to the PreparedStatement to guess the corresponding SQL type)
	 * @param argTypes the SQL types of the arguments
	 * (constants from {@code java.sql.Types})
	 * @param rowMapper object that will map one object per row
	 * @return the single mapped object (may be {@code null} if the given
	 * {@link RowMapper} returned {@code} null)
	 * @throws IncorrectResultSizeDataAccessException if the query does not
	 * return exactly one row
	 * @throws DataAccessException if the query fails
	 */
	@Nullable
	<T> T queryForObject(String sql, Object[] args, int[] argTypes, RowMapper<T> rowMapper)
			throws DataAccessException;

	/**
	 * Query given SQL to create a prepared statement from SQL and a list
	 * of arguments to bind to the query, mapping a single result row to a
	 * Java object via a RowMapper.
	 * @param sql the SQL query to execute
	 * @param args arguments to bind to the query
	 * (leaving it to the PreparedStatement to guess the corresponding SQL type);
	 * may also contain {@link SqlParameterValue} objects which indicate not
	 * only the argument value but also the SQL type and optionally the scale
	 * @param rowMapper object that will map one object per row
	 * @return the single mapped object (may be {@code null} if the given
	 * {@link RowMapper} returned {@code} null)
	 * @throws IncorrectResultSizeDataAccessException if the query does not
	 * return exactly one row
	 * @throws DataAccessException if the query fails
	 */
	@Nullable
	<T> T queryForObject(String sql, Object[] args, RowMapper<T> rowMapper) throws DataAccessException;

	/**
	 * Query given SQL to create a prepared statement from SQL and a list
	 * of arguments to bind to the query, mapping a single result row to a
	 * Java object via a RowMapper.
	 * @param sql the SQL query to execute
	 * @param rowMapper object that will map one object per row
	 * @param args arguments to bind to the query
	 * (leaving it to the PreparedStatement to guess the corresponding SQL type);
	 * may also contain {@link SqlParameterValue} objects which indicate not
	 * only the argument value but also the SQL type and optionally the scale
	 * @return the single mapped object (may be {@code null} if the given
	 * {@link RowMapper} returned {@code} null)
	 * @throws IncorrectResultSizeDataAccessException if the query does not
	 * return exactly one row
	 * @throws DataAccessException if the query fails
	 * @since 3.0.1
	 */
	@Nullable
	<T> T queryForObject(String sql, RowMapper<T> rowMapper, @Nullable Object... args) throws DataAccessException;

	/**
	 * Query given SQL to create a prepared statement from SQL and a
	 * list of arguments to bind to the query, expecting a result object.
	 * <p>The query is expected to be a single row/single column query; the returned
	 * result will be directly mapped to the corresponding object type.
	 * @param sql the SQL query to execute
	 * @param args arguments to bind to the query
	 * @param argTypes the SQL types of the arguments
	 * (constants from {@code java.sql.Types})
	 * @param requiredType the type that the result object is expected to match
	 * @return the result object of the required type, or {@code null} in case of SQL NULL
	 * @throws IncorrectResultSizeDataAccessException if the query does not return
	 * exactly one row, or does not return exactly one column in that row
	 * @throws DataAccessException if the query fails
	 * @see #queryForObject(String, Class)
	 * @see java.sql.Types
	 */
	@Nullable
	<T> T queryForObject(String sql, Object[] args, int[] argTypes, Class<T> requiredType)
			throws DataAccessException;

	/**
	 * Query given SQL to create a prepared statement from SQL and a
	 * list of arguments to bind to the query, expecting a result object.
	 * <p>The query is expected to be a single row/single column query; the returned
	 * result will be directly mapped to the corresponding object type.
	 * @param sql the SQL query to execute
	 * @param args arguments to bind to the query
	 * (leaving it to the PreparedStatement to guess the corresponding SQL type);
	 * may also contain {@link SqlParameterValue} objects which indicate not
	 * only the argument value but also the SQL type and optionally the scale
	 * @param requiredType the type that the result object is expected to match
	 * @return the result object of the required type, or {@code null} in case of SQL NULL
	 * @throws IncorrectResultSizeDataAccessException if the query does not return
	 * exactly one row, or does not return exactly one column in that row
	 * @throws DataAccessException if the query fails
	 * @see #queryForObject(String, Class)
	 */
	@Nullable
	<T> T queryForObject(String sql, Object[] args, Class<T> requiredType) throws DataAccessException;

	/**
	 * Query given SQL to create a prepared statement from SQL and a
	 * list of arguments to bind to the query, expecting a result object.
	 * <p>The query is expected to be a single row/single column query; the returned
	 * result will be directly mapped to the corresponding object type.
	 * @param sql the SQL query to execute
	 * @param requiredType the type that the result object is expected to match
	 * @param args arguments to bind to the query
	 * (leaving it to the PreparedStatement to guess the corresponding SQL type);
	 * may also contain {@link SqlParameterValue} objects which indicate not
	 * only the argument value but also the SQL type and optionally the scale
	 * @return the result object of the required type, or {@code null} in case of SQL NULL
	 * @throws IncorrectResultSizeDataAccessException if the query does not return
	 * exactly one row, or does not return exactly one column in that row
	 * @throws DataAccessException if the query fails
	 * @since 3.0.1
	 * @see #queryForObject(String, Class)
	 */
	@Nullable
	<T> T queryForObject(String sql, Class<T> requiredType, @Nullable Object... args) throws DataAccessException;

	/**
	 * Query given SQL to create a prepared statement from SQL and a
	 * list of arguments to bind to the query, expecting a result Map.
	 * <p>The query is expected to be a single row query; the result row will be
	 * mapped to a Map (one entry for each column, using the column name as the key).
	 * @param sql the SQL query to execute
	 * @param args arguments to bind to the query
	 * @param argTypes the SQL types of the arguments
	 * (constants from {@code java.sql.Types})
	 * @return the result Map (one entry for each column, using the
	 * column name as the key)
	 * @throws IncorrectResultSizeDataAccessException if the query does not
	 * return exactly one row
	 * @throws DataAccessException if the query fails
	 * @see #queryForMap(String)
	 * @see ColumnMapRowMapper
	 * @see java.sql.Types
	 */
	Map<String, Object> queryForMap(String sql, Object[] args, int[] argTypes) throws DataAccessException;

	/**
	 * Query given SQL to create a prepared statement from SQL and a
	 * list of arguments to bind to the query, expecting a result Map.
	 * The queryForMap() methods defined by this interface are appropriate
	 * when you don't have a domain model. Otherwise, consider using
	 * one of the queryForObject() methods.
	 * <p>The query is expected to be a single row query; the result row will be
	 * mapped to a Map (one entry for each column, using the column name as the key).
	 * @param sql the SQL query to execute
	 * @param args arguments to bind to the query
	 * (leaving it to the PreparedStatement to guess the corresponding SQL type);
	 * may also contain {@link SqlParameterValue} objects which indicate not
	 * only the argument value but also the SQL type and optionally the scale
	 * @return the result Map (one entry for each column, using the
	 * column name as the key)
	 * @throws IncorrectResultSizeDataAccessException if the query does not
	 * return exactly one row
	 * @throws DataAccessException if the query fails
	 * @see #queryForMap(String)
	 * @see ColumnMapRowMapper
	 */
	Map<String, Object> queryForMap(String sql, @Nullable Object... args) throws DataAccessException;

	/**
	 * Query given SQL to create a prepared statement from SQL and a
	 * list of arguments to bind to the query, expecting a result list.
	 * <p>The results will be mapped to a List (one entry for each row) of
	 * result objects, each of them matching the specified element type.
	 * @param sql the SQL query to execute
	 * @param args arguments to bind to the query
	 * @param argTypes the SQL types of the arguments
	 * (constants from {@code java.sql.Types})
	 * @param elementType the required type of element in the result list
	 * (for example, {@code Integer.class})
	 * @return a List of objects that match the specified element type
	 * @throws DataAccessException if the query fails
	 * @see #queryForList(String, Class)
	 * @see SingleColumnRowMapper
	 */
	<T>List<T> queryForList(String sql, Object[] args, int[] argTypes, Class<T> elementType)
			throws DataAccessException;

	/**
	 * Query given SQL to create a prepared statement from SQL and a
	 * list of arguments to bind to the query, expecting a result list.
	 * <p>The results will be mapped to a List (one entry for each row) of
	 * result objects, each of them matching the specified element type.
	 * @param sql the SQL query to execute
	 * @param args arguments to bind to the query
	 * (leaving it to the PreparedStatement to guess the corresponding SQL type);
	 * may also contain {@link SqlParameterValue} objects which indicate not
	 * only the argument value but also the SQL type and optionally the scale
	 * @param elementType the required type of element in the result list
	 * (for example, {@code Integer.class})
	 * @return a List of objects that match the specified element type
	 * @throws DataAccessException if the query fails
	 * @see #queryForList(String, Class)
	 * @see SingleColumnRowMapper
	 */
	<T> List<T> queryForList(String sql, Object[] args, Class<T> elementType) throws DataAccessException;

	/**
	 * Query given SQL to create a prepared statement from SQL and a
	 * list of arguments to bind to the query, expecting a result list.
	 * <p>The results will be mapped to a List (one entry for each row) of
	 * result objects, each of them matching the specified element type.
	 * @param sql the SQL query to execute
	 * @param elementType the required type of element in the result list
	 * (for example, {@code Integer.class})
	 * @param args arguments to bind to the query
	 * (leaving it to the PreparedStatement to guess the corresponding SQL type);
	 * may also contain {@link SqlParameterValue} objects which indicate not
	 * only the argument value but also the SQL type and optionally the scale
	 * @return a List of objects that match the specified element type
	 * @throws DataAccessException if the query fails
	 * @since 3.0.1
	 * @see #queryForList(String, Class)
	 * @see SingleColumnRowMapper
	 */
	<T> List<T> queryForList(String sql, Class<T> elementType, @Nullable Object... args) throws DataAccessException;

	/**
	 * Query given SQL to create a prepared statement from SQL and a
	 * list of arguments to bind to the query, expecting a result list.
	 * <p>The results will be mapped to a List (one entry for each row) of
	 * Maps (one entry for each column, using the column name as the key).
	 * Thus  Each element in the list will be of the form returned by this interface's
	 * queryForMap() methods.
	 * @param sql the SQL query to execute
	 * @param args arguments to bind to the query
	 * @param argTypes the SQL types of the arguments
	 * (constants from {@code java.sql.Types})
	 * @return a List that contains a Map per row
	 * @throws DataAccessException if the query fails
	 * @see #queryForList(String)
	 * @see java.sql.Types
	 */
	List<Map<String, Object>> queryForList(String sql, Object[] args, int[] argTypes) throws DataAccessException;

	/**
	 * Query given SQL to create a prepared statement from SQL and a
	 * list of arguments to bind to the query, expecting a result list.
	 * <p>The results will be mapped to a List (one entry for each row) of
	 * Maps (one entry for each column, using the column name as the key).
	 * Each element in the list will be of the form returned by this interface's
	 * queryForMap() methods.
	 * @param sql the SQL query to execute
	 * @param args arguments to bind to the query
	 * (leaving it to the PreparedStatement to guess the corresponding SQL type);
	 * may also contain {@link SqlParameterValue} objects which indicate not
	 * only the argument value but also the SQL type and optionally the scale
	 * @return a List that contains a Map per row
	 * @throws DataAccessException if the query fails
	 * @see #queryForList(String)
	 */
	List<Map<String, Object>> queryForList(String sql, @Nullable Object... args) throws DataAccessException;

	/**
	 * Query given SQL to create a prepared statement from SQL and a
	 * list of arguments to bind to the query, expecting a SqlRowSet.
	 * <p>The results will be mapped to an SqlRowSet which holds the data in a
	 * disconnected fashion. This wrapper will translate any SQLExceptions thrown.
	 * <p>Note that, for the default implementation, JDBC RowSet support needs to
	 * be available at runtime: by default, Sun's {@code com.sun.rowset.CachedRowSetImpl}
	 * class is used, which is part of JDK 1.5+ and also available separately as part of
	 * Sun's JDBC RowSet Implementations download (rowset.jar).
	 * @param sql the SQL query to execute
	 * @param args arguments to bind to the query
	 * @param argTypes the SQL types of the arguments
	 * (constants from {@code java.sql.Types})
	 * @return a SqlRowSet representation (possibly a wrapper around a
	 * {@code javax.sql.rowset.CachedRowSet})
	 * @throws DataAccessException if there is any problem executing the query
	 * @see #queryForRowSet(String)
	 * @see SqlRowSetResultSetExtractor
	 * @see javax.sql.rowset.CachedRowSet
	 * @see java.sql.Types
	 */
	SqlRowSet queryForRowSet(String sql, Object[] args, int[] argTypes) throws DataAccessException;

	/**
	 * Query given SQL to create a prepared statement from SQL and a
	 * list of arguments to bind to the query, expecting a SqlRowSet.
	 * <p>The results will be mapped to an SqlRowSet which holds the data in a
	 * disconnected fashion. This wrapper will translate any SQLExceptions thrown.
	 * <p>Note that, for the default implementation, JDBC RowSet support needs to
	 * be available at runtime: by default, Sun's {@code com.sun.rowset.CachedRowSetImpl}
	 * class is used, which is part of JDK 1.5+ and also available separately as part of
	 * Sun's JDBC RowSet Implementations download (rowset.jar).
	 * @param sql the SQL query to execute
	 * @param args arguments to bind to the query
	 * (leaving it to the PreparedStatement to guess the corresponding SQL type);
	 * may also contain {@link SqlParameterValue} objects which indicate not
	 * only the argument value but also the SQL type and optionally the scale
	 * @return a SqlRowSet representation (possibly a wrapper around a
	 * {@code javax.sql.rowset.CachedRowSet})
	 * @throws DataAccessException if there is any problem executing the query
	 * @see #queryForRowSet(String)
	 * @see SqlRowSetResultSetExtractor
	 * @see javax.sql.rowset.CachedRowSet
	 */
	SqlRowSet queryForRowSet(String sql, @Nullable Object... args) throws DataAccessException;

	


	//-------------------------------------------------------------------------
	// Methods dealing with callable statements
	//-------------------------------------------------------------------------

	/**
	 * Execute a SQL call using a CallableStatementCreator to provide SQL and any
	 * required parameters.
	 * @param csc object that provides SQL and any necessary parameters
	 * @param declaredParameters list of declared SqlParameter objects
	 * @return a Map of extracted out parameters
	 * @throws DataAccessException if there is any problem issuing the update
	 */
	Map<String, Object> call(CallableStatementCreator csc, List<SqlParameter> declaredParameters)
			throws DataAccessException;

}
