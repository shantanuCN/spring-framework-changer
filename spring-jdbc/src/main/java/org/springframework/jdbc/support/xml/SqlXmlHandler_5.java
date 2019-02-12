package org.springframework.jdbc.support.xml;

import java.io.InputStream;
import java.io.Reader;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import org.w3c.dom.Document;
import org.springframework.lang.Nullable;

public interface SqlXmlHandler_5 {
    @Nullable
    Source getXmlAsSource(ResultSet rs, String columnName, @Nullable Class<? extends Source> sourceClass)
            throws SQLException;

    @Nullable
    Source getXmlAsSource(ResultSet rs, int columnIndex, @Nullable Class<? extends Source> sourceClass)
            throws SQLException;
}
