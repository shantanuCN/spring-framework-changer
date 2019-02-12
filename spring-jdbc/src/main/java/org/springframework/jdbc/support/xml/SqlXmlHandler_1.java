package org.springframework.jdbc.support.xml;

import java.io.InputStream;
import java.io.Reader;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import org.w3c.dom.Document;
import org.springframework.lang.Nullable;

public interface SqlXmlHandler_1 {
    @Nullable
    String getXmlAsString(ResultSet rs, String columnName) throws SQLException;

    @Nullable
    String getXmlAsString(ResultSet rs, int columnIndex) throws SQLException;
}
