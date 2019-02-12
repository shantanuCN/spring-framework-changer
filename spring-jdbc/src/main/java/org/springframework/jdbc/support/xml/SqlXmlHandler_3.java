package org.springframework.jdbc.support.xml;

import java.io.InputStream;
import java.io.Reader;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import org.w3c.dom.Document;
import org.springframework.lang.Nullable;

public interface SqlXmlHandler_3 {
    SqlXmlValue newSqlXmlValue(String value);

    SqlXmlValue newSqlXmlValue(XmlBinaryStreamProvider provider);

    SqlXmlValue newSqlXmlValue(XmlCharacterStreamProvider provider);

    SqlXmlValue newSqlXmlValue(Class<? extends Result> resultClass, XmlResultProvider provider);

    SqlXmlValue newSqlXmlValue(Document doc);
}
