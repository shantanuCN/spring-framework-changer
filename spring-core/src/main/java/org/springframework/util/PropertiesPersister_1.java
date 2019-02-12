package org.springframework.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

public interface PropertiesPersister_1 {
    void load(Properties props, InputStream is) throws IOException;

    void load(Properties props, Reader reader) throws IOException;

    void loadFromXml(Properties props, InputStream is) throws IOException;
}
