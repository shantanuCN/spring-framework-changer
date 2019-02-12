package org.springframework.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Properties;

public interface PropertiesPersister_2 {
    void store(Properties props, OutputStream os, String header) throws IOException;

    void store(Properties props, Writer writer, String header) throws IOException;
}
