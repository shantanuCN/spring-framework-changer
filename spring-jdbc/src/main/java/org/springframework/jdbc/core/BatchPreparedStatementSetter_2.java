package org.springframework.jdbc.core;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public interface BatchPreparedStatementSetter_2 {
    void setValues(PreparedStatement ps, int i) throws SQLException;
}
