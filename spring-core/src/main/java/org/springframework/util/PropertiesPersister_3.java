package org.springframework.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

public interface PropertiesPersister_3 {
    void storeToXml(Properties props, OutputStream os, String header) throws IOException;

    void storeToXml(Properties props, OutputStream os, String header, String encoding) throws IOException;
}
