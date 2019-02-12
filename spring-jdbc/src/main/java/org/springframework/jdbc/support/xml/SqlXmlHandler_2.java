package org.springframework.jdbc.support.xml;

import java.io.InputStream;
import java.io.Reader;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import org.w3c.dom.Document;
import org.springframework.lang.Nullable;

public interface SqlXmlHandler_2 {
    @Nullable
    InputStream getXmlAsBinaryStream(ResultSet rs, String columnName) throws SQLException;

    @Nullable
    InputStream getXmlAsBinaryStream(ResultSet rs, int columnIndex) throws SQLException;
}
